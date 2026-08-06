package Coginzant;

public class question8 {
    static void main() {

        System.out.println(partyMode(45));
    }

    public static int partyMode(int n) {
        int mask = (1 << 0) | (1 << 2) | (1 << 4);
        return n ^ mask;
    }
}
