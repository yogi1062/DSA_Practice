package Recursion;

public class Factorial {
    static void main(String[] args) {
        int result = fact(3);

        System.out.println(result);

    }

    private static int fact(int i){

        if(i>0)
           return i * fact(i-1);
        return 1;
    }
}
