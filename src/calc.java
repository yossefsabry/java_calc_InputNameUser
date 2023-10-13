import java.util.*;

public class calc {
    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            long num1;
            long num2;
            char ch;

            System.out.print("Enter The First Nubmer : ");
            num1 = obj.nextLong();
            System.out.print("Enter The Second Nubmer : ");
            num2 = obj.nextLong();

            System.out.print("Enter The Operation : ");
            ch = obj.next().charAt(0);

            switch (ch) {
                case '+':
                    System.out.print("The Results : " + (num1 + num2) + "");
                    break;
                case '-':
                    System.out.print("The Results : " + (num1 - num2) + "");
                    break;
                case '*':
                    System.out.print("The Results : " + (num1 * num2) + "");
                    break;
                case '/':
                    System.out.print("The Results : " + (num1 / num2) + "");
                    break;
                default:
                    System.out.print("NOT VAILD...");
            }
        }
    }
}