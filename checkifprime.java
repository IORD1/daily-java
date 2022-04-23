import java.util.Scanner;

class checkifprime{
    public static String checkprime(int num){

        for(int i=2; i<=num; i++){
            if( i == num){
                return "Prime Number";
            }

            if(num%i == 0){
                return "Not a Prime Number";
            }
        }

        return "Error";
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number to check : " );
        int num = obj.nextInt();
        System.out.print("Entered number is : "  + checkprime(num));
        System.out.println(" ");

    }
}