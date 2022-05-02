import java.util.Scanner;

class calculator{

    public static void printmenu(){
        System.out.println("-----------------MENU----------------");
        System.out.println("1 : Addition ");
        System.out.println("2 : Subtract ");
        System.out.println("3 : Multiplication ");
        System.out.println("4 : Divide ");
        System.out.println("5 : EXIT ");
        System.out.println("-------------------------------------");
    }
    
    public static int addthis(int a, int b){
        return a+b;
    }
    
    public static int multiit(int a, int b){
        return a*b;
    }

    public static int subit(int a, int b){
        return a-b;
    }

    public static int divit(int a, int b){
        return a/b;
    }

    public static void clearandprint(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();   
        printmenu();
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int opt = 0;
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        printmenu();
        while(true){

        System.out.println("-------------------------------------");
        System.out.print("Enter a number : ");
        int a = obj.nextInt();
        System.out.print("Enter a second number : ");
        int b =obj.nextInt();
            System.out.print("Enter option : ");
            opt = obj.nextInt();
            if(opt == 1){
                clearandprint();
                System.out.println("The Addition is  : " + addthis(a,b));
            }else if(opt == 2){
                clearandprint();
                System.out.println("The Subtractio is  : " + subit(a,b));
            }else if(opt == 3){
                clearandprint();
                System.out.println("The Muliplication is  : " + multiit(a,b));
            }else if(opt == 4){
                clearandprint();
                System.out.println("The Divisoin is  : " + divit(a,b));
            }else if(opt == 5){
                break;
            }else{
                clearandprint();
                System.out.println("Please Enter a valid option ");
            }
            
        }


    }
}