package leetcode.array;

/**
 * @author ��liuxp
 * @date ��Created in 2020/4/1 21:05
 * @description ��������Ʊ�����ʱ��
 *
 *  ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
 *
 * ��������ֻ�������һ�ʽ��ף������������һ֧��Ʊһ�Σ������һ���㷨�����������ܻ�ȡ���������
 *
 * ע�⣺�㲻���������Ʊǰ������Ʊ��
 *
 * ?
 *
 * ʾ�� 1:
 *
 * ����: [7,1,5,3,6,4]
 * ���: 5
 * ����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
 *      ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�
 * ʾ�� 2:
 *
 * ����: [7,6,4,3,1]
 * ���: 0
 * ����: �����������, û�н������, �����������Ϊ 0��

 */
public class _121 {

    public static void main(String[] args) {
        //int[] prices=new int[]{7,6,4,3,1};
        int[] prices=new int[]{7,1,5,3,6,4};
        int result = maxProfit(prices);
        System.out.println(">>>>>"+result);
    }

    public static int maxProfit(int[] prices) {
        int result=0;
        if(prices.length<2){
            return result;
        }
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]-min>0){
                result=Math.max(prices[i]-min,result);
            }else {
                min=prices[i];
            }
        }
        return result;
    }

}
