import java.util.Scanner;
public class switches {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.next();
        
        switch (fruit) {
            case "mango":
                System.out.println("King of the fruit");
                break;
            case "Cherry":
            System.out.println("Sweet");    
            default:
            System.out.println("You entered the wrong input");
                break;
        }
    }
}
