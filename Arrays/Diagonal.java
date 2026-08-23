public class Diagonal{
    int diagonal(int [][]nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<=i;j++){
                sum+=nums[i][j];
            }
        }
        return sum;
    }
    public static void main(String []args){
        Diagonal D=new Diagonal();
    int[][] nums = {{1,  2,  3,  4},{5,  6,  7,  8},
    {9, 10, 11, 12},{13, 14, 15, 16}};

        int s=D.diagonal(nums);
        System.out.println("Sum ="+s);
    }
}