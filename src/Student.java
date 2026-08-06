import java.util.Scanner;

public class Student {

    int rollno;
    String name;

    public Student(int rollno, String name, int[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    int[] marks;

    public double calculateaverage(){

        double sum=0;

        for(int i=0;i< marks.length;i++){
            sum=sum+ marks[i];
        }
        double result=sum/marks.length;

        return result;
    }

    public char calculateGrade(){
        double average=calculateaverage();

        if (average >= 90)
            return 'A';
        else if (average >= 80)
            return 'B';
        else if (average >= 70)
            return 'C';
        else if (average >= 60)
            return 'D';
        else
            return 'F';
    }
    void displayDetails(){
        System.out.println("Roll No "+rollno);
        System.out.println("Name"+name);
        System.out.println("Average: " + String.format("%.2f", calculateaverage()));
        System.out.println("Grade"+calculateGrade());

    }

    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int rollno=scanner.nextInt();
        System.out.print("Enter Name: ");
        String name=scanner.next();
        int[] marks=new int[5];
        System.out.println("Enter marks:");
        for(int i=0;i< marks.length;i++) {
            marks[i] = scanner.nextInt();
        }

        Student student=new Student(rollno,name,marks);
        student.displayDetails();
    }
}







