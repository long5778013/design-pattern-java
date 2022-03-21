package tech.dragonsong.adapter.hongkong;

/**
 * 香港插头
 */
public class HongkongPlugImpl implements HongkongPlugI{

    @Override
    public void hongKongPlugPowerOn() {
        System.out.println("港版插头通电逻辑");
    }

    @Override
    public void hongKongPlugCustomize() {
        System.out.println("港版自定义实现逻辑");
    }
}
