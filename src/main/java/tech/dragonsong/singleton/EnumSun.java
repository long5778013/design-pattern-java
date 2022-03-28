package tech.dragonsong.singleton;

/**
 * 枚举类版本
 */
public enum EnumSun {

    /**
     * 枚举enum，jvm层面保障只加载一次。
     * 写法最简单，同时保障反序列化安全。
     */
    SUN;

    public void sunrise() {
        System.out.println(this.getClass().getName() + "日出");
    }

    public void sunset() {
        System.out.println(this.getClass().getName() + "日落");
    }
}
