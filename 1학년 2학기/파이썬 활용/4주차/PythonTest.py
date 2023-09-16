def add(a) :
    if type(a) == int:
        print("a는 int 입니다.")
    else :
        print("a는 int가 아닙니다")

add(str(1))


func = lambda x:x*2
print(func(10))

func1 = lambda x:x**2
print(func1(10))

def get_calc(x,y) :
    return x+y,x-y,x*y,x/y

result = get_calc(2,5)

for i in result:
    print(i)

