class BinarySearch1{
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

        Node insert(Node root, int value){
                if(root == null){
                    return new Node(value);
                }

                if(value > root.data){
                    root.right = insert(root.right,value);
                }
                else if(value < root.data){
                    root.left = insert(root.left,value);
                }

                return root;
        }

            // Inorder traversal: Left, Root, Right
    void inorder(Node root) {

        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

        boolean Search(Node root,int key){
            if(root == null){
                return false;
            }

            if(root.data == key){
                return true;
            }

            if(key < root.data){
                return Search(root.left, key);
            }

            return Search(root.right, key);
        }

        Node Delete(Node root,int key){
            if(root == null){
                return null;
            }

            if(key < root.data){
                root.left = Delete(root.left , key);
            }

            else if (key > root.data){
                root.right = Delete(root.right , key);
            }

            else{
                    if(root.left == null){
                        return root.right;
                    }

                    if(root.right == null){
                        return root.left;
                    }

                    Node successor = root.right;

                    while(successor.left!= null){
                        successor = successor.left;
                    }
                     root.data = successor.data;

                     root.right = Delete(root.right,successor.data);
            }

            return root;
        }
        public static void main(String []args){
            BinarySearch1 BS = new BinarySearch1();
            BS.root = BS.insert(BS.root,50);
            BS.insert(BS.root,40);
            BS.insert(BS.root,70);
            BS.insert(BS.root,55);
            BS.insert(BS.root,72);
            BS.insert(BS.root,90);

            System.out.println("inorder");
            BS.inorder(BS.root);

           System.out.println("Found  ="+BS.Search(BS.root,40));

            BS.root = BS.Delete(BS.root, 70);
            BS.inorder(BS.root);

        }
}