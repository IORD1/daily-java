import java.util.Scanner;

class linearsearching{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number in array : ");
        int myarr[] = new int[10];
        for(int i=0; i<10; i++){
            myarr[i] = obj.nextInt();
        }
        System.out.println("Entered array : ");
        for(int i=0;i<10; i++){
            System.out.print(myarr[i] + "-");
        }System.out.println(" ");

        System.out.print("Enter a number to search : ");
        int key = obj.nextInt();
        int flag =0;
        int index = 0;
        for(int i=0; i<10; i++){
            if(key == myarr[i]){
                flag = 1;
                index = i;
            }
        }
            if(flag == 1){
                System.out.println("Found entered number at index : "+index);
                
            }else{
                System.out.println("Not found");
            }
    }
}