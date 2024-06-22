package io.github.keishispl;

import net.fabricmc.api.ModInitializer;
import org.slf4j.LoggerFactory;

public class CreateRoseGold implements ModInitializer {
    public static final String ID = "createrg";

    @Override
    public void onInitialize() {
        AllItems.register();
        CreativeTab.register();
        LoggerFactory.getLogger(ID).info("[Create RoseGold] Loading..");
    }
}