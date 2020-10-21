package leetcode.array;

/**
 * @author liuxp
 * @version 1.0
 * @date 2020/4/12 22:42
 *
 * ����һ������ nums ��һ��ֵ val������Ҫ ԭ�� �Ƴ�������ֵ���� val ��Ԫ�أ��������Ƴ���������³��ȡ�
 *
 * ��Ҫʹ�ö��������ռ䣬������ʹ�� O(1) ����ռ䲢 ԭ�� �޸��������顣
 *
 * Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 *
 *
 * ʾ�� 1:
 *
 * ���� nums = [3,2,2,3], val = 3,
 *
 * ����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��
 *
 * �㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�
 * ʾ�� 2:
 *
 * ���� nums = [0,1,2,2,3,0,4,2], val = 2,
 *
 * ����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��
 *
 * ˵��:
 *
 * Ϊʲô������ֵ��������������Ĵ���������?
 *
 * ��ע�⣬�����������ԡ����á���ʽ���ݵģ�����ζ���ں������޸�����������ڵ������ǿɼ��ġ�
 *
 * ����������ڲ���������:
 *
 * // nums ���ԡ����á���ʽ���ݵġ�Ҳ����˵������ʵ�����κο���
 * int len = removeElement(nums, val);
 *
 * // �ں������޸�����������ڵ������ǿɼ��ġ�
 * // ������ĺ������صĳ���, �����ӡ�������� �ó��ȷ�Χ�� ������Ԫ�ء�
 * for (int i = 0; i < len; i++) {
 *     print(nums[i]);
 * }
 *
 *
 */
public class _27 {

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,2,2,3,0,4,2};
        //int[] nums=new int[]{3,2,2,3};
        int val=2;
        int length = removeElement(nums,val);
        System.out.println(">>>>>"+length);
    }

    public static int removeElement(int[] nums, int val) {
        if(nums==null){
            return 0;
        }
        int length=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                //�Ƴ����Ԫ�ز����ڣ�ԭ����Ԫ��˳�򲻱�
                nums[length]=nums[i];
                length++;
            }
        }
        return length;
    }
}
