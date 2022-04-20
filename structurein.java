import java.util.Scanner;

class struct1{
        int rollno;
        String name;
        struct1(int a, String b){
            rollno = a;
            name = b;
        }
}


class structurein{
    static void myMethod() {
    System.out.println("hello");
  }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Name : ");
        String names = obj.nextLine();
        System.out.print("Enter RollNo. : ");
        int roll = obj.nextInt();
        myMethod();


    }
}