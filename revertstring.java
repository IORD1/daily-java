import java.util.Scanner;

class revertstring{
    public static void main(String[] args){
        System.out.print("Enter a string : ");
        Scanner obj = new Scanner(System.in);
        String s1 = obj.nextLine();
        String s2 = "";
        char ch;
        for(int i=0 ; i<s1.length(); i++){
            // ch= s1.charAt(i); //extracts each character
            // s2= ch+s2;

            s2 = s1.charAt(i) + s2;
        }

        System.out.println("Reverted String is : " + s2);
    }
}