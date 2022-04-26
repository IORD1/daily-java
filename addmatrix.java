import java.util.Scanner;

class addmatrix{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];

        System.out.println("Enter values in first matrix : ");
        for(int i=0 ; i<3; i++){
            System.out.println("Enter values in row : " + (i+1));
            for(int j=0; j<3; j++){
                mat1[i][j] = obj.nextInt();
            }
        }

        System.out.println("Enter values in Second matrix : ");
        for(int i=0 ; i<3; i++){
            System.out.println("Enter values in row : " + (i+1));
            for(int j=0; j<3; j++){
                mat2[i][j] = obj.nextInt();
            }
        }

        System.out.println("Addition of both matrix is : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print((mat1[i][j] + mat2[i][j]) + "  ");
            }
            System.out.println(" ");
        }
    }
}