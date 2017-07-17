
public class DuplicateRemove {
	public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
        	return nums.length;
        }
        
        int duplicate = 0;
        for (int i=1; i < nums.length ; ++i) {
        	if (nums[i] == nums[i-1]){
        		++ duplicate ;
        	}
        	else {
        		nums[i - duplicate] = nums[i];
        	}
        }
        return nums.length -duplicate;
    }
	public static int removeDuplicates2(int[] nums) {
        if (nums.length <= 2) {
        	return nums.length;
        }
        
        int duplicate = 0;
        for (int i=2; i < nums.length ; ++i) {
        	if (nums[i] == nums[i-1] && nums[i] == nums[i-duplicate-2]){
        		++ duplicate ;
        	}
        	else {
        		nums[i - duplicate] = nums[i];
        	}
        }
        return nums.length -duplicate;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long startTime = System.nanoTime();
		
		int [] plop = {1,1,1,2,2,3};
		System.out.println(removeDuplicates2(plop));
		

		final long duration = System.nanoTime() - startTime;
		System.out.println(duration);
		
	}

}
