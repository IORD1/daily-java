class fibonaccidowhile{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int t = 1;
        int i = 1;
        System.out.print(a+"-");
        System.out.print(b+"-");
        do{
            System.out.print(a+b+"-");
            t = b;
            b = a+b;
            a = t;
            i++;
        }while(i<10);
    }
}