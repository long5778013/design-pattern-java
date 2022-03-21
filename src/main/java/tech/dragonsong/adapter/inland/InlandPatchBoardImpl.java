package tech.dragonsong.adapter.inland;

import tech.dragonsong.adapter.inland.InlandPatchBoardI;

/**
 * 内地插线板实现
 */
public class InlandPatchBoardImpl implements InlandPatchBoardI {

    @Override
    public void powerOn() {
        System.out.println("内地默认通电实现逻辑");
    }
    @Override
    public void powerOff() {
        System.out.println("一段复杂的通电实现逻辑");
    }

}
