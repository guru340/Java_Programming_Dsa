package HCLTECH;

public class secondlargest {
    public int largest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<largest){
                secondlargest=largest;
                largest=arr[i];
            } else if (arr[i]>secondlargest && secondlargest<largest) {
                    secondlargest=arr[i];

            }
        }
        return secondlargest;
    }

     void main() {
        int[]arr={1,2,3 ,4 ,5};
         System.out.println(largest(arr));
    }
}
