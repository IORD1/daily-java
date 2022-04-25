import java.util.Scanner;

class classesin{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        thisclass obj2 = new thisclass();
        obj2.method(4);
    }
}
class thisclass{
        int num ;
        thisclass(){
            num = 1;
        }
        Scanner obj = new Scanner(System.in);
        public void method(int n){
            System.out.print("Enter a number : ");
            int a = obj.nextInt();
            System.out.println("This is class method : " + (n + a));
        }
    }