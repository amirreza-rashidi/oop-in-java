package e02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        Sum sum =new Sum();
        sum.print_sum(a,b);

         a=12;
         b=23;
        sum.print_sum(a,b);
    }
}
