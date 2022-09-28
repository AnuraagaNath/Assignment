import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number1: ");
        int a = sc.nextInt();
        System.out.println("Number2: ");
        int b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped Number1: "+ a);
        System.out.println("Swapped Number2: "+ b);
    }
}
