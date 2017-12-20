import java.util.LinkedList;
import java.util.Queue;

/* Class to represent Tree node */
class Node {
    int data;
    Node left, right;
 
    public Node(int item) {
        data = item;
        left = null;
        right = null;
    }
}
public class BreadthFirstSearch {
	Node root;
	public static void main(String[] args) {
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.root = new Node(1);
		bfs.root.left = new Node(2);
		bfs.root.right = new Node(3);
		bfs.root.left.left = new Node(4);
		bfs.root.left.right = new Node(5);
		System.out.println("Breadth first traversal/search of binary tree is : ");
		bfs.printLevelOrder();

	}
	private void printLevelOrder() {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node tempNode = queue.poll();
			System.out.println(tempNode.data + " ");
			
			if(tempNode.left != null){
				queue.add(tempNode.left);
			}
			if(tempNode.right != null){
				queue.add(tempNode.right);
			}
		}
		
	}

}
