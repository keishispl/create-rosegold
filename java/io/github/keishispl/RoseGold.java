package io.github.keishispl;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class RoseGold implements ToolMaterial {
    public static final RoseGold INSTANCE = new RoseGold();

    @Override
    public int getDurability() {
        return 2031;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 9.0F;
    }
    @Override
    public float getAttackDamage() {
        return 4.0F;
    }
    @Override
    public int getMiningLevel() {
        return 4;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(AllItems.ROSE_GOLD);
    }
}
