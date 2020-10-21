package leetcode.link;

import leetcode.temp.ListNode;
import leetcode.utis.ListNodeUtils;

/**
 * @author ��liuxp
 * @date ��Created in 2020/4/16 9:14
 * @description ��
 *
 *  ��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ�
 *
 * ʾ����
 *
 * ���룺1->2->4, 1->3->4
 * �����1->1->2->3->4->4
 *
 */
public class _21 {

    public static void main(String[] args) {
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(4);

        ListNode secondeNode=new ListNode(1);
        secondeNode.next=new ListNode(3);
        secondeNode.next.next=new ListNode(4);

        ListNodeUtils.printListNode(firstNode);
        ListNodeUtils.printListNode(secondeNode);
        ListNode listNode = mergeTwoLists(firstNode, secondeNode);
        ListNodeUtils.printListNode(listNode);

    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode tempHead=new ListNode(0);
        ListNode current=tempHead;

        //1->2->4, 1->3->4
        while (l1!=null && l2!=null){
            int num1=(l1==null)?0:l1.val;
            int num2=(l2==null)?0:l2.val;
            if(num1<=num2) {
                current.next=l1;
                current=current.next;
                l1=l1.next;
            }else {
                current.next=l2;
                current=current.next;
                l2=l2.next;
            }

            //current�������еģ���������һ������Ϊnullʱ������һ��
            if(null==l1){
                current.next=l2;
            }else {
                current.next=l1;
            }
        }
        return tempHead.next;
    }

}
