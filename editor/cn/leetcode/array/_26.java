package leetcode.array;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 21:39
 *
 *  ����һ���������飬����Ҫ�� ԭ�� ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
 *
 * ��Ҫʹ�ö��������ռ䣬������� ԭ�� �޸��������� ����ʹ�� O(1) ����ռ����������ɡ�
 *
 *
 * ʾ��?1:
 *
 * �������� nums = [1,1,2],
 *
 * ����Ӧ�÷����µĳ��� 2, ����ԭ���� nums ��ǰ����Ԫ�ر��޸�Ϊ 1, 2��
 *
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * ʾ��?2:
 *
 * ���� nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * ����Ӧ�÷����µĳ��� 5, ����ԭ���� nums ��ǰ���Ԫ�ر��޸�Ϊ 0, 1, 2, 3, 4��
 *
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 */
public class _26 {

    public static void main(String[] args) {
        //int[] nums=new int[]{1,1,2};
        int[] nums=new int[]{0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);
        System.out.println(">>>>>"+length);
    }

    public static int removeDuplicates(int[] nums) {
        if(nums ==null || nums.length==0){
            return 0;
        }

        //������ָ��
        int slow=0;
        for(int fast=0;fast<nums.length;fast++){
            if(nums[slow]!=nums[fast]){
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow+1;
    }

}
