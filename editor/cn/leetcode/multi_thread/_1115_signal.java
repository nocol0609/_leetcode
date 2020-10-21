package leetcode.multi_thread;

/**
 * @author ��liuxp
 * @date ��Created in 2020/4/20 14:41
 * @description ��
 *  �����ṩһ���ࣺ
 *
 * class FooBar {
 *   public void foo() {
 *     for (int i = 0; i < n; i++) {
 *       print("foo");
 *     }
 *   }
 *
 *   public void bar() {
 *     for (int i = 0; i < n; i++) {
 *       print("bar");
 *     }
 *   }
 * }
 * ������ͬ���߳̽��Ṳ��һ�� FooBar ʵ��������һ���߳̽������ foo() ��������һ���߳̽������ bar() ������
 *
 * ������޸ĳ�����ȷ�� "foobar" ����� n �Ρ�
 *
 *
 *
 * ʾ�� 1:
 *
 * ����: n = 1
 * ���: "foobar"
 * ����: �����������̱߳��첽����������һ������ foo() ����, ��һ������ bar() ������"foobar" �������һ�Ρ�
 * ʾ�� 2:
 *
 * ����: n = 2
 * ���: "foobarfoobar"
 * ����: "foobar" ����������Ρ�
 *
 */
class _1115_signal {

    private int n;

    /**
     * ȫ���źţ�signal��
     */
    private volatile boolean flag=false;

    public _1115_signal(int n) {
        this.n = n;
    }

    public void foo() throws InterruptedException {
        //Ϊtrueʱ �߳�������Ϊfalse�Ŵ�ӡ
        for(int i = 0; i < n; i++){
            while (flag){
                //��������ᳬʱ�����øķ�����ͣ��ǰ�̣߳�ִ�������̣߳����ͷ���
                Thread.yield();
            }
            System.out.println("foo");
            flag=true;
        }
    }

    public void bar() throws InterruptedException {
        for(int i = 0; i < n; i++){
            while (!flag){
                //��������ᳬʱ�����øķ�����ͣ��ǰ�̣߳�ִ�������̣߳����ͷ���
                Thread.yield();
            }
            System.out.println("bar");
            flag=false;
        }
    }

    public static void main(String[] args) throws Exception {
        _1115_signal test=new _1115_signal(10);
        Thread thread=new Thread(()->{
            try {
                test.foo();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        Thread thread2=new Thread(()->{
            try {
                test.bar();
            }catch (Exception e){
                e.printStackTrace();
            }
        });

        thread.start();
        thread2.start();
    }
}
