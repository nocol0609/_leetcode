package leetcode.temp;

/**
 * @author ��liuxp
 * @date ��Created in 2020/1/3 11:40
 * @description ��
 */
public class ListNode {
    public int val;
    public ListNode next;

    /**
     * ͷ���
     */
    public ListNode head;

    public ListNode() {
        head=null;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public void display() {
        // ��ȡ��ǰ�ڵ�
        ListNode current = head;
        while (current != null) {
            // �ݹ���ʾͷ�ڵ�
            current.display();
            current = current.next;
        }
        System.out.println();
    }

    /**
     * �����ڵ㣬β������
     */
    public void addNode(long value){
        ListNode newNode=new ListNode((int)value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode temp=head;
        //������β���
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
}