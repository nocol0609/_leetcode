package tree;

/**
 * ����������
 * 
 * @author Nocol ����5:34:10
 */
public class TreeTest {
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(4);
		tree.insert(8);
		tree.insert(2);
		tree.insert(5);
		tree.insert(1);
		tree.insert(9);
		tree.insert(3);

		// ��ӡ���ڵ�
		// System.out.println(tree.root.data);
		// System.out.println(tree.root.rigthChild.data);
		// System.out.println(tree.root.leftChild.data);
		// System.out.println(tree.root.rigthChild.leftChild.data);
		//
		// System.out.println("------------------------");
		// Node node = tree.find(1);
		// System.out.println(node.data);

		// ǰ�����
		// tree.frontOrder(tree.root);

		// �������
		// tree.inOrder(tree.root);

		// �������
		// tree.afterOrder(tree.root);

		tree.delete(9);
		tree.inOrder(tree.root);
	}
}