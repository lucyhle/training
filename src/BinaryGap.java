
public class BinaryGap {
	static int solution(int n) {
	    return solution(n, 0, 0);
	}
//plop
	static int solution(int n, int max, int current) {
	    if (n == 0)
	        return max;
	    else if (n % 2 == 0)
	        return solution(n / 2, max, current + 1);
	    else
	        return solution(n / 2, Math.max(max, current), 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
