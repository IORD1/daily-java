import java.util.Scanner;

class muliplicationtable{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number for table: ");
        int num = obj.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}