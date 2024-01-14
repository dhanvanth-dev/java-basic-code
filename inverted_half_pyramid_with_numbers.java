import java.net.StandardSocketOptions;

public class Patterns {
    public static void inverted_half_pyramid_with_numbers(int n) {
        for (int i=1 ;i<=n ;i++ ){
            //printing numbers
            for(int j=1; j<=n+1-i ;j++){
                System.out.print(j+" ");
            }
            //going to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //calling fn
        inverted_half_pyramid_with_numbers(5);
    }
}
/*
expexted output for n=5
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 


*/
