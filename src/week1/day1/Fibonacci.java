package src.week1.day1;

public class Fibonacci {

    //0,1,1,2,3,5,8
    public static void main(String[] args) {
       int n = 10;

       int firstNumber = 0;
       int secNumber = 1;
       System.out.println("Fibonacci series till "+n+" terms");

       for (int i=1; i<=n; i++) {
           System.out.print(firstNumber + " ");
           int nextNumber = firstNumber + secNumber;
           firstNumber = secNumber;
           secNumber = nextNumber;
       }
    }
}
