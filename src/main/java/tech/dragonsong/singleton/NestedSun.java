package tech.dragonsong.singleton;

/**
 * 嵌套类版本
 */
public class NestedSun {

    private NestedSun() {
    }

    private static class Holder {
        // 静态类加载保障只创建一个对象
        private static NestedSun instance = new NestedSun();
    }

    public static NestedSun getInstance() {
        return Holder.instance;
    }

    public void sunrise() {
        System.out.println(this.getClass().getName() + "日出");
    }

    public void sunset() {
        System.out.println(this.getClass().getName() + "日落");
    }
}
