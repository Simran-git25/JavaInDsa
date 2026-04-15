public class Prime_1_100 {
    public static void main(String[] args){

        outer:
        for(int i = 2; i <= 100; i++){

            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    continue outer; // skip this number
                }
            }

            System.out.println(i); // only runs if prime
        }
    }
}
