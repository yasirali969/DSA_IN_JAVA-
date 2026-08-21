public class TwoSum{

    public static int []Sum(int []arr,int target){
        int []indices=new int [2];
        int size=arr.length;
        int []arr1=new int [size];
        int []arr2=new int [size];
        for(int i=0;i<size;i++){
            arr1[i]=arr[i];
        }

        for(int j=0;j<size;j++){
            arr2[j]=arr[j];
        }


        for(int k=0;k<arr1.length;k++){
            for(int l=k+1;l<arr2.length;l++){
                if(arr[k] + arr[l]==target){
                    indices[0]=k;
                    indices[1]=l;
                    return indices;
                }
            }
            
        }
        int [] Wrongind=new int [2];
            Wrongind[0]=-1;
            Wrongind[1]=-1;
            return Wrongind;
            }
        
    
    
    public static void main(String []args){
        TwoSum TS=new TwoSum();
        int []nums = {2,7,11,15};
        int target =  15;
        int [] ArraySum=TS.Sum(nums,target);
        System.out.print(" [");
        for(int i=0;i<ArraySum.length;i++){
        System.out.print( ArraySum[i]+" ");
        }
        System.out.print("]");
    }
}
