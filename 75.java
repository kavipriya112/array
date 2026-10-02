class Solution {
    public void sortColors(int[] nums) {
        for(int turns=0; turns<nums.length-1; turns++){
            for(int j=0; j<nums.length-1-turns; j++){
                if(nums[j]>nums[j+1]){
                    //swap
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]= temp;

                }
            }
        }
    }
    public void printarr(int[] nums){
        for(int k=0; k<nums.length; k++){
            System.out.print(nums[k]);
        }
        System.out.println();
    }
    public void  main(String[] args){
        int nums[]= {2,0,2,1,1,0};
        sortColors(nums);
        printarr(nums);

    }
}
