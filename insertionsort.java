import java.util.Scanner;

class insertionsort{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter numbers in array");
        int myarr[] = new int[10];
        for(int i=0; i<10; i++){
            myarr[i] = obj.nextInt();
        }

        System.out.println("Entered numbers are :");
        for(int i=0; i<10-1; i++){
            System.out.print(myarr[i] + "-");
        }System.out.println("");

        for(int i=0; i<10; i++){
            int min = i;

            for(int j=i+1; j< 10 ; j++){
                if(myarr[j] < myarr[min]){
                    min = j;
                }
            }

            int temp = myarr[i];
            myarr[i] = myarr[min];
            myarr[min] = temp;
        }

        System.out.println("Sorted array is : ");
        for(int i=0; i<10; i++){
            System.out.print(myarr[i]+"-");
        }
    }
}