// 5(3(1,2),7(6,11(10,null)))

public class bracket_entry {
    public static void main(String[] args) {
        Node root = new Node("5");
        Node l1 = new Node("3");
        Node r1 = new Node("7");
        Node ll1 = new Node("1");
        Node lr1 = new Node("2");
        Node rl1 = new Node("6");
        Node rr1 = new Node("11");
        Node rrr1 = new Node("10");

        root.left = l1;
        root.right = r1;
        l1.left = ll1;
        l1.right = lr1;
        r1.left = rl1;
        r1.right = rr1;
        rr1.left = rrr1;

        Iterr.View(root);
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
    static void View(Node n) {
        if (n != null) {
            System.out.printf("%s", n.value);
            if (n.left != null || n.right != null) {
                System.out.printf("(");
                if (n.left != null) {
                    View(n.left);
                }
                else {
                    System.out.printf("none");
                }
                System.out.printf(",");
                if (n.right != null) {
                    View(n.right);
                }
                else {
                    System.out.printf("none");
                }
                System.out.printf(")");
            }
        }
    }
}
