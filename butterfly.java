import java.net.StandardSocketOptions;

public class Patterns {
  
    public static void butterlfly(int n) {
        //1st half
        for (int i=1 ;i<=n ;i++){
            //star -i
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }

            //spaces -(n-i)*2
            for (int j=1 ;j<=(n-i)*2 ;j++){
                System.out.print(" ");
            }
            //star
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }
            //going to next line
            System.out.println();
        }

        //2nd half
        for (int i=n ;i>=1 ;i--){
            //star -i
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }

            //spaces -(n-i)*2
            for (int j=1 ;j<=(n-i)*2 ;j++){
                System.out.print(" ");
            }
            //star
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }
            //going to next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //calling fn
        
        butterlfly(4);
    }
}

/*
expected output for n=4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *


*/
