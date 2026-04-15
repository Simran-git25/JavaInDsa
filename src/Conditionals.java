import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("tell me your age : ");
        int age=input.nextInt();
        if(age>=18){
            System.out.println("You are eligible to Vote.");
        }else{
            System.out.println("Wait for some year");
        }
System.out.println("tell me your 5 subjects marks");
        int math=input.nextInt();
        int sci= input.nextInt();
        int sst= input.nextInt();
        int bio= input.nextInt();
        int game=input.nextInt();
        int percentage= (math+sci+sst+bio+game)/5;
        System.out.println("percentage is : " + percentage);
        int min_marks=0;
        if(min_marks>math){
            min_marks=math;
        }else if(min_marks>sst){
            min_marks=sst;
        }else if(min_marks>bio){
            min_marks=bio;
        }else if(min_marks>game){
            min_marks=game;
        }
        int percentage1=(math+sci+sst+bio+game-min_marks)/4;
        System.out.println("percentage is : " + percentage1);


System.out.println(" enter a lowercase character :");
        char character=input.next().trim().charAt(0);
        if(character >= 'a' && character <='z'){
            System.out.println((char) (character -32));
        }
        System.out.println(" enter a  uppercase character :");
        char character2=input.next().trim().charAt(0);
        if(character2 >= 'A' && character2 <='Z'){
            System.out.println((char) (character2 + 32));
        }

    }

}
