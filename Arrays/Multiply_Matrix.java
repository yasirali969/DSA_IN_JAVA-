public class Multiply_Matrix{
    public static void main(String [] args){
        int [][]arr1={{1,2},{3,4}};
        int [][]arr2={{5,6},{7,8}};
        int [][]arr3=new int[2][2];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2[0].length;j++){
                for(int k=0;k<arr2.length;k++){
                    arr3[i][j] +=arr1[i][k] * arr2[k][j];
                }
            }
        }
            for(int l=0;l<arr3.length;l++){
                for(int m=0;m<arr3[0].length;m++){
                    System.out.print(arr3[l][m]+" ");
                }
                System.out.println();
            }
        }

    
}