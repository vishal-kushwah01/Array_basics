import java.util.*;

public class basic {

    public static void main(String[] args) {
        // define an array
        int Number[] = { 1, 2, 3, 4, 5 };
        String Names[] = {"Anurag" , "Aditya" , "Aadhya"};
        System.out.println(Arrays.toString(Number));
        System.out.println(Arrays.toString(Names));

        System.out.println();


        // take input from user
        Scanner sc = new Scanner(System.in);

        int Marks[] = new int[50];

        System.out.print("Enter Physics Marks : ");
        Marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry Marks : ");
        Marks[1] = sc.nextInt();

        System.out.print("Enter Maths Marks : ");
        Marks[2] = sc.nextInt();

        System.out.println();

        System.out.println("Physics marks :" + Marks[0]);
        System.out.println("Chemistry Marks :" + Marks[1]);
        System.out.println("Maths Marks :" + Marks[2]);


        //update Array
        System.out.println();
        Marks[1] = 99;
        System.out.println("Upadted Marks");
        System.out.println("Chemistry Marks :" + Marks[1]);


        //Perform Operations
        System.out.println();
        System.out.println("Calculate Percentage");
        double Percentage = (Marks[0] + Marks[1] + Marks[2] ) / 3;
        System.out.println("Percentage : " + Percentage +"%");
    }
}