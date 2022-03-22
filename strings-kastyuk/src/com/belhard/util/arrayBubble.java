package com.belhard.util;

public class arrayBubble {

	public static void bubbleSort(int[] nums){     
        
		for (int i = 0; i < nums.length; i++){  
            for (int j = nums.length - 1; j > i; j--){       
                if(compareMasNums(nums[i], nums[j])) {
                	int archiveNumber = nums[i];      
                    nums[i] = nums[j];       
                    nums[j] = archiveNumber;      
                }      
            }
        }
    }
	
	public static void reverseBubbleSort(int[] nums){     
        
		for (int i = 0; i < nums.length; i++){  
            for (int j = nums.length - 1; j > i; j--){       
                if(nums[j] > nums[j - 1]) {
                	int archiveNumber = nums[j];      
                    nums[j] = nums[j - 1];       
                    nums[j - 1] = archiveNumber;      
                }      
            }
        }
    }
	
	public static boolean compareMasNums(Integer numsA, Integer numsB) {
        return numsA.compareTo(numsB) > 0;
    }

}
