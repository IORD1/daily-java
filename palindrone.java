import java.util.Scanner;

class palindrone{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = "";
        s = obj.nextLine();
        int flag = 0;
        int i=0;
        while(i != (s.length()/2)){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                flag = 0;
                break;
            }
            i++;
        }
        i++;
        if(i >= (s.length()/2)){
            System.out.println("Entered word : " + s + " is a Palindrome");
        }else{
            System.out.println("Entered word : " + s + " is not a Palindrome");
        }
    }
}