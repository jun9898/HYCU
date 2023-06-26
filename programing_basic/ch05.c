// #include <stdio.h>
// #include <stdlib.h>

// int main()
// {
//     printf("Hello");
//     printf("He\nll\no");
//     printf("Hello");
// }

// int main()
// {
    // printf("100\n");
    // printf("5.5\n");
    // printf("%d\n", 100);
    // printf("%g\n", 5);
    // printf("%d %d\n", 10, 20);
// }

// int main()
// {
//     printf("%d + %d = %d\n", 10, 20, 30);
//     printf("%d + %d = %d\n", 10, 20, 10+20);
// }

// int main()
// {
//     printf("%d\n", 10);
//     printf("%c\n", 65);
//     printf("%g\n", 10.0);
// }

// int main()
// {
//     int a = 50;
//     int b = 10;

//     int temp = a;
//     a = b;
//     b = temp;

//     printf("%d\n", a);
//     printf("%d\n", b);
// }
#include <stdio.h>

int main() {
    unsigned int x = 1;
    char *c = (char*) &x;
    if (*c) {
        printf("리틀 엔디안입니다.\n");
    } else {
        printf("빅 엔디안입니다.\n");
    }
    return 0;
}
