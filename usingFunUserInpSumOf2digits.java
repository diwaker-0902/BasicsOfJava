import java.util.*;

public class usingFunUserInpSumOf2digits {

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first value : ");
        int a = sc.nextInt();
        System.out.print("Enter the second value : ");
        int b = sc.nextInt();

        int sum = addition(a, b);

        System.out.println("Sum of two digits : " + sum);

    }

}
