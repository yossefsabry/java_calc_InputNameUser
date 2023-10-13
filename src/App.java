import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int width;
        int height;

        System.out.print("Enter The Width : ");
        width = obj.nextInt();
        System.out.print("Enter The Height : ");
        height = obj.nextInt();

        long area = width * height;

        System.out.println("The Area Of Reactangle : " + area);
    }
}
