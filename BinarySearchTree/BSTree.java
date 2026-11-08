class BSTree{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            this.data = value;
            this.left = null;
            this.right= null;
        }
    }
    Node root;
    int size;
        BSTree(){
            this.root = null;
            this.size = 0;
        }

    void InsertElement(int value){
        root = insertRecursive(root,value);
        size++;
    }

    Node insertRecursive(Node node, int value){
        if(node == null){
            return new Node(value);
        }

        if(value < node.data){
            node.left = insertRecursive(node.left,value);
        }

        if(value > node.data){
            node.right = insertRecursive(node.right,value);
        }

        return node;
    }

    boolean Search(int value){
        return SearchRecursie(root,value);
    }
    
    boolean SearchRecursie(Node node , int value){
        if(node == null){
            return false;
        }

        if(value == node.data){
            return true;
        }

        if(value < node.data){
            return SearchRecursie(node.left,value);
        }
        else{
         return SearchRecursie(node.right,value);
        }
    }


    int findmin(){
        if(root == null){
            System.out.println("Empty!");
            return -1;
        }

        Node current = root;
        while(current.left!=null){
            current = current.left;
        }

        return current.data;
    }
    
    int findmax(){
        if(root == null){
            System.out.println("Empty!");
            return -1;
        }

        Node current = root;
        while(current.right!=null){
            current = current.right;
        }

        return current.data;
    }
    
    void inorder(Node node) {
    if (node == null) {
        return;
    }

    inorder(node.left);

    System.out.print(node.data + " ");

    inorder(node.right);
}

    void Preorder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.data);
        Preorder(node.left);
        Preorder(node.right);
    }

    void Delete(int value){
        root = deleteRecursive(root,value);
        if(root!=null || size >0){
            size--;
        }
    }

        Node deleteRecursive(Node node , int value){
            if(node == null){
                System.out.println("Error!");
                return null;
            }

            if(value < node.data){
                node.left = deleteRecursive(node.left,value);
            }

            else if(value > node.data){
                node.right= deleteRecursive(node.right,value);
            }

            else{
                if(node.left == null){
                    return node.right;
                }
                else if(node.right == null){
                    return node.left;
                }

                Node successor = findMinNode(node.right);
                node.data = successor.data;

                node.right = deleteRecursive(node.right,successor.data);
            }
            return node;

        }

        Node findMinNode(Node node){
            Node current = node;
            while(current.left!=null){
                current = current.left;
            }

            return current;
        }

        int getRoot(){
            if(root == null){
                System.out.println("Tree is Empty!");
                return -1;
            }
            return root.data;
        }

        int countNodes(Node node){
            if(node == null) return 0;
            return 1 + countNodes(node.left) + countNodes(node.right);
        }

        int getHeight(){
            return getHeightRecursive(root);
        }

        int getHeightRecursive(Node node){
                if(node == null) return 0;
                return 1+ Math.max(getHeightRecursive(node.left),getHeightRecursive(node.right));
        }
    public static void main(String [] args){
        BSTree   BST = new BSTree();
        BST.InsertElement(70);
        BST.InsertElement(40);
        BST.InsertElement(60);
        BST.InsertElement(30);

        BST.Preorder(BST.root);

        // Searching
        System.out.println("Search ="+BST.Search(30));

        // Minimum
        System.out.println("Minimum ="+BST.findmin());
        // Maximum
        System.out.println("Minimum ="+BST.findmax());

        // Get Root
        System.out.println("Root value ="+BST.getRoot());

        // CountNodes
        System.out.println("Total Nodes ="+BST.countNodes(BST.root));
        
        // Height
        System.out.println("Height ="+BST.getHeight());
    }
}