public class MatrixStats{
    int Largest(int [][]nums){
        int large=nums[0][0];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]>large){
                    large=nums[i][j];
                }
            }
        }
        return large;

    }

    int Smallest(int [][]nums){
        int small=nums[0][0];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]<small){
                    small=nums[i][j];
                }
            }
        }
        return small;

    }
      
      int Sum(int [][]nums){
        int sum=0;;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                    sum+=nums[i][j];
            }
        }
        return sum;
    }


      int Average(int [][]nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                    sum+=nums[i][j];
            }
        }
        return sum/(nums.length);
    }

    public static void main(String []args){
        MatrixStats MS=new MatrixStats();
        int [][] nums={{1,2,3,4},{4,5,6,7}};
        int large=MS.Largest(nums);
        int small=MS.Smallest(nums);
        int sum=MS.Sum(nums);
        int Avg=MS.Average(nums);
        System.out.println("Largest ="+large);
        System.out.println("Smallest ="+small);
        System.out.println("Sum ="+sum);
        System.out.println("Avg ="+Avg);
    }
}