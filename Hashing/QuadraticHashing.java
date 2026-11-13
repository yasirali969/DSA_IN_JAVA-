class QuadraticHashing{
       static int size = 10;
       static int [] table = new int[size];
     void insert(int key){

        int index = key % size;
        int i = 0;
        while(table[index]!=0 && i<size){
              i++;

              index =(key%size + i*i) % size;
        }

        if(i < size){
            table[index]=key;
        }
        else{
            System.out.println("No avaialbe position!");
        }

    }   

    boolean search(int key){
        int index = key % size;
        int i =0;

        while(table[index]!=0 && i<size){

            if(table[index]==key){
                return true;
            }
            i++;
            index = (key % size + i * i) % size;
        }

        return false;
    }

    static void display() {
    for (int i = 0; i < size; i++) {
        System.out.println(i + " : " + table[i]);
    }
    }
    public static void main(String []args){
        QuadraticHashing Q = new QuadraticHashing();
        Q.insert(30);
        Q.insert(51);
        Q.insert(95);
        Q.insert(40);

        System.out.println(Q.search(95));
        Q.display();
    }
    }
