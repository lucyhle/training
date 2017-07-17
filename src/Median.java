
public class Median {

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0,j =0,k =0;
		int [] sortedFinalArray = new int[nums1.length + nums2.length];
		while (i< nums1.length && j < nums2.length) {
			if (nums1[i] < nums2[j]) {
				sortedFinalArray[k] = nums1[i];
				++i;
			} else {
				sortedFinalArray[k] = nums2[j];
				++j;
			}
			++k;
		}
		while (i< nums1.length) {
			sortedFinalArray[k] = nums1[i];
			++i;
			++k;
		}
		while (j< nums2.length) {
			sortedFinalArray[k] = nums2[j];
			++j;
			++k;
		}
		if (sortedFinalArray.length == 0)
			return 0;
		if (sortedFinalArray.length < 2) {
			return sortedFinalArray[0];
		}
		if(((sortedFinalArray.length/2)%2)==0){
			 // pair
			double inter = sortedFinalArray[(sortedFinalArray.length/2)-1]+sortedFinalArray[(sortedFinalArray.length/2)];
			return (inter/2);
		} else {
			return sortedFinalArray[(sortedFinalArray.length/2)];
		}
			  

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {};
		int [] b = {1,2,3,4,5};
		System.out.println(findMedianSortedArrays(a,b));

	}

}
