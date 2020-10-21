package leetcode.link;

import leetcode.temp.ListNode;
import leetcode.utis.ListNodeUtils;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 15:30
 *
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
 *
 * ʾ��?1:
 *
 * ����: 1->1->2
 * ���: 1->2
 * ʾ��?2:
 *
 * ����: 1->1->2->3->3
 * ���: 1->2->3
 *
 */
public class _83 {

    public static void main(String[] args) {
//        ListNode node=new ListNode(1);
//        node.next=new ListNode(1);
//        node.next.next=new ListNode(2);
//        node.next.next.next=new ListNode(3);
//        node.next.next.next.next=new ListNode(3);
        ListNode node=null;
        ListNode listNode = deleteDuplicates(node);
        ListNodeUtils.printListNode(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        //1->1->2->3->3
        //1->2->3
        while (current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return head;
    }

}
