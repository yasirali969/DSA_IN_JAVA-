public class Addition_Matrix{
    public static void main(String [] args){
    int [][]arr={{8,24,31,49},{21,43,52,64},
    {32,54,63,11}};

    int sum_r1=0;
    int sum_r2=0;
    int sum_r3=0;

    int sum_col1=0;
    int sum_col2=0;
    int sum_col3=0;
    int sum_col4=0;

        for(int j=0;j<arr[0].length;j++){
                sum_r1+=arr[0][j];                                    
        }

        for(int j=0;j<arr[0].length;j++){
                sum_r2+=arr[1][j];                                    
        }

        for(int j=0;j<arr[0].length;j++){
                sum_r3+=arr[2][j];                                    
        }
    

        for(int i=0;i<arr.length;i++){
              sum_col1 += arr[i][0];
            }

        for(int i=0;i<arr.length;i++){
              sum_col2 += arr[i][1];
            }
         
        for(int i=0;i<arr.length;i++){
              sum_col3 += arr[i][2];
            }
        
        for(int i=0;i<arr.length;i++){
              sum_col4 += arr[i][3];
            }

         
        
        System.out.println(sum_r1);
        System.out.println(sum_r2);
        System.out.println(sum_r3);

        System.out.println(sum_col1);
        System.out.println(sum_col2);
        System.out.println(sum_col3);
        System.out.println(sum_col4);

    }
    }
