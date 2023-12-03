import java.util.Scanner;

public class homework1 {

//        Make a function to check if a given number n is even or not.


    public static int evenNum(int number){
        int newnum = number % 2;
        return newnum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = evenNum(number);
        if (result == 0){
            System.out.println("This is even!");
        } else {
            System.out.println("This is odd!");
        }


    }

}