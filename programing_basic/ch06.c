#include <stdio.h>

// int main()
// {
//     printf("%o\n", 156);
// }

// int main()
// {
//     printf("%o\n", 0xA4D);
// }

// int main()
// {
//     int n;
//     printf("점수를 입력하세요.\n");
//     scanf("%d", &n);
//     printf("당신의 16진수 주소는 %p 이고, 점수는 %d 입니다.\n",&n,n);
// }

// int main()
// {
//     int a = 10, b = 3;
//     printf("%d\n", a+b); // 더하기
//     printf("%d\n", a-b); // 빼기
//     printf("%d\n", a*b); // 곱하기
//     printf("%d\n", a/b); // 나누기
//     printf("%d\n", a%b); // 나머지
// }

// int main()
// {
//     double a = 10, b = 3;
//     double c = a/b;
//     printf("%5.2f\n", c); // 5번째 자리까지, 소수 2번째 자리까지 출력
// }

// int main()
// {
//     int a = 10, b = 5, temp = 0;
//     printf("a = %d b = %d temp = %d\n", a, b, temp);
//     // a = 10 b = 5 temp = 0

//     temp = a;

//     printf("a = %d b = %d temp = %d\n", a, b, temp);
//     // a = 10 b = 5 temp = 10

//     a = b;

//     printf("a = %d b = %d temp = %d\n", a, b, temp);
//     // a = 5 b = 5 temp = 10

//     b = temp;

//     printf("a = %d b = %d temp = %d\n", a, b, temp);
//     // a = 5 b = 10 temp = 10
// }

// int main()
// {
//     int a = 10;
//     int r = 0;

//     r=++a; // a를 먼저 1 증가시킨 후에 r에 대입해준다.
//     printf("%d\n", a);
//     printf("%d\n", r);
// }

int main()
{
    int a = 10;
    int r = 0;

    r=a++; // 먼저 r에 대입해준뒤 a의 값을 1 증가시킨다.
    printf("%d\n", a);
    printf("%d\n", r);
}