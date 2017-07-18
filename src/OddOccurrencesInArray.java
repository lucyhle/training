
public class OddOccurrencesInArray {
	public static int solution(int[] A) {
	        // write your code in Java SE 8
		if ( A.length == 0) {
			return -1;  
		}
		int pair = 0;
		
		for (int i = 0 ; i < A.length ; ++i) {
			pair ^= A[i];
		}
		return pair;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = { 1,2,4,2,1};
		System.out.println(solution(test));
	}

}
