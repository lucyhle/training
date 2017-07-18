
public class PermCheck {

	public static int solution(int[] A) {
        // write your code in Java SE 8
	 if (A.length == 0){
		 return -1;
	 }  
	 boolean [] b = new boolean [A.length +1];
	 for (int i =0; i < A.length ; ++i){
		 if (A[i] <= A.length)
			 b[A[i]] = true;
	 }
	 int i=1;
	 while (i < A.length +1) {
		 if (! b[i] )
			 return 0;
		 ++i;
	 }
	 return 1;
    }
	
	/*Internet soltion
	 * public static int solution(int[] A) {
        int[] counter = new int [A.length];
 
        for(int i= 0; i< A.length; i++){
            if (A[i] < 1 || A[i] > A.length) {
                // Out of range
                return 0;
            }
            else if(counter[A[i]-1] == 1) {
                // met before
                return 0;
            }
            else {
                // first time meet
                counter[A[i]-1] = 1;
            }
        }
        return 1;
    }
	 */
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int [] test = { 2,1,3};
	System.out.println(solution(test));
}
}
