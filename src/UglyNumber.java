
public class UglyNumber {
	public static boolean isUgly(int num) {
		if (num == 1)
			return true;
		if (num == 0)
			return false;
		int [] primeNumberAuthorized = {2,3,5};
		double numberAfterDivision=num;
		double decimalPart, next;
		for (int i = 0; i <primeNumberAuthorized.length; ++i) {
			decimalPart= numberAfterDivision - ((long) numberAfterDivision);
			while (decimalPart == 0.0) {
				if (numberAfterDivision== 1)
					return true;
				next= numberAfterDivision/primeNumberAuthorized[i];
				decimalPart= next - ((long) next);
				if (decimalPart == 0){
					numberAfterDivision = next;
				}
			}
		}
		
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUgly(17));
	}

}
