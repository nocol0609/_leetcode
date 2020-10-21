package leetcode.utis;

import leetcode.temp.ListNode;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 15:33
 */
public class ListNodeUtils {

    /**
     * �ڵ��ӡ
     * @param listNode
     */
    public static void printListNode(ListNode listNode) {
        if (listNode != null) {
            ListNode temp = listNode;
            while (temp != null) {
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
        System.out.println("-------------");
    }

}
