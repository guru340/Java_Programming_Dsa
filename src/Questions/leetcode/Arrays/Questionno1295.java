package Questions.leetcode.Arrays;
//1295:Find Numbers with Even Number of Digits
public class Questionno1295 {
    public static void main(String[] args) {
        int []arr={12,345,2,6,7896};
        System.out.println(findnumber(arr));
    }

    public static int findnumber(int []nums){
        int count = 0;


        for (int num : nums) {

            if (getnumber(num) % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static  int getnumber(int num){
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
    }

