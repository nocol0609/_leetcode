package leetcode.link;

import leetcode.temp.ListNode;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 16:55
 *
 * ���ж�һ�������Ƿ�Ϊ��������
 *
 * ʾ�� 1:
 *
 * ����: 1->2
 * ���: false
 * ʾ�� 2:
 *
 * ����: 1->2->2->1
 * ���: true
 *
 */
public class _234 {

    public static void main(String[] args) {
        ListNode firstNode=new ListNode(1);
        firstNode.next=new ListNode(2);
        firstNode.next.next=new ListNode(3);
        firstNode.next.next.next=new ListNode(4);
        boolean palindrome = isPalindrome(firstNode);
        System.out.println(">>>>"+palindrome);
    }

    public static boolean isPalindrome(ListNode head) {
        Boolean flag=false;


        return flag;
    }

}
