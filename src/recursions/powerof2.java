package recursions;

public class powerof2 {
    public static void main(String[] args) {
        int n=6;
        System.out.println(Two(n));

    }
    static boolean Two(int n) {
        return (n > 0) && (n & (n - 1)) == 0;
    }
}
