package Bit_manipluation;

public class Josephus_Algorithm {
    static void main() {
        System.out.println(solution(solution(5)));
    }
    public static int powerof2(int n){
        int i=1;
        while(i*2<=n){
            i=i*2;

        }
        return i;
    }
    public static int solution(int n){
        int hp2=powerof2(n);
        int l=n-hp2;
        return (2*l+1);
    }
}
