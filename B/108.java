import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] limits = new int[n];
        for(int i = 0; i < n; i++){
            limits[i] = scan.nextInt();
        }
        
        int[] sum = new int[n];
        for(int i = 0; i < n; i++){
            sum[i] = 0;
        }

        int index = 0;
        for(int i = 0; i < m; i++){
            int b = scan.nextInt();
            
            do{
                sum[index] += Math.min(limits[index], b);
                b -= limits[index];
                index = (index+1)%limits.length;
            }while(b > 0);
        }

        for(int x : sum){
            System.out.println(x);
        }

    }
}
