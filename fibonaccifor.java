class fibonaccifor{
    public static void main(String[] args){
        int a = 0; 
        int b = 1;
        int t = 1;
        System.out.print(a+"-");
        System.out.print(b+"-");
        for(int i=0; i<10; i++){
            System.out.print(a+b+"-");
            t = b; 
            b = a+b;
            a = t;
        }
    }
}