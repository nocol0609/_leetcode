package stack;

/**
 * �Զ���ջʵ��ջ�Ļ�������
 * 
 * @author Nocol ����3:52:24
 */
public class MyStack {

	/**
	 * �ײ���һ������
	 */
	private long[] arr;

	/**
	 * ջ��
	 */
	private int top;

	/***
	 * Ĭ�Ϲ��췽��
	 */
	public MyStack() {
		arr = new long[10];
		// ��ʼջ����û��Ԫ�ص�
		top = -1;
	}

	/**
	 * ���ι��죬����Ϊ�����ʼ����С
	 */
	public MyStack(int maxsize) {
		arr = new long[maxsize];
		top = -1;
	}

	/**
	 * ��ջ
	 */
	public void push(int value) {

		//top������
		//����ʼarr[0]Ϊ��һ����ջ����
		arr[++top] = value;
	}
	
	/**
	 * ��ջ (�Ƴ�����)
	 */
	public long pop(){
		
		//�Ƴ������Լ�
		return arr[top--];
	}
	
	/**
	 * �鿴����
	 */
	public long peek(){
		
		//����ջ������
		return arr[top];
	}
	
	/**
	 * �ж��Ƿ�Ϊ��
	 */
	public boolean isEmpty(){
		return top==-1;
	}
	
	/**
	 * �ж��Ƿ�����
	 */
	public boolean isFull(){
		return top==arr.length-1;
	}
	

}
