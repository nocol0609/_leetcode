package array;

/**
 * �����Զ�����������
 *	
 * @author Nocol ����2:45:30
 */
public class OrderArrayTest {
	public static void main(String[] args) {
		//���������ʼ������Ϊ10
		OrderArray orderArray=new OrderArray(10);
		
		orderArray.insert(32);
		orderArray.insert(12);
		orderArray.insert(38);
		orderArray.insert(18);

		//������˳���޹أ�����ʱ��ʱ�������
		orderArray.display();

		
		System.out.println(orderArray.binarySearch(38));
	}
}
