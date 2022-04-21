import java.util.Scanner;

class arrayinfunction{
    public static void maxofarray(int a[] , int size){
        int maxnum = -100000;
        for(int i=0; i<size ; i++){
            maxnum = Math.max(maxnum,a[i]);
        }
        System.out.println("Maximum number in array is : " + maxnum);
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter numbers in array : " );
        int myarr[] = new int[6];
        for(int i=0; i<6; i++){
            myarr[i] = obj.nextInt();
        }

        System.out.println("Entered array is : ");
        for(int i=0; i<6 ;i++){
            System.out.print(myarr[i] + "-");
        }

        maxofarray(myarr,6);
    }
}