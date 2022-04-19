import java.util.Scanner;

class comparestring{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = obj.nextLine();
        System.out.print("Enter a string : ");
        String s2 = obj.nextLine();

        if(s1.equals(s2)){
            System.out.println("Both strings are equal ");
        }else{
            System.out.println("Both strings are not equal ");
        }
    }
}