public class Transpose_Matrix{
    public static void main(String [] args){
        int [][]arr2=new int[3][2];
        int [][]arr1={{2,3,4},{5,6,7}};

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                arr2[j][i]=arr1[i][j];
            }
        }

        for(int k=0;k<arr2.length;k++){
            for(int l=0;l<arr2[0].length;l++){
                System.out.print(arr2[k][l]+" ");
            }
            System.out.println();
        }
    }
}