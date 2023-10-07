import matplotlib as mpl
import matplotlib.pylab as plt
import numpy as np

labels = ['kim', 'lee','oh','jung']
sizes = [10,5,15,20]
colors = ['yellowgreen', 'gold', 'lightskyblue', 'lightcoral']

plt.pie(sizes,colors=colors,labels=labels)

plt.show()