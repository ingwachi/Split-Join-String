import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Join {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> st = new ArrayList<>();
        System.out.print("Enter your string to join: ");
        while (true) {
            String string = sc.nextLine();
            if (string.equals("x")) {
                break;
            }
            st.add(string);
        }
        String joinedString = String.join(";", st);
        System.out.println(joinedString);
    }
}
