package com.javacodegeeks.junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class RotateArray {	

	    public int[] rotate(int[] nums, int k) {
	        int n = nums.length;
	        k = k%n;
	        nums = reverse(nums, 0, n-k-1);
	        System.out.println(Arrays.toString(nums));
	        nums = reverse(nums, n-k, n-1);
	        System.out.println(Arrays.toString(nums));
	        nums = reverse(nums, 0, n -1);
	        System.out.println(Arrays.toString(nums));
	        return nums;

	    }

	    public int[] reverse(int[] nums, int begin, int end) {
	        if (begin == end) return nums;
	        int e = end;
	        for (int i = begin; i < (begin+end)/2+1; i++) {
	        	int temp;
	        	temp = nums[i];
	        	nums[i] = nums[e];
	        	nums[e] = temp;
	        	e--;
	        	//swap(nums[i], nums[end-i]);	        	
	        }
	        return nums;
	    }

	    public void swap(int a, int b) {
	        int temp;
	        temp = a;
	        a = b;
	        b =temp;
	    }
	    
	    public int[] rotate2(int nums[], int k) {
	    	int n = nums.length;
	    	k = k%n;
	    	if (n==0 || n==1 || k==0) return nums;
	    	for(int i = 1; i <=k ; i++){
	    		int temp = nums[n-1];
	    		for(int j = n-1; j > 0; j--) {
	    			nums[j] = nums[j-1];
	    			
	    		}
	    		nums[0] = temp;
	    	}
	    	return nums;
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray ra = new RotateArray();
		int[] nums = {1, 2, 3, 4, 5,6,7,8,9};
		int k = 40;
		int[] expected = {3, 4, 5, 1, 2};
		int [] actual1 = ra.rotate(nums, k);
		assertArrayEquals(actual1, expected);

	}

}
