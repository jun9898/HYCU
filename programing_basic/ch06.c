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
//     printf("������ �Է��ϼ���.\n");
//     scanf("%d", &n);
//     printf("����� 16���� �ּҴ� %p �̰�, ������ %d �Դϴ�.\n",&n,n);
// }

// int main()
// {
//     int a = 10, b = 3;
//     printf("%d\n", a+b); // ���ϱ�
//     printf("%d\n", a-b); // ����
//     printf("%d\n", a*b); // ���ϱ�
//     printf("%d\n", a/b); // ������
//     printf("%d\n", a%b); // ������
// }

// int main()
// {
//     double a = 10, b = 3;
//     double c = a/b;
//     printf("%5.2f\n", c); // 5��° �ڸ�����, �Ҽ� 2��° �ڸ����� ���
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

//     r=++a; // a�� ���� 1 ������Ų �Ŀ� r�� �������ش�.
//     printf("%d\n", a);
//     printf("%d\n", r);
// }

int main()
{
    int a = 10;
    int r = 0;

    r=a++; // ���� r�� �������ص� a�� ���� 1 ������Ų��.
    printf("%d\n", a);
    printf("%d\n", r);
}