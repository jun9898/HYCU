#include <stdio.h>

// int main()
// {
//     int a = 10;
//     int b = 20;

//     printf("%d %d\n", a, b); // a�� b�� ���� ����Ѵ�.
//     printf("%p %p\n", &a, &b); // a�� b�� �ּҸ� ����Ѵ�.
// }

// int main()
// {
//     int a = 10;
//     int b = 20;

//     printf("%d %d\n", a, b); // a�� b�� ���� ����Ѵ�.
//     printf("%x %X\n", a, a); // a�� 16������ ��ȯ�Ͽ� ����Ѵ�.
//     printf("%p %p\n", &a, &b); // a�� b�� �ּҸ� ����Ѵ�.
//     printf("%x %X\n", &a, &b); // a�� 16������ �ּҸ� 16������ ��ȯ�Ͽ� ����Ѵ�.
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
    printf("���� �Է��ϼ��� : ");
    scanf("%d", &n);
    if (n%2 == 0) 
        printf("¦��\n");
    else
        printf("Ȧ��\n");
}