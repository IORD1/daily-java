import java.util.Scanner;

class calculator{

    public static void printmenu(){
        System.out.println("-----------------MENU----------------");
        System.out.println("1 : Addition ");
        System.out.println("2 : Subtract ");
        System.out.println("3 : Multiplication ");
        System.out.println("4 : Divide ");
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



    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int opt = 0;
        while(true){
            System.out.print("Enter option : ");
            opt = obj.nextInt();
            
        }


    }
}