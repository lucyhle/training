
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int [] result = {-1,-1} ;
		for (int j = 0; j<= nums.length -2; ++j){
		    for (int i =j+1 ; i<=nums.length -1; i++) {
		    	System.out.println("START");
		    	System.out.println(i);
		    	System.out.println(j);
		    	if (nums[j] + nums[i] == target)
		    	{
		    		return new int [] {i,j};
		    	}
		    }
		}
	    return result;
    }      	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] plop = {3,2,4};
		int target = 6;
		TwoSum p = new TwoSum();
		int [] result = p.twoSum(plop,target);
		System.out.println("RESULT");
		System.out.println(result[0]);
		System.out.println(result[1]);
		
		System.out.println("-------RESULT");
		int b=0;
		System.out.println(b ++); 
		b=0;
		System.out.println(++b);                        
		
	}

}
