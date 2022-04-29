import java.util.Scanner;

class switchin{
    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = obj.nextInt();
        switch(num){
            case 0:
                System.out.println("You entered  : " + 0);
                break;

            case 1:
                System.out.println("You entered : " + 1);
                break;

            case 2:
                System.out.println("You entered : " + 2);
                break;
            
            default:
                System.out.println("You entered number other than 0,1 or 2");
        }


    }
}