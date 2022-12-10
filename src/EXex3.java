public class EXex3 {
    public static void main (String[]args){
        int numbers[] = {3,6,6,7,9,5};
        newArry(numbers);



    }
    public static void newArry(int[]theNumber ) {
        int length = theNumber.length;
        for (int i = 0; i < length; i++) {

            for (i = 0; i < length - 1; i++) {
                for (int k = i + 1; k < length; k++) {

                    if (theNumber[i] == theNumber[k]) {
                        theNumber[k] = theNumber[length - 1];
                        length--;
                    }
                }
            }
            {
                for (int j = 0; j < length; j++) {
                    System.out.println(theNumber[j] + "");
                }




            }      }
    }
}
