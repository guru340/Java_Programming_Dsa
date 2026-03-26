package OOPS.generics.comparing;

public class main {
    public static void main(String[] args) {
        Student Mayank=new Student(12,35);
        Student Aman=new Student(52,66);

        if(Aman.compareTo(Mayank)<0){
            System.out.println("Aman got more marks");
        }
    }


}
