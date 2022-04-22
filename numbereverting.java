import java.util.Scanner;

class numbereverting{
    public static void revertnum(int num){
        int ans;
        int temp = num;
        int size = 0;
        while(temp != 0){
            temp = temp/10;
            size++;
        }
        // System.out.println(size);
        int arr[] = new int[size];
        int i=0;
        while(num != 0){
            arr[i] = num%10;
            num = num/10;
            i++;
        }
        for(int j=0; j<size; j++){
            System.out.print(arr[j]);
        }
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number to revert  : ");
        int num  = obj.nextInt();
        System.out.print("Revert is : ");
        revertnum(num);

    }
}