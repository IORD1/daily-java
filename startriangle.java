import java.util.Scanner;

class startriangle{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();
        for(int i=0; i<=num; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");

            }
            for(int j=num; j>i; j--){
                System.out.print(" ");

            }
            for(int j=num; j>i; j--){
                System.out.print(" ");

            }
            for(int j=0; j<i; j++){
                System.out.print("*");

            }
            

            System.out.println(" ");
        }

        for(int i=num-1; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");

            }
            for(int j=num; j>i; j--){
                System.out.print(" ");

            }
            for(int j=num; j>i; j--){
                System.out.print(" ");

            }
            for(int j=0; j<i; j++){
                System.out.print("*");

            }

            System.out.println(" ");
        }


    }
}