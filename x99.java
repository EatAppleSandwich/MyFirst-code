package aaa;

public class x99 {
    public static void main(String[] ages) {
        int i, j;
        System.out.println("九九乘法表");
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                int sum = i * j;
                System.out.print(j + "x" + i + "=" + sum + ";");
                //System.out.print(sum);
                System.out.print(" ");
                if (sum < 10) {
                    System.out.print(" ");//对齐作用
                }
            }
            System.out.println();

        }
        System.out.println();
        for (i = 9; i >= 1; i--) {
            for (j = i; j <= i && j > 0; j--) {
                int sum = i * j;
                System.out.print(j + "x" + i + "=" + sum + ";");
                //System.out.print(sum);
                System.out.print(" ");
                if (sum < 10) {
                    System.out.print(" ");
                }//对齐作用

            }
            System.out.println();
        }
//		

    }

}
