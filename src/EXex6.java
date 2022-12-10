import java.util.Scanner;
public class EXex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a quadratic equation in this way , ax^2+bx+c=0 ");
        String equation = scanner.nextLine();

        checkEquation(equation);


    }
    public static void checkEquation (String equation){
        boolean isTrueEquation = false;

        String x2 = "x^2";
        String XNumber2 = "x+";
        String X1Number2 = "x-";
        String equal0 = "=0";

        if (equation.contains(x2) &&  equation.contains(equal0) && (equation.contains(X1Number2)||equation.contains(XNumber2) )){
            isTrueEquation = true;
        }
        if (isTrueEquation ){
            quadraticEquation(equation);
        }else {

            System.out.println(" The quadratic equation is not true ");
        }

    }
    public static int getTheVariableA (String equation){
        String VariableA ;

        VariableA = equation.substring(0,equation.indexOf("x^2"));
        if (VariableA.equals("-")){
            VariableA="-1";
        }else if (VariableA.equals("")){
            VariableA="1";
        }
        int A = Integer.parseInt(VariableA);

        return A;
    }
    public static int getTheVariableB (String equation) {
        int x2 = equation.indexOf("x^2");
        x2 += 3;
        String b ="";
        for (int i = x2; i < equation.length(); i++) {
            char currentChar = equation.charAt(i);
            if ( currentChar != 'x'){
                b = b +currentChar ;
            }else {
                break;
            }
        }
        if (b.equals("-")){
            b="-1";
        } else if (b.equals("+")) {
            b="1";

        }
        int B = Integer.parseInt(b);


        return B;

    }
    public static int getTheVariableC (String equation){
        int indexOfx2 = equation.indexOf("= 0");

        String VariableC = "" ;
        int indexX =0  ;
        for (int i = indexOfx2-1; i > 0; i--) {
            char currentChar = equation.charAt(i);

            if (currentChar == 'x') {
                indexX = i;
                break;

            }

        }
        indexX ++;
        VariableC =equation.substring(indexX,equation.indexOf("=0"));

        int C = Integer.parseInt(VariableC);


        return C;


    }

    public static void quadraticEquation (String equation){

        int a = getTheVariableA(equation);
        int b = getTheVariableB(equation);
        int c = getTheVariableC(equation);

        if ((b*b)-4*a*c<0 || a==0 ){
            System.out.println(" no solution");
        }
        else {
            double Variblex1 = ( (-b+ Math.sqrt((b*b)-4*a*c))/ (2*a)   );
            double Variblex2 = ( (-b- Math.sqrt((b*b)-4*a*c))/ (2*a)   );
            if (Variblex1==Variblex2){
                System.out.println(" have one solution: \n x1="+Variblex1);
            }else {
                System.out.println(" have two solution: \n x1="+Variblex1 +"\n x2= "+Variblex2  );
            }

        }

    }
}

