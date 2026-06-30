public class Missingnumber {

    public static int Missing(int[] arr , int n){
        for(int num = 1 ; num<=n ; num++){
            boolean found = false ;
            for(int i = 0 ; i<arr.length ; i++){
                if (arr[i] == num) {
                    found =  true;
                    break;
                }
            }
            if (!found) {
                return num;
            }
        }
        return -1 ;
    }
    public static void Missingnums(int[] arr , int n){
        for(int i = 1 ; i<arr.length ; i++){
            boolean found = false;
            for(int j = 0 ; j<arr.length ; j++){
                if (arr[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found){
                System.out.println("Missing element: " + i + " ");
            }
        }
        
    }
   
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        int n = arr.length + 1;
        int missing =  Missing(arr, n);
        System.out.println("Missing number :" + missing);
        System.out.println();
        Missingnums(arr, n);
    }
}
