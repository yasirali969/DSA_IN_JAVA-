public class Diagonal_Matrix{
    public static void main(String [] args){
        int [][]arr={{1,0,0,0},{0,2,0,0},{0,0,3,0},{0,0,0,4}};

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
    }
}