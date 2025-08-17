package net.yqloss.scrollabletooltipsfromvanillahud.org.polyfrost.vanillahud;

import Apec.Components.Gui.GuiIngame.ApecGuiIngameForge;
import cc.polyfrost.oneconfig.events.EventManager;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Loader;
import net.yqloss.scrollabletooltipsfromvanillahud.org.polyfrost.vanillahud.config.ModConfig;

@net.minecraftforge.fml.common.Mod(modid = VanillaHUD.MODID, name = VanillaHUD.NAME, version = VanillaHUD.VERSION)
public class VanillaHUD {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";

    public static ModConfig modConfig;

    @net.minecraftforge.fml.common.Mod.EventHandler
    public void onFMLInitialization(net.minecraftforge.fml.common.event.FMLInitializationEvent event) {
        modConfig = new ModConfig();
    }

}
