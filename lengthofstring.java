import java.util.Scanner;

class lengthofstring{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = obj.nextLine();
        System.out.println("Lenghtof the string enetered is : "+ s1.length());

        String s2 = "hellow";
        System.out.println("the string entered " + s1 +" and string " + s2 + " is " + s1.compareTo(s2));
    }
}