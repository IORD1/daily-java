import java.util.Scanner;

class greatestnuminarray{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int myarr[]=new int[5];
        System.out.println("Enter numbers in array");
        for(int i=0; i<5; i++){
            int num = obj.nextInt();
            myarr[i] = num;
        }

        for(int i=0; i<5; i++){
            System.out.print(myarr[i] + " - ");
        }System.out.println(" ");

        int maxnum = 0;
        for(int i=0; i<5; i++){
            maxnum = Math.max(myarr[i], maxnum);
        }

        System.out.println("Maximum number in the array : "+ maxnum);
    }

}