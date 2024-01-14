import java.net.StandardSocketOptions;

public class Patterns {
    public static void hollow_rectangle(int totRows,int totCols ){
        //outerloop
        for (int i=1 ; i<=totRows ; i++){
            //inner -columns
            for(int j=1 ; j<=totCols; j++){
                //cell-(i,j)
                if(i==1 || i==totRows || j==1 || j==totCols){
                    //boundary cell printing
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //breaking columns for loop and coming to next line
            System.out.println();
        }
    }

    public static void inverted_half_rotated_pyramid(int n) {
        for (int i=1 ; i<=n ; i++){
            //printing spaces
            for (int j=1 ;j<=n-i ;j++){
                System.out.print(" ");
            }
            //printing stars
            for (int j=1 ;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

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

    public static void floyds_triangle(int n) {
        //outer -for total lines
        int counter=1;
        for (int i=1 ;i<=n ;i++ ){
            //inner - how many times counter will be printed
            for(int j=1; j<=i ;j++){
                System.out.print(counter+" ");
                counter++;
            }
            //going to next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //calling fn
        //hollow_rectangle(4,5);
        //inverted_half_rotated_pyramid(4);
        //inverted_half_pyramid_with_numbers(5);
        floyds_triangle(5);
    }
}
