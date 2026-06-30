public class Findduplicate {
    public static void Duplicate(int[] number){
        
        for(int i = 0 ; i<number.length;i++){
            for(int j = i+1 ; j<number.length ; j++){
                if (number[i] == number[j]) {
                    System.out.println("Duplicate found: " + number[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] number = {2,4,6,4,3,1,2};
        Duplicate(number);
    }
}
