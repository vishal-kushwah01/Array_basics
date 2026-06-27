public class prefix {
    public static void Max(int number[]){
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];   // first index same 
        for(int i = 1 ; i<prefix.length ; i++){
            prefix[i] = prefix[i-1] + number[i];  //formula to calculate prefix. 
        }
        for(int i = 0 ; i<number.length ; i++){
            int start = i;
            for(int j = i ; j<number.length ; j++){
                int end = j;

               int currsum = 0 ;
               currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start];  

               if(currsum > max){
                 max = currsum;
               }
            }
            
        }
        System.out.println("Max Sum :" + max);

    }
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        Max(number);
        
    }
}
