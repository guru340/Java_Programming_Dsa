package Coginzant;

import java.util.Arrays;

//Find Student Table Position
public class question6 {
    static void main() {

    }
    public static int[] fintable(String[] students, int N, int M, String name){
        if (students.length > N * M * 2) {
            return new int[]{-1, -1};
        }
        Arrays.sort(students);

        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            return new int[]{-1, -1};
        }

        int tableIndex = index / 2;
        int row = tableIndex / M + 1;
        int col = tableIndex % M + 1;

        return new int[]{row, col};
    }
}
