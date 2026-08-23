public class RowColSum{
    int Row1(int [][]nums){
            int sum=0;
            for(int i=0;i<nums[0].length;i++){
                sum+=nums[0][i];
            }
            return sum;
        }

         int Row2(int [][]nums){
            int sum=0;
            for(int i=0;i<nums[0].length;i++){
                sum+=nums[1][i];
            }
            return sum;
        }

         int Row3(int [][]nums){
            int sum=0;
            for(int i=0;i<nums[0].length;i++){
                sum+=nums[2][i];
            }
            return sum;
        }

        int col1(int [][]nums){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i][0];
            }
            return sum;
        }

        int col2(int [][]nums){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i][1];
            }
            return sum;
        }

        int col3(int [][]nums){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i][2];
            }
            return sum;
        }
    public static void main(String []args){
        

    int [][] nums={{1,2,3},{5,6,7},{9,10,11}};
    RowColSum RC=new RowColSum();
    int R1=RC.Row1(nums);
    int R2=RC.Row2(nums);
    int R3=RC.Row3(nums);
    int C1=RC.col1(nums);
    int C2=RC.col2(nums);
    int C3=RC.col3(nums);
    System.out.println("Sum of Row 1 ="+R1);
    System.out.println("Sum of Row 2 ="+R2);
    System.out.println("Sum of Row 3 ="+R3);
    System.out.println("Sum of Column 1 ="+C1);
    System.out.println("Sum of Column 2 ="+C2);
    System.out.println("Sum of Column 3 ="+C3);
    }
}