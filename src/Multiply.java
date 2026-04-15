import java.util.Scanner;

public class Multiply {
  static  void multiply(int a,int b)
    {
        int mul=a*b;
        System.out.println(mul);
    }
    static void Perimeter(int b, int h ,int l){
      int perimeter= b+h+l;
      System.out.println(perimeter);
    }
    static void SimpleInterest(int p, int r,int t){
      int simpleInterest= (p*r*t)/100;
      System.out.println(simpleInterest);
    }
    static void CompoundInterest(int p, int r, int t){
      double amount = p*Math.pow((1+r/100.0),t);
      double compoundInterest= amount - p;

      System.out.println(compoundInterest);
    }
    public  static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        multiply(12,45);
        Perimeter(23,4,2);
        SimpleInterest(12000,2,2);
        CompoundInterest(12000,2,2);

        Counting(10);
        Max(345,7654);
    }
    static void Counting(int n){
      for(int i=n; i>0;i--){
          System.out.println(i);
      }
    }
    static void Max(int a,int b){
        if (a > b) {

            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
