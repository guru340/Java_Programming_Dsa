package String;

import java.util.Arrays;

public class stringmethods {
    public static void main(String[] args) {
        String name="Mayank Sangwani";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        // This will create always new object Because String are immutable in java
        System.out.println(name);
    }
}
