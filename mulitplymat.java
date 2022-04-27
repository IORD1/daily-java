import java.util.Scanner;

class mulitplymat{
    public static void addmat(int mat1[][] , int mat2[][]){
        System.out.println("Addition of both matrix is : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print((mat1[i][j] + mat2[i][j]) + "  ");
            }
            System.out.println(" ");
        }
    }
    
    public static void multimat(int mat1[][] ,int mat2[][]){
        int sum =0;
        System.out.println("Mulitplication of both matrix is : ");
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                for(int k=0; k<3; k++){
                    sum = sum + (mat1[i][k] * mat2[k][j]);
                }
                System.out.print("  " + sum);

                sum = 0;
            }
            System.out.println(" ");
        }
    }


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

        addmat(mat1,mat2);
        multimat(mat1, mat2);
    }
}