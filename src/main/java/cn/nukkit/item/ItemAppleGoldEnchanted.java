package cn.nukkit.item;

public class ItemAppleGoldEnchanted extends ItemEdible {
    public ItemAppleGoldEnchanted() {
        this(0, 1);
    }

    public ItemAppleGoldEnchanted(Integer meta) {
        this(meta, 1);
    }

    public ItemAppleGoldEnchanted(Integer meta, int count) {
        super(GOLDEN_APPLE_ENCHANTED, meta, count, TextFormat.BLUE + "Enchanted" + TextFormat.YELLOW + "Golden Apple");
    }
}
