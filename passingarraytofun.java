import java.util.Scanner;

class passingarraytofun{
    public static int[] func(int a[]){
        int mythirdarr[] = a;
        for(int i=0; i<5; i++){
            mythirdarr[i] = mythirdarr[i] + 1;
        }

        return mythirdarr;
    }
    
    
    
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int myarr[] = new int[5];
        System.out.println("Enter in array : ");
        for(int i=0; i<5; i++){
            myarr[i] = obj.nextInt();
        }

        int[] mysecarr = func(myarr);

        for(int i=0; i<5; i++){
            System.out.print(mysecarr[i] + "-");
        }

    }
}