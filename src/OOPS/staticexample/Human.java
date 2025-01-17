package OOPS.staticexample;

public class Human {
    int age;
    int salary;
    String name;
    boolean married;
   static long population;
        static void meess(){
            System.out.println("hello world");
//            System.out.println(this.age);
//            you cannot use this bcz it same like as you are using a static from non-static
        }


    public Human(int age, int salary, String name, boolean married) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.married = married;
        Human.population+=1;
    }
}
