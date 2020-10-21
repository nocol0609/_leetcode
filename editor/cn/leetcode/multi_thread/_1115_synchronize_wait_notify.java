package leetcode.multi_thread;

/**
 * @author ��liuxp
 * @date ��Created in 2020/4/20 16:09
 * @description ��
 */
public class _1115_synchronize_wait_notify {

    private int n;

    public _1115_synchronize_wait_notify(int n) {
        this.n = n;
    }

    private volatile boolean flag=false;

    public void foo() throws InterruptedException {
        for(int i = 0; i < n; i++){
            synchronized (this){
                if(flag){
                    this.wait();
                }
                System.out.println("foo");
                flag=true;
                this.notifyAll();
            }
        }
    }

    public void bar() throws InterruptedException {
        for(int i = 0; i < n; i++){
            synchronized (this){
                if(!flag){
                    //�ó������߳�����
                    this.wait();
                }
                System.out.println("bar");
                flag=false;
                this.notifyAll();
            }
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
