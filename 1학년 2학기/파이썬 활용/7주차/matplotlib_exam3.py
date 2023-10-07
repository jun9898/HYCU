from matplotlib import pyplot as plt
import numpy as np

x = np.arange(1,10)
y1 = x*3
y2 = x*1.1
y3 = x*0.8
y4 = x*0.7

plt.subplot(4,1,1)
plt.plot(x,y1)
plt.subplot(4,1,2)
plt.plot(x,y2)
plt.subplot(4,1,3)
plt.plot(x,y3)
plt.subplot(4,1,4)
plt.plot(x,y4)
plt.show()