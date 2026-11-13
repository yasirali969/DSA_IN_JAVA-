class Hashing {
    static int size = 10;
    static int [] table = new int [size];

    static void insert(int key){

        int index = key % size;

        while(table[index]!=0){
            index = (index + 1) % size;
        }
        table[index] = key;
    }

    static boolean search(int key){
        int index = key % size;

        while(table[index]!=0){

            if(table [index]==key){
                return true;
            }

            index = (index + 1) % size;
        }

        return false;
    }

    void delete(int key){
        int index = key % size;

        while(table[index]!=0){
            if(table[index] == key){
                table[index] = -1;

                System.out.println("Deleted Successfully!");
                return;
            }

            index = (index + 1) % size;
        }
        System.out.println("Values not found!");
    }

    public static void main(String []args){
        Hashing h = new Hashing();
        h.insert(25);
        h.insert(35);
        h.insert(45);
        h.insert(73);

        System.out.println(h.search(35));
        System.out.println(h.search(50));
        h.delete(35);

        for (int i = 0; i < size; i++) {
            System.out.println(i + " : " + table[i]);
        }
    }
}