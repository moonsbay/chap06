
public class CallbyReference {
	static void process(int[] nums) {
		nums[0] = 900;
		nums[1] = 800;
		for(int n : nums)
			System.out.printf("%d ", n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {10, 9, 5, 4};
		process(nums);
		
		System.out.println();
		
		for(int n : nums)
			System.out.printf("%d ", n);
				
	}

}
