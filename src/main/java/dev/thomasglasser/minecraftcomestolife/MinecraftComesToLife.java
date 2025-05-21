package dev.thomasglasser.minecraftcomestolife;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MinecraftComesToLife.MOD_ID)
public class MinecraftComesToLife {
    public static final String MOD_ID = "minecraftcomestolife";
    public static final String MOD_NAME = "Minecraft Comes to Life";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public MinecraftComesToLife(IEventBus modEventBus) {}

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
