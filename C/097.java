import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();

        for(int i = 1; i <= n; i++){
            String s = "";
            if(i%x == 0)    s += 'A';
            if(i%y == 0)    s += 'B';
            if(s == "")     s = "N";
            System.out.println(s);
        }

    }
}
