package org.example;

/**
 * @ Le Nguyen Tan Alex
 */
public class AsterisksPatterns {
    public static void main(String[] args) {
        String ast = "*";
        char space = ' ';

        //Print the amount needed of * until o <= a repeat this 10 times
        for (int a = 1; a <= 10; a++){
            for (int o = 1; o <= a; o++)
                System.out.print(ast);
            System.out.println();
        }
        System.out.println(space);

        //Print the amount needed of * until p >= b repeat this 10 times
        for (int b = 1; b <= 10; b++){
            for (int p = 10; p >= b; p--)
                System.out.print(ast);
            System.out.println();
        }
        System.out.println(space);

        //Print ' ' the number of time until i > a
        for (int c = 1; c <= 10; c++){
            for (int i = 1; i < c; i++){
                System.out.print(' ');
            }
            //Print * the number of time until j <= c
            for (int j = 10; j >= c; j--){
                System.out.print(ast);
            }
            System.out.println();
        }
        System.out.println(space);

        //Print ' ' the number of time until u < d
        for (int d = 1; d <= 10; d++){
            for (int u = 10; u > d; u--){
                System.out.print(' ');
            }
            //Print * the number of time until q >= d
            for (int q = 1; q <= d; q++){
                System.out.print(ast);
            }
            System.out.println();
        }
    }
}