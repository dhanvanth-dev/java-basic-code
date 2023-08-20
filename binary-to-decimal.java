import java.util.*;

public class Binary_to_decimal {
    public static void btod(int binNum){
        int pow = 0;
        int decNum=0;
        int myNum=binNum;
        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit* (int)Math.pow(2,pow));

            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal conversion of " + myNum +" is= " + decNum);
    }

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int a;
        System.out.println("enter your number:");
        a=sc.nextInt();

        btod(a);
    }
}
