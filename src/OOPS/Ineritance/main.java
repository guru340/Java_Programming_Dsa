package OOPS.Ineritance;

public class main {
    public static void main(String[] args) {
        Box box=new Box();
        Box box2=new Box(box);
        System.out.println(box.l+""+box.w+""+box.h);

         BoxWeight box3 =new BoxWeight();
         BoxWeight box4=new BoxWeight(2,5,6,8);
// Although a subclass includes all of the members of its superclass, it cannot access those members of the superclass
//that have been declared as private.
//        System.out.println(box3.h+""+ box3.l+""+box3.w);

//   only Parent can reference th child variables or object
/*A Superclass Variable Can Reference a Subclass Object:
It is important to understand that it is the type of the reference variable—not the type of the object that it refers
to—that determines what members can be accessed.
When a reference to a subclass object is assigned to a superclass reference variable, you will have access only to
those parts of the object defined by the superclass.
*/
        Box box5=new BoxWeight(2,5,6,4);
        System.out.println(box5.w);
//            There Are Many variaables in both parent and chlid class
//        you are given access to variables that are int the ref type i.e Boxweight
//        hence,you should have access to weight  variable
//        this also means,that the ones you are trying t access should be initialised
//        but here,when the obj itself is of type parent class,how will you call the constructor
//         this is why error
//        BoxWeight box6=new Box(2,5,6,4);
//        System.out.println(box5.w);


        BoxPrice box6=new BoxPrice(12,12,4);
        System.out.println(box6.cost);
    }
}

