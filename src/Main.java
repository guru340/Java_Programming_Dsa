import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i==2 || i==5 || i==6 || i==9){
                count++;
            }
        }

        System.out.println(count);
    }
}