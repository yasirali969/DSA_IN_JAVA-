public class ArrayEvenOdd{
    void findNumber(int []arr){
         int count=0;

        for(int i=0;i<arr.length;i++){
             int n=arr[i];
             int digit=0;
             int num = 0;
            while(n!=0){
                digit = n % 10;
                n = n /10;
                num ++;     
            }
               if(num%2 ==0){
                  count++;
               }
        }

        System.out.println(count+" ");
    }
    public static void main(String []args){
        ArrayEvenOdd AE = new ArrayEvenOdd();
        int []arr = {3,22,4342,555,65443,543254};
        AE.findNumber(arr);
        
    }
}