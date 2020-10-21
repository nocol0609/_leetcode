package leetcode.link;

import leetcode.temp.ListNode;
import leetcode.utis.ListNodeUtils;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 16:09
 *
 * ��תһ��������
 *
 * ʾ��:
 *
 * ����: 1->2->3->4->5->NULL
 * ���: 5->4->3->2->1->NULL
 *
 */
class _206 {

    public static void main(String[] args) {
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(3);
        firstNode.next.next.next=new ListNode(4);
        firstNode.next.next.next.next=new ListNode(5);
        ListNodeUtils.printListNode(firstNode);
        ListNode result = reverseList(firstNode);
        ListNodeUtils.printListNode(result);
    }

    public static ListNode reverseList(ListNode head) {
        //ǰָ�
        ListNode preNode=null;
        ListNode current=head;
        //1->2->3->4->5->NULL
        //5->4->3->2->1->NULL
        while (current!=null){
            //��ȡ��ǰ�ڵ����һ�ڵ㣬���ڴ洢��һ��ѭ����ͷ�ڵ�
            ListNode next=current.next;
            current.next=preNode;
            //ǰָᘺ���
            preNode=current;
            current=next;
        }
        return preNode;
    }

}
