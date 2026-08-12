public class Matrix_Statics{
    public static void main(String [] args){
    int [][]arr={{8,24,31,49},{21,43,52,64},
    {32,54,63,11},{65,73,81,90}};

    int largest=arr[0][0];
    int smallest=arr[0][0];
    int sum = 0;

//   System.out.println("Length ="+ arr.length);

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]<smallest){
                smallest=arr[i][j];
            }
        }
    }


    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]>largest){
                largest=arr[i][j];
            }
        }
    }

    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            sum+=arr[i][j];
            }
        }
    

    System.out.println("Largest Element in array ="+largest);
    System.out.println("Smallest Element in array ="+smallest);
    System.out.println("Sum of Elements in array ="+sum);
    System.out.println("Average of Elements in array ="+ (double)sum/(arr.length* arr[0].length));


    }
}