package cn.nukkit.item;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class ItemLeggingsDiamond extends ItemArmor {

    public ItemLeggingsDiamond() {
        this(0, 1);
    }

    public ItemLeggingsDiamond(Integer meta) {
        this(meta, 1);
    }

    public ItemLeggingsDiamond(Integer meta, int count) {
        super(DIAMOND_LEGGINGS, meta, count, TextFormat.AQUA + "Diamond Leggings");
    }

    @Override
    public boolean isLeggings() {
        return true;
    }

    @Override
    public int getTier() {
        return ItemArmor.TIER_DIAMOND;
    }
}
