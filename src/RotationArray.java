
public class RotationArray {
	public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int [] B = new int [K-1];
		int j = 0;
		for (int i = 0 ; i < A.length ; ++i) {
			if (i<K-1){
				B[i] = A[i];
				A[i] = A[K-1+i];
			}else if (i <= A.length - K){
				A[i] = A[K-1+i];

			} else {
				A[i] = B[j];
				j++;
			}
		}
		return A;
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {3, 8, 9, 7, 6};
		int [] plop = solution(test, 3);
		
		System.out.println("end");
	}

}
