import java.util.ArrayList;
import java.util.Stack;

public class T05 {
    public static void main(String[] args) {
        ArrayList<String> fruitArrayList = new ArrayList<>();
        fruitArrayList.add("Apple");
        fruitArrayList.add("Orage");
        fruitArrayList.add("Banana");

        for(String f1 : fruitArrayList) {
            System.out.println(f1);
        }
        System.out.println();

        Stack<String> fruitStack = new Stack<>();
        fruitStack.push("Apple");
        fruitStack.push("Orange");
        fruitStack.push("Banana");

        for(String f2 : fruitStack) {
            System.out.println(f2);
        }


    }
}