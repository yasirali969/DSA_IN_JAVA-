public class Duplicate{
    boolean  duplicate(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
            
        return false;
      }
    public static void main(String[]args){
        Duplicate D=new Duplicate();
        int []nums={3,2,4,1,0,3};
        boolean Answer=D.duplicate(nums);
        System.out.println("Answer :"+Answer);
    }
}