import java.util.Scanner;

class totalevenodd{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int myarr[] = new int[5];
        System.out.println("Enter number in array : ");
        for(int i=0; i<5;i++){
            myarr[i] = obj.nextInt();
        }

        int evenum = 0;
        int oddnum = 0;

        for(int i=0; i<5; i++){
            if(myarr[i] % 2 == 0){
                evenum++;
            }else{
                oddnum++;
            }

        }

        System.out.println("Array contain " + evenum + " even numbers and " + oddnum + " odd numbers");
    }
}