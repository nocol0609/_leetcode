package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/13 22:50
 *
 * ����һ����Χ�� 1 �� a[i] �� n (n = �����С ) �� �������飬�����е�Ԫ��һЩ���������Σ���һЩֻ����һ�Ρ�
 *
 * �ҵ������� [1, n] ��Χ֮��û�г����������е����֡�
 *
 * �����ڲ�ʹ�ö���ռ���ʱ�临�Ӷ�ΪO(n)�������������������? ����Լٶ����ص����鲻���ڶ���ռ��ڡ�
 *
 * ʾ��:
 *
 * ����:
 * [4,3,2,7,8,2,3,1]
 *
 * ���:
 * [5,6]
 *
 */
public class _484 {
    public static void main(String[] args) {
        int[] nums=new int[]{4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(nums);
        System.out.println(list);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();

        return list;
    }
}
