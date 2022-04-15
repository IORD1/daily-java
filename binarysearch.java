import java.util.Scanner;

class binarysearch{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number in array : ");
        int myarr[] = new int[10];
        for(int i=0; i<10; i++){
            myarr[i] = obj.nextInt();
        }
        System.out.println("Entered array : ");
        for(int i=0; i<10; i++){
            System.out.print(myarr[i] + "-");
        }System.out.println(" ");

        System.out.print("Sorted array : ");
        for(int j = 0; j<10; j++){
            for(int i=0; i<10; i++){
                if(i == 9){
                    break;
                }
                if(myarr[i] > myarr[i+1]){
                    int temp = myarr[i] ;
                    myarr[i] = myarr[i+1];
                    myarr[i+1] = temp;
                }
            }
        }

        for(int i=0; i<10; i++){
            System.out.print(myarr[i] + "-");
        }System.out.println(" ");

        int key = 0;
        System.out.print("Enter a number to seach : ");
        key = obj.nextInt();

        int max = 9;
        int min = 0;
        int flag = 0;
        while(min != max){
            if(key == myarr[(max+min)/2]){
                flag = 1;
                break;
            }else if (key > myarr[(max+min)/2]){
                min = (max+min)/2;
            }else{
                max = (max+min)/2;
            }
            
        }


        if(flag == 1){
            System.out.println("Key found at index : "+ (max+min)/2 + " in sorted array");
        }else{
            System.out.println("key not found ");
        }



    }
}