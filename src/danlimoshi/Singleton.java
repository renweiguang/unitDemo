package danlimoshi;

/**
 * 双重校验锁  单例模式
 *
 * @author rwg
 * @create 2019/8/21-11:48
 */
public class Singleton {

    /**
     * 第一次校验：也就是第一个if（singleton==null），这个是为了代码提高代码执行效率，由于单例模式只要一次创建实例即可，
     * 所以当创建了一个实例之后，再次调用getInstance方法就不必要进入同步代码块，不用竞争锁。直接返回前面创建的实例即可。
     * <p>
     * 第二次校验：也就是第二个if（singleton==null），这个校验是防止二次创建实例，假如有一种情况，
     * 当singleton还未被创建时，线程t1调用getInstance方法，由于第一次判断singleton==null，
     * 此时线程t1准备继续执行，但是由于资源被线程t2抢占了，此时t2页调用getInstance方法，同样的，
     * 由于singleton并没有实例化，t2同样可以通过第一个if，然后继续往下执行，同步代码块，第二个if也通过，
     * 然后t2线程创建了一个实例singleton。此时t2线程完成任务，资源又回到t1线程，t1此时也进入同步代码块，
     * 如果没有这个第二个if，那么，t1就也会创建一个singleton实例，那么，就会出现创建多个实例的情况，
     * 但是加上第二个if，就可以完全避免这个多线程导致多次创建实例的问题。
     */

    private static volatile Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //第一次校验singleton是否为空
        if (singleton == null) {
            synchronized (Singleton.class) {
                //第二次校验singleton是否为空
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " : " + Singleton.getInstance().hashCode());
                }
            }).start();
        }
    }
}
