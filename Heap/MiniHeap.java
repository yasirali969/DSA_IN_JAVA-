class MiniHeap{
    int [] Heap;
    int size;
    int capacity;
        MiniHeap(int capacity){
            this.capacity = capacity;
            Heap = new int[capacity];
            size = 0; 
        }

    void InsertElement(int value){
        if(size == capacity){
            System.out.println("Heap is Full!");
            return;
        }

        Heap[size] = value;
        int current = size;
        size++;

        shiftUp(current);
    }

    void shiftUp(int index){
        int current = index;

        while(current > 0){
        int parent =(current - 1)/2;
        if(Heap [current] < Heap[parent]){
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

    int DeleteMin(){
        if(size == 0){
            System.out.println("Heap is Empty!");
            return -1;
        }

        int min = Heap[0];
        Heap[0] = Heap[size-1];
        size--;
        shiftDown(0);
        return min;
    }

    void shiftDown(int index){
        while(true){
            int smallest = index;
            int left = 2 *index + 1;
            int right = 2 * index + 2;

            if(left < size && Heap[left] < Heap[smallest]){
                 smallest = left;
            }

            if(right < size && Heap[right] < Heap[smallest]){
                 smallest = right;
            }

            if(smallest!=index){
                int temp = Heap[index];
                Heap[index] = Heap[smallest];
                Heap[smallest] = temp;

                index = smallest;
            }
            else{
                break;
            }
        }
        
    }

    int GetMin(){
        if(size == 0){
            System.out.println("Heap is Empty!");
            return -1;
        }

        int small =Heap[0];
        return small;
    }

    void PriorityChanges(int index , int Newvalue){
        if(index > size || index < 0){
            System.out.println("Invalid Index!");
            return;
        }

        int Oldvalue = Heap[index];
        Heap[index] = Newvalue;

        if(Newvalue < Oldvalue){
            shiftUp(index);
        }

        else if(Newvalue > Oldvalue){
            shiftDown(index);
        }
    }

    void printHeap(){
        for(int i=0;i<size;i++){
            System.out.println(Heap[i]+" ");
        }
    }

    public static void main(String[]args){
        MiniHeap MH = new MiniHeap(5);
        MH.InsertElement(60);
        MH.InsertElement(50);
        MH.InsertElement(70);
        MH.InsertElement(22);
        MH.InsertElement(20);
        MH.printHeap();
        System.out.println("Get Min"+MH.GetMin());
        System.out.println("Delete Min"+MH.DeleteMin());
        MH.printHeap();
        MH.PriorityChanges(3,80);
        MH.printHeap();


    }
}

