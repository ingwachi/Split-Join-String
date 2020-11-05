import java.util.Scanner;

public class Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your string to split: ");
            String string = sc.nextLine();
            if (string.equals("x")) {
                break;
            }
            String[] array = string.split(";");
            for (int i = 0 ; i < array.length ; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
