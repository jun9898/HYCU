import numpy as np
import random

def make_array(n):
    a = np.array([])
    for i in range(n):
        a = np.append(a,random.randint(1,100))
    return a

def make_reshape(n1,n2):
    flat = n1 * n2
    tmp = make_array(flat)
    tmp = np.array(tmp).reshape(n1,n2)
    return tmp

n1 = int(input(" 행 : "))
n2 = int(input(" 열 : "))
t1=make_reshape(n1,n2)
print("t1 = " , t1)

n3 = int(input(" 행 : "))
n4 = int(input(" 열 : "))
t2 = make_reshape(n3,n4)
print("t2 = " , t2)

if n2 == n3:
    print("\n",np.matmul(t1,t2))
else:
    print("error")
