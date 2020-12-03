public class Factorial {

    public static long calcFactorial(int x){
        long y = 1;
        for (; x>0; x--){
            y*=x;
        }
        return y;
    }

    public static double calcE(){
        double e = 1.0;
        double olde = 0.0;
        int x = 1;
        while(e-olde>.001){
            olde = e;
            e += 1.0/calcFactorial(x);
            x++;
        }
        return e;
    }

    public static double calcEX(int x){
        return Math.pow(calcE(),x);
    }

    public static void main (String [] args){

        for (int a = 1; a<11; a++){
            System.out.println(calcFactorial(a));
        }
        for (int a = 1; a<21; a++){
            System.out.println(calcFactorial(a));
        }
        System.out.println(calcE());
        for (int a = 1; a<6; a++){
            System.out.printf("e is %2.3f \n", calcEX(a));
        }
    }
}
