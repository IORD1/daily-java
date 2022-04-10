import java.util.Scanner;

class factordo{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number to find factorial : ");
        int num = obj.nextInt();
        int facto = 1;
        int a = 1;
        do{
            facto *= a;
            a++;
        }while(a<=num);
        System.out.println("Factorial of " + num  + " is : "+ facto);
    }
}
