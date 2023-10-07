from matplotlib import pyplot as plt
import numpy as np

x = np.arange(1,10)
y1 = x*3

plt.style.use('ggplot')
plt.plot(x,y1)
plt.show()