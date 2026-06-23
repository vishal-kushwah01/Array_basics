public class Largest_Number {
    public static int LargestNumber(int number[]){
        int largest = Integer.MIN_VALUE;  // -infinity
        for(int i = 0 ; i<number.length ; i++){
            if (largest < number[i]) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = {1,2,6,3,5};
        System.out.println("Largest Number is : " + LargestNumber( numbers));
        
    }
}
