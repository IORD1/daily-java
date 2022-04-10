import java.util.Scanner;

class factorialwhile{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number for factorial : ");
        int num = obj.nextInt();
        int facto = 1;
        int a = 1;
        while(a<= num){
            facto *= a;
            a++;
        }
        System.out.println("Factorial for "+num + " is : "+ facto);
    }
}