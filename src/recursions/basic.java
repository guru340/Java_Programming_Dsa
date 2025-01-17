package recursions;

//public class basic {
//    public static void main(String[] args) {
////        Write fucntion to five number
////        debug the code for better Understanding the working of fiunction calls
//        print1(1);
//    }
//
//    static void print1(int n) {
//        System.out.println(n);
//        print2(2);
//    }
//
//    static void print2(int n) {
//        System.out.println(n);
//        print3(3);
//
//    }
//
//    static void print3(int n) {
//        System.out.println(n);
//        print4(4);
//    }
//
//    static void print4(int n) {
//        System.out.println(n);
//        print5(5);
//    }
//
//    static void print5(int n) {
//        System.out.println(n);
//
//    }
//}
//


//Now Using Recursions
public class basic{
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n){
        System.out.println(n);
        print1(n+1);
    }
}