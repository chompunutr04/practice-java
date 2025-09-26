import java.util.Stack;

public class T03 {
    public static void main(String[] args) {
        Stack<String> companies = new Stack<>();
        companies.push("Apple");
        companies.push("Google");
        companies.push("Facebook");

        System.out.println(companies.peek());
    }
}