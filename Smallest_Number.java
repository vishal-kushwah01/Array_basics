public class Smallest_Number {
    public static int SmallestNumber(int number[]){
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0 ; i<number.length ; i++){
            if (smallest > number[i]) {
                smallest = number[i];
            }
        }
        return smallest;

    }
    public static void main(String[] args) {
        int number[] = {1,2,6,3,5};
        System.out.println("Smallest Number is :" + SmallestNumber(number));

        
    }
}
