import java.util.Scanner;

class stringinjava{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String s1 = "hello ";
        System.out.print("Enter a string : ");
        String s2 = obj.nextLine();
        System.out.println(s1+s2);
        s2 = s1.concat(" World");
        System.out.println(s2);
    }
}