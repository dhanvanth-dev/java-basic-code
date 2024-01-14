import java.net.StandardSocketOptions;

public class Patterns {
    public static void inverted_half_rotated_pyramid(int n) {
        for (int i=1 ; i<=n ; i++){
            //printing spaces
            for (int j=1 ;j<=n-i ;j++){
                System.out.print(" ");
            }
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //calling fn
        inverted_half_rotated_pyramid(4);
    }
}

/*expected output when n=4
   *
  **
 ***
****

*/
