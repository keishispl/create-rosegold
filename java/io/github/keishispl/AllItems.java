package io.github.keishispl;

import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import com.simibubi.create.content.equipment.sandPaper.SandPaperItem;

public class AllItems {
    public static final Item ROSE_GOLD = new Item(new Item.Settings());
    public static final SwordItem SWORD = new SwordItem(RoseGold.INSTANCE, 3, -2.4F, new Item.Settings().rarity(Rarity.EPIC).fireproof());
    public static final PickaxeItem PICKAXE = new PickaxeItem(RoseGold.INSTANCE, 1, -2.8F, new Item.Settings().rarity(Rarity.EPIC).fireproof());
    public static final AxeItem AXE = new AxeItem(RoseGold.INSTANCE, 5.0F, -2.8F, new Item.Settings().rarity(Rarity.EPIC).fireproof());
    public static final ShovelItem SHOVEL = new ShovelItem(RoseGold.INSTANCE, 1.5F, -3.0F, new Item.Settings().rarity(Rarity.EPIC).fireproof());
    public static final HoeItem HOE = new HoeItem(RoseGold.INSTANCE, -4, 0, new Item.Settings().rarity(Rarity.EPIC).fireproof());
    public static final SandPaperItem STRONG_SAND_PAPER = new SandPaperItem(new Item.Settings().maxDamage(-1));

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "rose_gold"), ROSE_GOLD);
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "rose_gold_sword"), SWORD);
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "rose_gold_pickaxe"), PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "rose_gold_axe"), AXE);
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "rose_gold_shovel"), SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "rose_gold_hoe"), HOE);
        Registry.register(Registries.ITEM, new Identifier(CreateRoseGold.ID, "strong_sand_paper"), STRONG_SAND_PAPER);
    }
}