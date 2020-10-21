package leetcode.link;

import leetcode.temp.ListNode;
import leetcode.utis.ListNodeUtils;

/**
 * @author ��liuxp
 * @date ��Created in 2020/4/8 17:29
 * @description ��
 *
 * ɾ�������е��ڸ���ֵ val �����нڵ㡣
 *
 * ʾ��:
 *
 * ����: 1->2->6->3->4->5->6, val = 6
 * ���: 1->2->3->4->5
 */
public class _203 {

    public static void main(String[] args) {
        int val=6;
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(6);
        firstNode.next.next.next=new ListNode(3);
        firstNode.next.next.next.next=new ListNode(4);
        firstNode.next.next.next.next.next=new ListNode(5);
        firstNode.next.next.next.next.next.next=new ListNode(6);

        ListNodeUtils.printListNode(firstNode);

        ListNode resultNode = removeElements(firstNode, val);

        ListNodeUtils.printListNode(resultNode);

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode pre=temp;
        while(pre.next!=null){
            if(pre.next.val==val){
                pre.next=pre.next.next;
            }else{
                pre=pre.next;
            }
        }
        return temp.next;

    }

}
