package tech.dragonsong.adapter;

import tech.dragonsong.adapter.hongkong.HongkongClsAdapter;
import tech.dragonsong.adapter.hongkong.HongkongObjectAdapter;
import tech.dragonsong.adapter.hongkong.HongkongPlugImpl;
import tech.dragonsong.adapter.inland.InlandPatchBoardI;
import tech.dragonsong.adapter.inland.InlandPatchBoardImpl;

public class AdapterApp {

    // 插线板通电
    public static void main(String[] args) {
        // 内地默认逻辑
        InlandPatchBoardI inlandPatchBoardGeneral = new InlandPatchBoardImpl();
        inlandPatchBoardGeneral.powerOn();

        // 港版，class型适配器
        InlandPatchBoardI hongkongPatchClsPlug = new HongkongClsAdapter();
        hongkongPatchClsPlug.powerOn();
        // 港版，object型适配器
        InlandPatchBoardI hongkongPatchObjectPlug = new HongkongObjectAdapter(new HongkongPlugImpl());
        hongkongPatchObjectPlug.powerOn();
    }
}
