package leetcode.math;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 12:52
 *
 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������
 *
 * ʾ�� 1:
 *
 * ����: 121
 * ���: true
 * ʾ�� 2:
 *
 * ����: -121
 * ���: false
 * ����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
 *
 *
 */
public class _9 {

    public static void main(String[] args) {
        int num=1221;
        boolean palindrome = isPalindrome(num);
        System.out.println(">>>>"+palindrome);
    }


    private static boolean isPalindrome(int x) {
        Boolean flag=false;
        if (x < 0 ) {
            return false;
        }
        int originX=x;
        int reverseNum = 0;
        while(x != 0) {
            reverseNum = reverseNum * 10 + x %10;
            x = x/ 10;
        }
        //��ת֮����ԭ���Ա�
        if(originX == reverseNum){
            flag=true;
        }
        return flag;
    }


    public static boolean isPalindrome1(int x) {
        Boolean flag=false;
        String numStr=String.valueOf(x);
        String temp=new StringBuffer(numStr).reverse().toString();
        if(numStr.equals(temp)){
            flag=true;
        }
        return flag;
    }

}
