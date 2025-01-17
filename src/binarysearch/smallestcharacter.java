package binarysearch;

public class smallestcharacter {
    public static void main(String[] args) {
        int []letters={'c','f','j'};
        int target=9;
        int ans=binarys(letters, target);
        System.out.println(ans);

    }
        // return the index
        // return -1 and if it does not exist
        static int binarys(int[] letters,int target){
            int start=0;
            int end=letters.length-1;

            while (start<=end) {
                // find the middle element
                int mid=start+(end-start)/2;
                if (target<letters[mid]) {
                    end=mid-1;
                }

                    else if(target>letters[mid]){
                        start=mid+1;
                    }
                    else
                        return mid;
                }
                return letters[start%letters.length];}
        
}
