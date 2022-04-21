import java.util.Scanner;

class function{

    public static int addit(int a, int b ){
        return a+b;
    } 

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a  = obj.nextInt();
        System.out.print("Enter second number : ");
        int b = obj.nextInt();
        System.out.println("The sum is : " + addit(a,b));
        
    }

}