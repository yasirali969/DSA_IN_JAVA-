public class Remove{
    public int removeElement(int []nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                continue;
            }
            nums[k]=nums[i];
            k++;
        }
        return k;
    }
    public static void main(String []args){
        Remove R=new Remove();
        int []nums={2,3,3,2};
        int val=3;
        int k=R.removeElement(nums,val);
        System.out.print("k ="+k);
    }
}