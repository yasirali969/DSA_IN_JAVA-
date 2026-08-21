public class MyArray{
    int []arr;
    int size;

    MyArray(int capacity){
        arr=new int [capacity];
        size=0;
    }
    
    void insert(int index,int value){

        for(int i=size;i>=index;i--){
            arr[i+1]=arr[i];
        }

        arr[index]=value;
        size++;

    }

    void Delete(int index){
        for(int i=0;i<size;i++){
            if(i==index){
                arr[i]=arr[i+1];
                size--;
            }
        }
    }

    void Update(int index,int value){
        for(int i=0;i<size;i++){
            if(index==i){
                arr[index]=value;
            }
        }
    }

    void insertAfter(int aftervalue,int value){
        int index=0;
        for(int i=0;i<size;i++){
                if(arr[i]==aftervalue){
                     index=i;
                }
            }
        
        for(int i=size-1;i>index;i--){
            arr[i+1]=arr[i];
        }

        arr[index+1]=value;
        size++;     
        }
    
    void UpdateValue(int value,int Updatedvalue){
        for(int i=0;i<size;i++){
            if(arr[i]==value){
                arr[i]=Updatedvalue;
            }
        }
    }

    void DeleteByValue(int Value){
        int d=0;
        for(int i=0;i<size;i++){
            if(arr[i]==Value){
                d=i;
            }
        }

        for(int i=d;i<size;i++){
            arr[i]=arr[i+1];
            
        }
        size--;
           
        }

         int Search(int value){
            for(int i=0;i<size;i++){
                if(arr[i]==value){
                    return i;
                }
            }
            return -1;
         }



    void Display(){
        for(int i=0;i<size;i++){
            System.out.println("Array ="+arr[i]);
        }
    }
    public static void main(String []args){
        MyArray MA=new MyArray(10);
        MA.insert(0,2); // 1->2  
        MA.insert(0,3); // ->3
        MA.insert(1,6);

       // MA.Delete(1);
       // MA.Update(1,23);
        MA.insertAfter(3,25);
        MA.UpdateValue(6,49);
        MA.DeleteByValue(49);
        int index=MA.Search(54);
        System.out.println("Value find at index ="+index);

        MA.Display();
        
       
        
    }
}