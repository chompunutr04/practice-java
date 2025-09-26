import java.util.Stack;

public class T02 {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        number.push(1);
        number.push(2);
        number.push(3);

        for(int n : number) {
            System.out.println(n);
        }

        System.out.println(number.empty());

    }
}