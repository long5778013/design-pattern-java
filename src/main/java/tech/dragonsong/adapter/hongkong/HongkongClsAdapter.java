package tech.dragonsong.adapter.hongkong;

import tech.dragonsong.adapter.inland.InlandPatchBoardI;

/**
 * 香港插头-内地插线板适配器，class型
 */
public class HongkongClsAdapter extends HongkongPlugImpl implements InlandPatchBoardI {

    @Override
    public void powerOn() {
        System.out.println("港版插头通电，class型");
        super.hongKongPlugPowerOn();
    }

    @Override
    public void powerOff() {
        // 港版无需断电逻辑
        System.out.println("港版无需断电逻辑");
    }
}
