import java.util.Scanner;

class doubleDarray{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number in 2D array : ");
        int myarr[][] = new int[3][3];
        int row = myarr.length;
        int col = myarr[0].length;
        for(int i=0; i<row; i++){
            System.out.println("Enter numbers for row " + (i+1));
            for(int j=0; j<myarr[i].length; j++){
                myarr[i][j] = obj.nextInt();
            }
        }

        System.out.println("Entered array is : ");
        for(int i=0; i<3 ;i++){
            for(int j=0; j<3; j++){
                System.out.print(myarr[i][j] + " ");
            }System.out.println(" ");
        }
    }
}