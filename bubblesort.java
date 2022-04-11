import java.util.Scanner;

class bubblesort{


    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int myarr[] = new int[10];
        System.out.println("Enter number in array to sort: ");
        for(int i=0; i<10; i++){
            myarr[i] = obj.nextInt();
        }

        System.out.println("Entered numbers are : ");
        for(int i=0; i<10; i++){
            System.out.print(myarr[i] + "-");
        }
        System.out.println(" ");

        System.out.println("sorted array : ");
        
        for(int j=0; j<10; j++){
        for(int i=0; i<10;i++){
            if(i==9){
                break;
            }
            if(myarr[i] > myarr[i+1]){
                int temp = myarr[i];
                myarr[i] = myarr[i+1];
                myarr[i+1] = temp;
            }

        }
        }

        for(int i=0; i<10; i++){
            System.out.print(myarr[i] +  "-");
        }
        System.out.println(" ");
    }
}