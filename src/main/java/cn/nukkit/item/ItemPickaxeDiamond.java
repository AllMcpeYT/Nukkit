package cn.nukkit.item;

public class ItemPickaxeDiamond extends ItemTool {

    public ItemPickaxeDiamond() {
        this(0, 1);
    }

    public ItemPickaxeDiamond(Integer meta) {
        this(meta, 1);
    }

    public ItemPickaxeDiamond(Integer meta, int count) {
        super(DIAMOND_PICKAXE, meta, count, TextFormat.AQUA + "Diamond Pickaxe");
    }

    @Override
    public int getMaxDurability() {
        return ItemTool.DURABILITY_DIAMOND;
    }

    @Override
    public boolean isPickaxe() {
        return true;
    }

    @Override
    public int getTier() {
        return ItemTool.TIER_DIAMOND;
    }
}
