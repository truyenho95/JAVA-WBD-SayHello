import java.util.Scanner;

public class SayHello {
  public static void main(String[] args) {
    System.out.println("Mời bạn nhập tên: ");
    String name = new Scanner(System.in).nextLine();

    System.out.println("Hello: " + name);
  }
}
