public class Prime {
    static void prime(int n){

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(n+" is not prime ");
                return ;
            }
        }
        System.out.println(n+" is prime ");
    }
    public static void main(String[] args){
        prime(2);
        prime(17);
        prime(10);
    }
}
