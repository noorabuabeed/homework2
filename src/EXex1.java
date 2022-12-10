import java.util.Scanner;

public class EXex1 {
    public static void main(String[]args){
        int Avarge = 0 , sum =0; //the Avarge
        int [] numbers = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a numbers");
            numbers[i] = scanner.nextInt();
            sum +=numbers[i];
        }
        Avarge =sum / 10 ;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > Avarge){
                System.out.println( "this number bigger than avarage number"+ numbers[i]);
            }
        }

    }
}



