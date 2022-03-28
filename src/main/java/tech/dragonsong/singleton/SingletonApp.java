package tech.dragonsong.singleton;

public class SingletonApp {

    // 太阳日出、日落
    public static void main(String[] args) {

        DCLSun.getInstance().sunrise();
        DCLSun.getInstance().sunset();

        EnumSun.SUN.sunrise();
        EnumSun.SUN.sunset();

        NestedSun.getInstance().sunrise();
        NestedSun.getInstance().sunset();
    }
}
