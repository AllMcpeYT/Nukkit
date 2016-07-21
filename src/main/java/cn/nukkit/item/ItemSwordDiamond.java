package cn.nukkit.item;

public class ItemSwordDiamond extends ItemTool {

    public ItemSwordDiamond() {
        this(0, 1);
    }

    public ItemSwordDiamond(Integer meta) {
        this(meta, 1);
    }

    public ItemSwordDiamond(Integer meta, int count) {
        super(DIAMOND_SWORD, meta, count, TextFormat.AQUA + "Diamond Sword");
    }

    @Override
    public int getMaxDurability() {
        return ItemTool.DURABILITY_DIAMOND;
    }

    @Override
    public boolean isSword() {
        return true;
    }

    @Override
    public int getTier() {
        return ItemTool.TIER_DIAMOND;
    }
}
