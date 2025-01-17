package OOPS.staticexample;

public class main {
    public static void main(String[] args) {
        Human  Ashutosh =new Human(22,22000000,"Mayank",false);
        Human  Mayank =new Human(22,22000000,"Mayank",false);
        System.out.println(Human.population);
        System.out.println(Human.population);
//     In this case we get the answer 1 because it is not same for every object if we use only long population
//        But in the case of static answer will be 2 bcz it same for all obj and access through class directly
//           you cannot use anything non-static in this case of static bcz it belongs to instance or object
//        greetting();
    }

   void greetting(){
        System.out.println("hello ");
        fun();// static member can access from non-static
    }
//    this is not dependent on objects

    static void fun(){
//        greetting(); // you cant use this bcz it requires an instance
//        but the function you are using it does not depend on instances


//        we know that something which is not static,belongs to an object
        main obj=new main();
        obj.greetting();
    }

}
