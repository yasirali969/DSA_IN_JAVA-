public class RotateArray{
       
    public void Rotate(int []nums,int k){
        
        for(int i=0;i<k;i++){
           int element=nums[nums.length-1];
            for(int j=nums.length-2;j>=0;j--){
            nums[j+1]=nums[j];
        }
        nums[0]=element;
      }
    }

    void Display(int []nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String []args){
        RotateArray RA=new RotateArray();
        int []nums={2,3,4,5,6,7};
        int k=3;
        RA.Rotate(nums,k);
        RA.Display(nums);
    }
}