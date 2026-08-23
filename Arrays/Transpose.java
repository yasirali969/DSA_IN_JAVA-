public class Transpose{

    int [][] transpose(int [][]nums){
        int [][] Result=new int[3][2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                Result[j][i]=nums[i][j];

            }
        }
        return Result;

    }
    public static void main(String []args){
        Transpose T = new Transpose();
    int[][] nums = {{1, 2, 3},{4, 5, 6}};   
    int [][] Res=T.transpose(nums);
    for(int i=0;i<Res.length;i++){
            for(int j=0;j<Res[i].length;j++){
                System.out.print(Res[i][j]+" ");
            }
            System.out.println();
        }
    }
}