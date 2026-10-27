 class BSExample{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }
    Node root;

    Node insert (Node root, int value){
        if(root == null){
            return new Node(value);
        }

        if(value < root.data){
            root.left = insert(root.left,value);
        }
        else if(value > root.data){
            root.right = insert(root.right,value);
        }

        return root;
    }

    boolean Search(Node root, int target){
         if(root == null){
            return false;
         }

         if(target == root.data){
            return true;
         }

         if( target > root.data){
             return Search(root.right,target);
         }

         return Search(root.left,target);
    }

    Node Deletion(Node root,int key){
        if(root == null){
            return null;
        }

        if(key < root.data){
            root.left = Deletion(root.left,key);
        }
        else if(key > root.data){
            root.right = Deletion(root.right,key);
        }

        else{
            if(root.left==null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
        }return root;

    }

        void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }


    public static void main(String []args){
        BSExample Bs = new BSExample();
        Bs.root = Bs.insert(Bs.root,50);
        Bs.insert(Bs.root,30);
        Bs.insert(Bs.root,70);
        Bs.insert(Bs.root,25);
        Bs.insert(Bs.root,40);
        Bs.insert(Bs.root,80);
        
        System.out.println("=== Before Deletion ===");
        Bs.inorder(Bs.root);
        Bs.Deletion(Bs.root,40);
        System.out.println("=== After Deletion ===");
        Bs.inorder(Bs.root);
    }
}