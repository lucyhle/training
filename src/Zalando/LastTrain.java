package Zalando;

public class LastTrain {
	public int solution(int[] A) {
        // write your code in Java SE 8
	    {
	        int count = 0;
	        int multiply = 0;
	        for (int car :  A)
	        {
	            if (car == 0)
	            {
	                multiply = multiply + 1;
	            }
	            if (multiply > 0)
	            {
	                if (car == 1)
	                {
	                    count = count + multiply;
	                    if (count > 1000000000)
	                    {
	                        return -1;
	                    }
	                }
	            }
	        }
	        return count;
	    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
