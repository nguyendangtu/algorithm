package algorithm.companies.resolvtech;

/**
 * @author : JOHNNGUYEN
 * @since : 1/8/2024, Mon
 **/
public class Test {

    public static void main(String args []){

    }

    public static int maxSum(int N,int M,int[] A,int[] B){
        //this is default OUTPUT. You can change it.
        int result = -404;

        int index = 0;
        while(B[index] != 0){
            index ++;
        }

        if(index == A.length - 1){
            result = 0;
        }else{
            return result;
        }

        for (int i= index;i<A.length - 1;i++){
            result += A[i];
        }

        return result;
    }
}
