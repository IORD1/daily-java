class amrstrong{
    public static void main(String[] args){
        for(int i=0; i<1000; i++){
            int j = i;
            int sum = 0;
            while(j != 0){
                sum += Math.pow(j%10,3);
                 j = j/10;
            }

            if(sum == i){
                System.out.println(i);
            }
        }
    }
}