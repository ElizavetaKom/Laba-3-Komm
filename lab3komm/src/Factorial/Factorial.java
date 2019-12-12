package Factorial;

public class Factorial {
    public static void main(String [] ards){
        int a = 0, f = 1;
        int [] massif = {1, 2, 3, 4, 5, 6, 7};
        for (a = 0; a < 7; a++){
            f = f * massif[a];
        }
        System.out.println("7! = " + f);
    }
}
