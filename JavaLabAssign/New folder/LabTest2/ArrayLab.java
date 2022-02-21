class ArrayLab{
static int temp;
   public static void main(String[] args){
     int[] nums = new int[5];
    nums[0] = 1;
    nums[1] = 2;
    nums[2] = 3;
    nums[3] = 5;
    nums[4] = 4;
    int result=getSecondSmallest(nums); 
    System.out.println("secondsmallestnumber:"+result);
 
  }
 static int getSecondSmallest(int[] nums){
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){ 
             if(nums[i]<nums[j]){
                  break;     
              } 
             else{ 
             temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
        }
      }
    }
     return nums[1];
  }
}