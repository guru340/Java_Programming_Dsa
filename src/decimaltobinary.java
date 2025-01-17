






public class decimaltobinary {
    public static void main(String[] args) {
    int n=1;
    binary(n);

    }

    static void binary(int n){
        int sum=0;
        while(n>0){
            int r=n%2;
            n=n/2;
            sum=sum*10+r;


        }
        System.out.println(sum);
    }
}
