import java.util.Scanner;
public class Task2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку:");
        String a = in.nextLine();
        System.out.print("Введите вторую строку:");
        String b = in.nextLine();
        in.close();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else{
            System.out.println("Строки неидентичны");
        }
    }
}