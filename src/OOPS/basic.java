package OOPS;

public class basic {
    public static void main(String[] args) {
        student[] Students=new student[5];
         //declaring object
        student yash=new student();
        student random=new student(yash);
        student one=new student();
        student two=one;
        one.name="ayush";
        System.out.println(two.name);

//        yash.rno=10;
//        yash.name="yash";
//        yash.marks=9;
        yash.greeting();
//        yash.changeName("Mayank Sangwani");
        System.out.println(yash.rno);
        System.out.println(yash.name);
        System.out.println(yash.marks);
        System.out.println(random.name);


    }

    // create own data type using class
    static class student {
        int rno;
        String name;
        float marks=98 ;

// Other teachers uses data as store the data for the classs
//  class uses for createing objects in java file
// we need a way to add the values of the above
//  properities object by object
// we need one word to acess every object

        void greeting(){
            System.out.println("hello my name is "+ this.name);
        }
        void changeName(String newName ){
            name =newName;
        }
        student(){
//            this is how you call a constructor from another constructor
//            internally; new Student();
            this(13,"default person ",100.0f);
        }
        student(student other){
            this.name=other.name;
            this.rno= other.rno;
            this.marks= other.marks;
        }
//        student(){
//            this.rno=19;
//            this.name="yash";
//        }

        student(int rno,String name,float marks){
            this.marks=marks;
            this.rno=rno;
            this.name=name;
        }
    }

}
