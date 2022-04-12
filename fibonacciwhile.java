class fibonacciwhile{
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = 1;
        int d =1;
        int i=1;
        System.out.print(a + "-");
            System.out.print(c + "-");
        while(i<10){
            System.out.print(c + "-");
            c = b+a;
            d = b;
            b = c;
            a = d;
            i++;
        }
    }
}