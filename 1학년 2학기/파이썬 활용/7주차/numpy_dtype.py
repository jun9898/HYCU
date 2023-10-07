import numpy as np

arr = np.array([1,2,3])
print(arr.dtype)

arr = np.array([1.1,2.2,3.3])
print(arr.dtype)

arr = np.array([1,2,3.1])
print(arr.dtype)

arr = np.array([1,2,'hi'])
print(arr.dtype)

arr = np.array([1,2.1,'hi'])
print(arr.dtype)