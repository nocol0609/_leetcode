package leetcode.array;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/13 22:28
 *
 * ����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�
 *
 * ����Լ������������ظ�Ԫ�ء�
 *
 * ʾ�� 1:
 *
 * ����: [1,3,5,6], 5
 * ���: 2
 * ʾ�� 2:
 *
 * ����: [1,3,5,6], 2
 * ���: 1
 * ʾ�� 3:
 *
 * ����: [1,3,5,6], 7
 * ���: 4
 * ʾ�� 4:
 *
 * ����: [1,3,5,6], 0
 * ���: 0
 *
 */
public class _35 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,5,6};
        int target=2;
        int result = searchInsert(nums,target);
        System.out.println(">>>>>"+result);
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return 0;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }
}
