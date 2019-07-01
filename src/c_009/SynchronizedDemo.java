package c_009;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * synchronized 是可重入锁
 *
 * 即一个同步方法可以调用另外一个同步方法，一个线程已经拥有某个对象的锁，再次申请时仍然会得到该对象的锁
 *
 * 与多线程并发执行的线程安全不同，可重入强调对单个线程执行时重新进入同一个子程序仍然是安全的。
 *
 * 通俗来说：当线程请求一个由其它线程持有的对象锁时，该线程会阻塞，而当线程请求由自己持有的对象锁时，如果该锁是重入锁，请求就会成功，否则阻塞。
 *
 */
public class SynchronizedDemo {

    synchronized void m1() {
        System.out.println("m1 start ");
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        m2();
        System.out.println("m1 end ");
    }

    synchronized void m2() {
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(" m2"); // 这句话会打印，调用m2时，不会发生死锁
    }

    @Test
    public void test(){

        SynchronizedDemo t = new SynchronizedDemo();

        new Thread(() -> t.m1()).start();
    }
}
