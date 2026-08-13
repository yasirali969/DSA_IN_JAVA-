public class Matrices_Sum{
    public static void main(String [] args){
        int [][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int [][] arr2={{11,12,13},{14,15,16},{17,18,19}};
        int [][] arr3=new int[3][3];

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[0].length;j++){
                
                arr3[i][j]=arr1[i][j] + arr2[i][j];   
            }
        }

          for(int a=0;a<arr3.length;a++){
            for(int n=0;n<arr3[0].length;n++){
                System.out.print(arr3[a][n]+" ");
            }
            System.out.println();
          }
   }
}