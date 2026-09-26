class MaxHeap{
    int [] heap;
    int size;
    int capacity;
    MaxHeap(int capacity){
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    void InsertElement(int value){
        if(size == capacity){
            System.out.println("Heap is Full!");
            return;
        }
        heap[size] = value;
        int current = size;
        size++;

        shiftUp(current);
    }

    void shiftUp(int index){
        int current =index;
        while(current > 0){
        int parent = (current - 1)/2;
        if(heap[current] > heap[parent]){
            int temp = heap[current];
            heap[current] = heap[parent];
            heap[parent] = temp;
            current = parent;
        }
        else{
            break;
        }
      }
    }

    int deleteMax(){
        if(size == 0){
            System.out.println("Heap is Empty!");
            return 0;
        }

        int max =heap[0];
        heap[0] = heap[size-1];
        size--;
        shiftDown(0);
        return max;

    }

    void shiftDown(int index){
        while(true){
                int largest = index;
                int left = 2 * index +1;
                int right = 2 * index + 2;
                if(left < size && heap[left]> heap[largest]){
                      largest = left;
                }

                if(right < size && heap[right]> heap[largest]){
                      largest = right;
                }

                if(largest!=index){
                    int temp = heap[index];
                    heap[index] = heap[largest];
                    heap[largest] = temp;
                    index = largest;
                }
                else{
                    break;
                }
            }
    }


    // priority in heap
    void PriorityChanges(int index , int Newvalue){
        if(index > size || index < 0){
            System.out.println("Invalid Index!");
            return ;
        }

        int Oldvalue = heap[index];
        heap[index] = Newvalue;

        if(Newvalue > Oldvalue){
            shiftUp(index);
        }
        else if(Newvalue < Oldvalue){
            shiftDown(index);
        }
    }

    int findIndex(int value){
        for(int i=0;i<size;i++){
            if(heap[i] == value){
                return i;
            }
        }

        return -1;
    }

    int getMax(){
        if (size == 0){
            System.out.println("Heap is Empty!");
            return -1;
        }

        return heap[0];
    }
    void printHeap(){
        for(int i=0;i<size;i++){
            System.out.println(heap[i]+" ");
        }
    }

    public static void main(String [] args){
        MaxHeap MH = new MaxHeap(5);
        MH.InsertElement(10);
        MH.InsertElement(50);
        MH.InsertElement(30);
        MH.InsertElement(90);
        MH.InsertElement(180);
        MH.printHeap();

        System.out.println("Get Maximum ="+MH.getMax());

       System.out.println("Delete Max ="+ MH.deleteMax());
        System.out.println("=== After Deleting Max ===");
        MH.printHeap();

        // Test priority changes
        int index = MH.findIndex(30);
        if(index!=-1){
            System.out.println("Changing from 30 to 67");
            MH.PriorityChanges(index,67);
            System.out.println("Heap after change:");
            MH.printHeap(); // 67 should sift up
        }
    }
}
