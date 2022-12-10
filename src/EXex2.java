import java.util.Scanner;

public class EXex2 {
    public static void main (){
        String s = numberPhone("050-2346789");


    }






    public static String numberPhone(String number ) {

        boolean itIs = false;
        if (number.charAt(3) == '-' && number.length() == 11) {
            itIs = true;
            return number;

        }
        if (number.length() == 10 && number.charAt(0) == '0' && number.charAt(1) == '5') {

            itIs = true;

        } else {
            if (number.length() == 12 && number.charAt(0) == '9' && number.charAt(1) == '7' && number.charAt(2) == '2') {
                itIs = true;


            }
        }if (itIs != true){
            number = String.valueOf('1');
        }
        return number;

    }
}

