import java.util.Scanner;

public class Arrays{
    void traverse(int []arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void Update(int []arr,int a,int b,int size){
        arr[a]=b;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    void Search(int []arr,int S,int size){
        boolean Found=false;
        for(int i=0;i<size;i++){
            if(arr[i]==S){
                 Found=true;
                System.out.println("Found at index "+i);
            }
            
        }
        if(Found){
             System.out.println("Not Found!");
        }
    }

    void Sort(int []arr,int size){

        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+" ");

        }
    }
        void insert(int []arr,int position,int value,int size){
            arr[position]=value;
            size++;

            for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        }

        void Delete(int []arr,int size,int pos){
             for(int i=pos;i<size-1;i++){
                arr[i]=arr[i+1];
             }

             size--;

             for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        }
    


    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        Arrays A=new Arrays();
        int []arr=new int[10];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=3;
        arr[4]=5;

       int size=5;
            System.out.println("\n===== ARRAY OPERATIONS =====");
            System.out.println("1. Traverse");
            System.out.println("2. Update");
            System.out.println("3. Search");
            System.out.println("4. Sort");
            System.out.println("5. Insert");
            System.out.println("6. Delete");
            System.out.println("7. Exit");
       
        

        System.out.println("Enter Your Choice:");
        int choice=s.nextInt();



       switch(choice){
        case 1:
        A.traverse(arr,size);
        break;

        case 2:
        System.out.println("Enter the index :");
        int a=s.nextInt();
        System.out.println("Enter new value:");
        int b=s.nextInt();
        A.Update(arr,a,b,size);
        break;

        case 3:
           System.out.println("Enter the element to Search :");
           int S=s.nextInt();
           A.Search(arr,S,size);
           break;

        case 4:
           A.Sort(arr,size);
           break;
        
        case 5:
            System.out.println("Position to insert :");
            int position=s.nextInt();
            System.out.println("Value :");
            int value=s.nextInt();
            
            A.insert(arr,position,value,size);
            break;

        case 6:
            System.out.print("Enter the position to delete:");
            int pos=s.nextInt();
            A.Delete(arr,size,pos);
       }
    }
}