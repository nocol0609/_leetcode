package leetcode.array;

import leetcode.utis.ArrayUtils;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 23:12
 *
 * ����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��
 *
 * ʾ��:
 *
 * ����: [0,1,0,3,12]
 * ���: [1,3,12,0,0]
 * ˵��:
 *
 * ������ԭ�����ϲ��������ܿ�����������顣
 * �������ٲ���������
 *
 *
 */
public class _283 {

    public static void main(String[] args) {
        int[] nums1=new int[]{0,1,0,3,12};
        ArrayUtils.printArray(nums1);
        moveZeroes(nums1);
        ArrayUtils.printArray(nums1);
    }

    public static void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        //0,1,0,3,12
        //1,3,12,0,0
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
        }

        //��0
        for(int i=slow;i<nums.length;i++){
            nums[i]=0;
        }

    }
}
