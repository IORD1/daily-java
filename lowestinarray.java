import java.util.Scanner;

class lowestinarray{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int myarr[] = new int[5];
        System.out.println("Enter the numbers : ");
        for(int i=0; i<myarr.length; i++){
            int num = obj.nextInt();
            myarr[i] = num;
        }

        for(int i=0 ; i<myarr.length; i++){
            System.out.print(myarr[i]+ " - ");
        }

        int minnum = 1000000;
        for(int i=0; i<myarr.length; i++){
            minnum = Math.min(minnum , myarr[i]);
        }

        System.out.println("Lowest number in the array is : " + minnum);
    }
}