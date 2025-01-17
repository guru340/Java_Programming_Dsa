package OOPS.staticexample;
//Outside class never be static ,only inside class are static
public class Innerclass {
   static  class Tsets{
    String name;



       public Tsets(String name) {
           this.name=name;
       }
   }

    public static void main(String[] args) {
        Tsets a =new Tsets("Kunal");
        Tsets b=new Tsets("Mayank");

        System.out.println(a.name);
        System.out.println(b.name);
    }

}
