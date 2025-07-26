

public class MaxSubBrute {
    public static void printSubarrays(int numbers[]) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
            int start = i;
            for(int j=i+1 ; j< numbers.length; j++){
                int end = j;
                currSum =0;
                for (int k = start; k < end; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        printSubarrays(numbers);
    }
}


// output:
// 1
// -1
// 5
// 4
// -2
// 4
// 3
// 6
// 5
// -1
// max sum: 6