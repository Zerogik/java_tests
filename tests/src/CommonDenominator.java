import java.util.Scanner;

public class CommonDenominator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("сколько дробей привести к общему знаменателю?");
        int n = scn.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        if (n < 2) {
            System.out.println("Должно быть более одной дроби!! попробуй еще раз!!");
            System.exit(1);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("введи числитель " + (i + 1) + "  дроби");
            x[i] = scn.nextInt();
            System.out.println("введи знаменатель " + (i + 1) + " дроби");
            y[i] = scn.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + "/" + y[i] + "     ");
        }
        System.out.println();
        System.out.println("==");
        System.out.println();
        int[] numerator = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            int a = x[i];
            for (int h = 0; h < y.length; h++) {
                if (h == i) {
                    continue;
                }
                a *= y[h];
            }
            numerator[i] = a;
        }
        int denominator = y[0];
        for (int i = 1; i < n; i++) {
            denominator *= y[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numerator[i] + " ; ");
        }
        System.out.println();
        System.out.println("------------");
        System.out.println("    " + denominator);

    }

}
