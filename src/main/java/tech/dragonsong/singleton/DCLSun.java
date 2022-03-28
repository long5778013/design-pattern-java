package tech.dragonsong.singleton;

/**
 * DCL 双重校验锁版本
 */
public class DCLSun {

    private DCLSun() {
    }

    private static volatile DCLSun instance = null;

    public static DCLSun getInstance() {
        // fail-fast
        if (instance != null) {
            return instance;
        }

        // 加锁
        synchronized (DCLSun.class) {
            // 第一次创建成功后，后面进入的线程需要避免二次创建对象
            if (instance == null) {
                instance = new DCLSun();
            }
        }
        return instance;
    }

    public void sunrise() {
        System.out.println(this.getClass().getName() + "日出");
    }

    public void sunset() {
        System.out.println(this.getClass().getName() + "DCLSun日落");
    }
}
