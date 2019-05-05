/**
 * Definition of Node:
 * class Node {
 *     public int val;
 *     public Node(int val) {
 *         this.val = val;
 *     }
 * }
 */
public class ReferenceManager {
    public Node node;

    public void copyValue(Node obj) {
        if (obj == null) {
            return;
        }
        
        if (this.node == null) {
            this.node = new Node(obj.val);
        } else {
            this.node.val = obj.val;
        }
        
    }

    public void copyReference(Node obj) {
        // copy reference from obj to node
        this.node = obj;
        return;
    }
}