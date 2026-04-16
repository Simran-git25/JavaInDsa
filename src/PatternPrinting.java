import java.util.Scanner;
public class PatternPrinting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
       // int m=sc.nextInt();

        // pattern hollow square

//        for(int row=1; row<=n;row++){
//
//            for(int col=1; col<=n;col++){
//                if(row==1 || row==n){
//                    System.out.print("* ");
//                }else if(col==1 || col==n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        // solid right angled triangle

//        for(int row=1;row<=n;row++){
//            for(int col=1;col<= row;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // inverted right angled triangel

//        for(int row=1;row<=n;row++){
//            for(int col=1;col<= n-row+1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // pattern solid pyramid
//        for(int row=1;row<=n;row++){
//            for(int space=1; space<=n-row;space++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=row*2-1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //pattern solid rectangle
//        for(int row=1;row<=n;row++) {
//            for (int col = 1; col <= m; col++) {
//                System.out.print("* ");
//            }
//System.out.println();
//        }

        // hollow rectangle
//        for(int row=1;row<=n; row++){
//            for(int col=1;col<=n;col++){
//                if(row==1 || row==n ||col==1 || col==n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }


        //hollow right angled triangle
//        for(int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                if(col==1 || col==row || row==n){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //inverted solid pyramid
//        for(int row=1;row<=n;row++){
//            for(int space=1;space<=row-1;space++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*(n-row)+1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //hollow pyramid pattern
//        for(int row=1;row<=n;row++){
//            for(int space=1;space<=n-row;space++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*row-1;col++){
//                if(row==1 || row==n  || col==1 || col==2*row-1){
//                    System.out.print("* ");
//                }else{
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

        //solid diamond pattern
//        for(int row=1;row<=n/2+1;row++){
//            for(int col=1;col<=(n/2+1)-row;col++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*row-1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int row=1;row<=n/2;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print("  ");
//            }
//            for(int col=1;col<=2*(n/2-row)+1;col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //hollow solid diamond
        for(int row=1;row<=n/2+1;row++){
            for(int col=1;col<=(n/2+1)-row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*row-1;col++){
                if(row==1 || col==1 || col==2*row-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int row=1;row<=n/2;row++){
            for(int col=1;col<=row;col++){
                System.out.print("  ");
            }
            for(int col=1;col<=2*(n/2-row)+1;col++){
                if(col==1 || col==2*(n/2-row)+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}
