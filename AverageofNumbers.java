public class AverageofNumbers {
    public static double Average(int[] number){
        int sum = 0 ;
        for(int i = 0 ; i<number.length ; i++){
             sum = sum + number[i];
        }
        return (double) sum / number.length;
        
    }
    public static void main(String[] args) {
        int[] number = {10,20,40,50,60,80};
        System.out.println("Average of Numbers is " + Average(number));
        
    }
}
