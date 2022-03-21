package tech.dragonsong.adapter.hongkong;

import tech.dragonsong.adapter.inland.InlandPatchBoardI;

/**
 * 香港插头-内地插线板适配器，object型
 */
public class HongkongObjectAdapter implements InlandPatchBoardI {

    /**
     * 持有港版插头
     */
    private HongkongPlugI hongkongPlugI;

    public HongkongObjectAdapter(HongkongPlugI hongkongPlugI) {
        this.hongkongPlugI = hongkongPlugI;
    }

    @Override
    public void powerOn() {
        System.out.println("港版插头通电，object型");
        hongkongPlugI.hongKongPlugPowerOn();
    }

    @Override
    public void powerOff() {
        // 港版无需断电逻辑
        System.out.println("港版无需断电逻辑");
    }
}
