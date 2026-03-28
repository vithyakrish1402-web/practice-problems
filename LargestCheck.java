import java.util.Scanner;

public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.print("Is the first number the largest? ");
        if (num1 >= num2 && num1 >= num3) System.out.println("Yes");
        else System.out.println("No");

        System.out.print("Is the second number the largest? ");
        if (num2 >= num1 && num2 >= num3) System.out.println("Yes");
        else System.out.println("No");

        System.out.print("Is the third number the largest? ");
        if (num3 >= num1 && num3 >= num2) System.out.println("Yes");
        else System.out.println("No");

        sc.close();
    }
}