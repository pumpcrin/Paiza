import java.util.*;

public class Test {
    public static void main(String[] args){
        System.out.print("入力>");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println(str);
        scan.close();
    }
}
