public class AllEven {
    static void main() {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        int sum=0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("\n"+sum);
        for(int i=50;i<=100;i++){
            if(i%7==0){
                System.out.print("\n"+i+" "+"is divisble by 7");
            }
        }
    }
}
