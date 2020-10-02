package String_Editor;
import java.util.Scanner;
public class Text_StringEditor {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your string:");
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Your string after change:" + String_Editor.convert(inputString));

    }

}
