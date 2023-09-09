# for i in range(1,11,1):
#     print(i)

# i = 0
# while (True):
#     i += 1
#     if i > 10:
#         break
#     if i%2 ==0:
#         continue
#     print(i)

# a = int(input('a = '))
# if a >= 150:
#     print("입장가능")
# else :
#     print("입장불가능")

# import random as rd
# while True:
#     you = int(input())
#     nd = rd.randint(0,1)
#     if you < 0 or you > 1:
#         print('Wrong input end program')
#         break
#     if nd == 1 and you == nd:
#         print("정답입니다 홀수입니다")
#     elif you == nd:
#         print("정답입니다 짝수입니다")
#     else:
#         print("오답입니다.")

# def test():
#     print("test def")

# test()

func1 = lambda x:x*2
print(func1(10))

num = [1,2,3,4]
grade = ['a','b','c','d']

for i in zip(num,grade):
    print(i)










