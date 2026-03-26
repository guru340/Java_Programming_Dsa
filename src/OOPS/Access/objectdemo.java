package OOPS.Access;

public class objectdemo {
    int num;
    float num2;

    public objectdemo(int num,float num2) {

        this.num = num;
        this.num2=num2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public objectdemo() {
        super();
    }


    public static void main(String[] args) {
        objectdemo obj=new objectdemo(34,65);
        objectdemo obj2=new objectdemo(56,58);
        if (obj.equals(obj2 )){
            System.out.println("object 2 is equal to obj");
        }
//        System.out.println(obj.hashCode());
    }
}
