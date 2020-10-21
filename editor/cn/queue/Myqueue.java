package queue;

/**
 * �Զ������
 * 
 * @author Nocol ����3:18:47
 */
public class Myqueue {
	/**
	 * �ײ�����ʵ��
	 */
	private long[] arr;

	/**
	 * ��Ч���ݵĳ���
	 */
	private int elements;

	/**
	 * ��ͷ
	 */
	private int front;

	/**
	 * ��β
	 */
	private int end;

	public Myqueue() {
		arr = new long[10];
		elements = 0;
		front = 0;
		end = -1;
	}

	public Myqueue(int maxsize) {
		arr = new long[maxsize];
		elements = 0;
		front = 0;
		end = -1;
	}

	/**
	 * ���----�Ӷ�β���
	 */
	public void insert(long value) {
		// ����һ��Ԫ��Ϊarr[0]=value
		arr[++end] = value;
		elements++;
	}

	/**
	 * ����----�Ӷ�ͷ����
	 */
	public long remove() {
		elements--;
		return arr[front++];
	}

	/**
	 * �鿴Ԫ��-----�Ӷ�ͷ�鿴
	 */
	public long peek() {

		return arr[front];
	}

	/**
	 * �ж϶��Ƿ�Ϊ��
	 */
	public boolean isEmpty() {
		return elements == 0;
	}

	/**
	 * �ж϶��Ƿ�����
	 */
	public boolean isFull() {
		return elements == arr.length;
	}

}
