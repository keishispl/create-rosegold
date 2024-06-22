package io.github.keishispl;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CreativeTab {
    public static final ItemGroup CREATE_RG = FabricItemGroup.builder()
            .icon(() -> new ItemStack(AllItems.ROSE_GOLD))
            .displayName(Text.of("Create: Rose Gold"))
            .entries((context, entries) -> {
                entries.add(AllItems.ROSE_GOLD);
                entries.add(AllItems.SWORD);
                entries.add(AllItems.PICKAXE);
                entries.add(AllItems.AXE);
                entries.add(AllItems.SHOVEL);
                entries.add(AllItems.HOE);
                entries.add(AllItems.STRONG_SAND_PAPER);
            })
            .build();

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(CreateRoseGold.ID, "creativetab"), CREATE_RG);
    }
}