class MaxiHeap{
    int capacity;
    int size;
    int [] Heap;
     MaxiHeap(int capacity){
        this.capacity = capacity;
        Heap = new int[capacity];
     }

     void InsertElement(int value){
        if(size == capacity){
            System.out.println("Heap id full!");
            return;
        }

        Heap[size] = value;
        int current = size;
        size++;
        shiftUp(current);
     }

     void shiftUp(int index){
        int current = index;
         while(current>0){
            int parent = (current - 1)/2;
            if(Heap[current] > Heap[parent]){
                int temp = Heap[current];
                Heap[current] = Heap[parent];
                Heap[parent] = temp;

                current = parent;

            }
            else{
                break;
            }
         }
     }

     int DeleteMax(){
        if(size == 0){
            System.out.println("Heap is Empty!");
            return -1;
        }
        int max =Heap[0];
        Heap[0]= Heap[size-1];
        shiftDown(0);
        size--;
        return max;
     }

     void shiftDown(int index){
        while(true){
        int smallest = index;
        int left = 2*index + 1;
        int right = 2*index + 2;

        if(left < size && Heap[left] > Heap[smallest]){
            smallest = left;
        }

        if(right <size && Heap[right] > Heap[smallest]){
            smallest = right;
        }

        if(smallest!=index){
            int temp = Heap[index];
            Heap[index]= Heap[smallest];
            Heap[smallest] = temp;

            index = smallest;
        }
        else{
            break;
        }
        }

     }

     void printHeap(){
        for(int i=0;i<size;i++){
            System.out.println(Heap[i]+" ");
        }
     }

     public static void main(String[] args){
        MaxiHeap Mx= new MaxiHeap(5);
        Mx.InsertElement(40);
        Mx.InsertElement(60);
        Mx.InsertElement(10);
        Mx.InsertElement(70);
        Mx.InsertElement(90);

        Mx.printHeap();
        System.out.println("Delete Min ="+Mx.DeleteMax());
        Mx.printHeap();
     }
}