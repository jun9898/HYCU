import pandas as pd

s1 = pd.Series([99,100,88,100]).index=["a","b","c","d"] #list
s2 = pd.Series((99,100,88,100)).index=["a","b","c","d"] #tuple
s3 = pd.Series({'k1':99,'k2':100}) #dict