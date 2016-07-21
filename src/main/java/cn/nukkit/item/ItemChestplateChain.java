package cn.nukkit.item;

public class ItemChestplateChain extends ItemArmor {

    public ItemChestplateChain() {
        this(0, 1);
    }

    public ItemChestplateChain(Integer meta) {
        this(meta, 1);
    }

    public ItemChestplateChain(Integer meta, int count) {
        super(CHAIN_CHESTPLATE, meta, count, TextFormat.GRAY + "Chain Chestplate");
    }

    @Override
    public int getTier() {
        return ItemArmor.TIER_CHAIN;
    }

    @Override
    public boolean isChestplate() {
        return true;
    }
}
