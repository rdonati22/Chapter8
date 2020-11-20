public class Exercises {

    public static int addOdds(int n){
        int counter = 1;
        int x = 0;
        while (counter<=n){
            x+=counter;
            counter+=2;
        }
        return x;
    }

    public static int howManyYears(double startPop, double endPop){
        int years = 0;
        while(startPop<endPop){
            startPop*=1.13;
            years++;
        }
        return years;
    }

    public static void printSum(int n){
        int counter = 0;
        int x = 0;
        while (counter<n){
            counter++;
            System.out.print(counter);
            if (counter<n) {
                System.out.print(" + ");
            }
            x+=counter;
        }
        System.out.println(" = " + x);
    }

    public static boolean isPerfectSquare(int n){
        int counter = 1;
        int x = 0;
        while (x<n){
            x+=counter;
            counter+=2;
        }
        return (x==n);
    }

    public static int sumDigits(int n){
        int x = 0;
        while (n>0){
            x+=n%10;
            n/=10;
        }
        return x;
    }

    public static void main (String [] args){
        System.out.println("All odd integers from 1 to " + 3 +" add up to " + addOdds(3));
        System.out.println("All odd integers from 1 to " + 7 +" add up to " + addOdds(7));
        System.out.println("All odd integers from 1 to " + 10 +" add up to " + addOdds(10));

        System.out.println("At a growing rate of 1.13%, it will take Mexico " +
                howManyYears(111.2, 120.0) + " years to reach 120 million people");
        System.out.println("At a growing rate of 1.13%, it will take Mexico " +
                howManyYears(111.2, 150.0) + " years to reach 150 million people");

        printSum(2);
        printSum(7);
        printSum(9);

        System.out.println("9 is a perfect square: " + isPerfectSquare(9));
        System.out.println("144 is a perfect square: " + isPerfectSquare(144));
        System.out.println("22 is a perfect square: " + isPerfectSquare(22));
        System.out.println("71 is a perfect square: " + isPerfectSquare(71));

        System.out.println("The sum of the digits in 123 is equal to " + sumDigits(123));
        System.out.println("The sum of the digits in 47 is equal to " + sumDigits(47));
        System.out.println("The sum of the digits in 3168 is equal to " + sumDigits(3168));
    }
}
