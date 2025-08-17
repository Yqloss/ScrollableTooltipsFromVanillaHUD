package net.yqloss.scrollabletooltipsfromvanillahud.org.polyfrost.vanillahud.config;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.SubConfig;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.*;
import net.yqloss.scrollabletooltipsfromvanillahud.org.polyfrost.vanillahud.VanillaHUD;
import net.yqloss.scrollabletooltipsfromvanillahud.org.polyfrost.vanillahud.hooks.TooltipHook;

public class ModConfig extends Config {

    public ModConfig() {
        super(new Mod(VanillaHUD.NAME, ModType.HUD), VanillaHUD.MODID + ".json");
        initialize();
        addListener("startAtTop", TooltipHook::resetScrolling);
    }

    @Switch(
            name = "Start at the Top of Tooltips",
            description = "Changes tooltips to always show the top."
    )
    public static boolean startAtTop = false;
}
