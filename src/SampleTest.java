
public class SampleTest {

	public static int solution(int[] A) {
		int sumTotal = 0;     
		int subSum = 0; 
		
		for (int i = 0; i < A.length; ++i)
			sumTotal += A[i];
		 
		for (int i = 0; i < A.length; ++i)
		{
			sumTotal -= A[i]; 		 
			if (subSum == sumTotal) {
				return i;
			}			 
			subSum += A[i];
		}		
		return -1;
    }
	
	public static int solutionKev (int [] A) {
		int equi = -1;

				if ( A.length == 0 ){
				    return equi;
				}

				for (int i = 0; i < A.length; ++i ) {
				    int leftSum = 0;
				    int rightSum = 0;
				    for (int j = 0; j < i; ++j ) {
				        leftSum += A[j];
				    }
				    for (int j = i+1; j < A.length; ++j ) {
				        rightSum += A[j];
				    }
				    if (leftSum == rightSum) {
				        equi = i;
				    }
				}

				return equi;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {-1, 3, -4, 5, 1, -6, 2, 1};
		System.out.println(solution(test));
	}

}
