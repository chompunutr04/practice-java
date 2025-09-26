import java.util.Stack;

public class T01 {
    public static void main(String[] args) {
        Stack<String> fruit = new Stack<>();
        fruit.push("Apple");
        fruit.push("Banana");
        fruit.push("Cherry");
        fruit.push("Durian");
        fruit.push("Orange");

        for(String f : fruit) {
            System.out.println(f);
        }
    }
}