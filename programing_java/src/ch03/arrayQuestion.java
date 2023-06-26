package ch03;

public class arrayQuestion {
    public static void main(String[] args) {
//        int i, j;
//
//        int a[][] = {{1001, 1002, 1003, 1004}, {92, 95, 97, 96},
//                {75, 95, 90, 85}, {84, 90, 89, 97}, {0, 0, 0, 0}, {0, 0, 0, 0}};
//
//        for (i = 0; i < 4; i++) {
//            for (j = 1; j <= 3; j++)
//                a[4][i] += a[j][i];
//            a[5][i] = a[4][i] / 3;
//        }
//        System.out.println("학번 국어 수학 영어 총점 평균");
//        for (i = 0; i < 4; i++) {
//            for (j = 0; j < 6; j++)
//                System.out.print(a[j][i] + " ");
//            System.out.println();
//        }
        int i, j;

        int [][] a = {{1},{1,2,1},{1,0,0,1},{1,0,0,0,1},{1,0,0,0,0,1}};
        for (i=2;i<5;i++)
            for (j=1;j<=i;j++)
                a[i][j] = a[i-1][j-1] + a[i-1][j];

        for (i=0; i<5; i++){
            for (j=0;j<a[i].length;j++)
                System.out.print(a[i][j]+ " ");
            System.out.println();

            //왜 커밋이 안되징
            //commit Test

        }
    }
}
