package OOPS.enumm;

public class Basic {


    enum Week implements A {
        Monday,tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;


        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void message() {
            System.out.println("How Are You...............");
        }
    }


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.message();
        for (Week day:week.values()){
            System.out.println(day);
        }

    }
}
