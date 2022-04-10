class sum10numdo{
    public static void main(String[] args){
        int sum =0;
        int a = 0;
        do{
            sum += a;
            a++;
        }while(a<10);
        System.out.println("total sum : "+sum);
    }
}