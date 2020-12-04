public class MakeTriangles {
    public static void triangle0(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle1(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void triangle2(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void triangle3(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void triangle4(int n){
        for(int i = 1; i <=n; i++){
            for(int j = n;j>i;j--){
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void triangle5(int n){
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(n-i+1);
            }
            System.out.println();
        }
    }
    public static void triangle6(int n){
        for(int i = n; i>0; i--){
            for(int j = n; j>=i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        triangle0(7);
        triangle1(5);
        triangle2(5);
        triangle3(5);
        triangle4(5);
        triangle5(5);
        triangle6(5);
    }
}