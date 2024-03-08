import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Tree {
    Node root;

    Tree() {
        root = null;
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    void deleteKey(int key, boolean deleteFromLeft) {
        root = deleteRec(root, key, deleteFromLeft);
    }

    Node deleteRec(Node root, int key, boolean deleteFromLeft) {
        if (root == null) {
            return root;
        }

        if (key < root.data) {
            root.left = deleteRec(root.left, key, deleteFromLeft);
        } else if (key > root.data) {
            root.right = deleteRec(root.right, key, deleteFromLeft);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            if (deleteFromLeft) {
                root.data = maxValue(root.left);
                root.left = deleteRec(root.left, root.data, deleteFromLeft);
            } else {
                root.data = minValue(root.right);
                root.right = deleteRec(root.right, root.data, deleteFromLeft);
            }
        }
        return root;
    }

    int maxValue(Node root) {
        int maxv = root.data;
        while (root.right != null) {
            maxv = root.right.data;
            root = root.right;
        }
        return maxv;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    void toListWithPlaceholders() {
        if (root == null) {
            System.out.println("List with placeholders: []");
            return;
        }

        List<Object> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp != null) {
                list.add(temp.data);
                queue.add(temp.left);
                queue.add(temp.right);
            } else {
                list.add(null);
                list.add(null);
            }
        }
        System.out.println("1D Array Representation: " + list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        char choice;

        do {
            int input;

            do {
                System.out.println("Choose the method: 1. Insert 2. Delete 3. End Traversal:");
                input = sc.nextInt();

                switch (input) {
                    case 1:
                        System.out.print("Enter the value to insert: ");
                        int item = sc.nextInt();
                        sc.nextLine();
                        tree.insert(item);
                        break;

                    case 2:
                        System.out.print("Enter the value to delete: ");
                        int item2 = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Delete from:\n1. Left\n2. Right\nEnter your choice: ");
                        int deleteFrom = sc.nextInt();
                        sc.nextLine();
                        tree.deleteKey(item2, deleteFrom == 1);
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid input");
                        break;
                }
            } while (input != 3);

            tree.toListWithPlaceholders();
            System.out.println("Pre-order traversal:");
            tree.preOrderTraversal(tree.root);
            System.out.println("\nIn-order traversal:");
            tree.inOrderTraversal(tree.root);
            System.out.println("\nPost-order traversal:");
            tree.postOrderTraversal(tree.root);

            System.out.println("\nDo you want to try again? (y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    sc.close();
    }
}



