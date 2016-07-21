package cn.nukkit.item;

public class ItemIngotGold extends Item {

    public ItemIngotGold() {
        this(0, 1);
    }

    public ItemIngotGold(Integer meta) {
        this(meta, 1);
    }

    public ItemIngotGold(Integer meta, int count) {
        super(GOLD_INGOT, 0, count, TextFormat.YELLOW + "Gold Ingot");
    }
}
