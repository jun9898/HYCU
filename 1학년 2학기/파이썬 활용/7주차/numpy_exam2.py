import numpy as np
import random

def make_array(n):
    a = np.array([])
    for i in range(n):
        a = np.append(a,random.randint(1,100))
    return a

n1 = int(input(" 행 : "))
n2 = int(input(" 열 : "))
flat = n1 * n2

tmp = make_array(flat)
tmp = np.array(tmp).reshape(n1,n2)
print(tmp)
