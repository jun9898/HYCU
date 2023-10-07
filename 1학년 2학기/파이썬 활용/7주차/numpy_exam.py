import numpy as np

def get_num():
    while True:
        print()
        print("1 : .array")
        print("2 : .arange()")
        print("3 : .linapce()")
        print("4 : .end")
        a = int(input("num : "))
        if a == 1:
            print("t=np.array([1,2,3,4,5])")
            t=np.array([1,2,3,4,5])
            print(t)
        
        elif a == 2:
            print("t=np.arange(1,6,1)")
            t=np.arange(1,6,1)
            print(t)

        elif a == 3:
            print("t=np.linspace(1,6,10)")
            t=np.linspace(1,6,10)
            print(t)

        elif a == 4:
            print("end program")
            break

        else:
            print("Wrong number(1~4)")

get_num()