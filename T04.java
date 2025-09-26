import java.util.Stack;

public class T04 {
    public static void main(String[] args) {
        Stack<String> devices = new Stack<>();
        devices.push("Monitor");
        devices.push("Mouse");
        devices.push("Keyboard");

        for(String d : devices) {
            System.out.println(d);
        }

        System.out.println(devices.search("Monitor"));

        devices.pop();

        for(String d : devices) {
            System.out.println(d);
        }

        System.out.println(devices.search("Monitor"));

    }
}