// package HW_tree;

public class tree {
    public static void main(String[] args) {
        Node root = new Node("root");
        Node l1 = new Node("l1");
        Node r1 = new Node("r1");
        Node ll1 = new Node("ll1");
        Node lr1 = new Node("lr1");
        Node rl1 = new Node("rl1");
        Node rr1 = new Node("rr1");
        Node lll1 = new Node("lll1");
        Node rrr1 = new Node("rrr1");

        root.left = l1;
        root.right = r1;
        l1.left = ll1;
        l1.right = lr1;
        ll1.left = lll1;
        r1.left = rl1;
        r1.right = rr1;
        rr1.right = rrr1;

        System.out.println("Прямой обход дерева в глубину");
        Iterr.ViewPreOrder(root, " ");
        System.out.println();
        System.out.println("Центрированный обход дерева в глубину");
        Iterr.ViewInOrder(root, " ");
        System.out.println();
        System.out.println("Обратный обход дерева в глубину");
        Iterr.ViewPostOrder(root, " ");
        System.out.println();
    }
}
class Node {
    public Node(String v) {
        value = v;
    }
    String value;
    
    Node left;
    Node right;
}

class Iterr {
    static void ViewPreOrder(Node n, String space) {
        if (n != null) {
            System.out.printf("%s%s\n", space, n.value);
            if (n.left != null) {
                ViewPreOrder(n.left, space + " ");
            }

            if (n.right != null) {
                ViewPreOrder(n.right, space + " ");
            }
        }
    }

    static void ViewInOrder(Node n, String space) {
        if (n != null) {
            if (n.left != null) {
                ViewInOrder(n.left, space + " ");
            }
            System.out.printf("%s%s\n", space, n.value);

            if (n.right != null) {
                ViewInOrder(n.right, space + " ");
            }
        }
    }

    static void ViewPostOrder(Node n, String space) {
        if (n != null) {
            if (n.left != null) {
                ViewPostOrder(n.left, space + " ");
            }
            if (n.right != null) {
                ViewPostOrder(n.right, space + " ");
            }
            System.out.printf("%s%s\n", space, n.value);
        }
    }
}
