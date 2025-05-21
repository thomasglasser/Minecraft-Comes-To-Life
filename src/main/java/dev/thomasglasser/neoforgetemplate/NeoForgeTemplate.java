package dev.thomasglasser.neoforgetemplate;

import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(NeoForgeTemplate.MOD_ID)
public class NeoForgeTemplate {
    public static final String MOD_ID = "neoforgetemplate";
    public static final String MOD_NAME = "NeoForge Template";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public NeoForgeTemplate(IEventBus modEventBus) {}

    public static ResourceLocation modLoc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
