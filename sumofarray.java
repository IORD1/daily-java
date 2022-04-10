import java.util.Scanner;

class sumofarray{
    public static void main(String[] args){
        Scanner obj = new  Scanner(System.in);
        int myarr[] = new int[5];
        int sum = 0;
        System.out.println("Enter a numbers in array : ");
        for(int i=0; i<5 ; i++){
            int num = obj.nextInt();
            myarr[i] = num;
        }

        for(int j=0; j<5; j++){
            sum += myarr[j];
        }

        System.out.print("Sum of number in array  : "+sum);
    }

}