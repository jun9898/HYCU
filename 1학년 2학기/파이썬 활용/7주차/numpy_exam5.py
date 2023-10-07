import numpy as np

arr = np.zeros([2,5])
arr1 = np.ones([2,5])
print(arr)
print(arr1)
tmp = 0
for i in np.arange(2):
    for j in np.arange(5):
        tmp += 1
        arr[i,j] = tmp

arr3 = arr.T
print(arr3)
