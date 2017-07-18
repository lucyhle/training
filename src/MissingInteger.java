public class MissingInteger {
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8
		 if (A.length == 0){
			 return -1;
		 }
		 boolean [] b = new boolean [A.length +1];
		 for (int i =0; i < A.length ; ++i){
			 if (A[i] < A.length)
				 b[A[i]] = true;
		 }
		 int i=1;
		 while (true) {
			 if (! b[i] )
				 return i;
			 ++i;
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = { 6};
		System.out.println(solution(test));
	}

}
