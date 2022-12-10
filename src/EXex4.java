public class EXex4 {
    public static void main(String[] args) {
        int[] numbers = {7, 6, 7, 9, 8, 5, 3};
        System.out.println(RisesAndFalls(numbers));
    }

    public static int RisesAndFalls(int[] ascendingDescendingArray) {

        int TheBigestNumber = 0,index = 0, result = 0, TheSmallNumber = 0;
        for (int i = 0; i < ascendingDescendingArray.length; i++) {
            if (ascendingDescendingArray[i] > TheBigestNumber) {
                TheBigestNumber = ascendingDescendingArray[i];
                TheSmallNumber = TheBigestNumber;
                index = TheBigestNumber;
            } else {
                if (ascendingDescendingArray[i] < TheSmallNumber){
                    TheSmallNumber = ascendingDescendingArray[i];
                    TheBigestNumber = TheSmallNumber;
                } else {
                    index = 1;
                    break;
                }

            }

        }

        return index;
    }
}
