#include <stdio.h>

// int main()
// {
//     int a = 10;
//     int b = 20;

//     printf("%d %d\n", a, b); // a와 b의 값을 출력한다.
//     printf("%p %p\n", &a, &b); // a와 b의 주소를 출력한다.
// }

// int main()
// {
//     int a = 10;
//     int b = 20;

//     printf("%d %d\n", a, b); // a와 b의 값을 출력한다.
//     printf("%x %X\n", a, a); // a를 16진수로 변환하여 출력한다.
//     printf("%p %p\n", &a, &b); // a와 b의 주소를 출력한다.
//     printf("%x %X\n", &a, &b); // a를 16진수의 주소를 16진수로 변환하여 출력한다.
// }

// int main()
// {
//     int a = 5;
//     printf("%d\n", a << 0);
//     printf("%d\n", a << 1);
//     printf("%d\n", a << 2);
//     printf("%d\n", a << 3);
//     printf("%d\n", a << 4);
//     printf("%d\n", a << 100);
// }

// int main()
// {
//     int a = 5;
//     printf("%d\n", a >> 0);
//     printf("%d\n", a >> 1);
//     printf("%d\n", a >> 2);
//     printf("%d\n", a >> 3);
//     printf("%d\n", a >> 4);
//     printf("%d\n", a >> 100);
// }

// int main()
// {
//     int a = 10;
//     int b = 20;
//     int c = 10;

//     if (a != b)
//         printf("same\n");
//     else
//         printf("diff\n");

//     if (a != c)
//         printf("same\n");
//     else
//         printf("diff\n");
// }


int main()
{
    int n;
    printf("값을 입력하세요 : ");
    scanf("%d", &n);
    if (n%2 == 0) 
        printf("짝수\n");
    else
        printf("홀수\n");
}