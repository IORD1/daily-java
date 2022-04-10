import java.util.Scanner;

class factorialfor{
    public static void main(String[] args){
        System.out.print("Enter a number for factorial : ");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int facto = 1;
        for(int i=1; i<=num; i++){
            facto *= i;
        }

        System.out.println("Factorial of "+num+ " is : " + facto);
    }
}