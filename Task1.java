import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = in.nextInt();
        System.out.print("Введите второе число:");
        int b = in.nextInt();
        in.close();
        if (a > b) {
            System.out.println("a>b");
        } else if (a < b) {
            System.out.println("a<b");
        } else{
            System.out.println("a=b");
        }
        System.out.print(a+b+" ");
        System.out.print(a-b+" ");
        System.out.print(a*b+" ");
        System.out.print(a/b);
    }
}