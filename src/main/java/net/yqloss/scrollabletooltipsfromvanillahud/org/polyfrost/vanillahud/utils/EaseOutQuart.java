package net.yqloss.scrollabletooltipsfromvanillahud.org.polyfrost.vanillahud.utils;

import cc.polyfrost.oneconfig.gui.animations.Animation;
import net.minecraft.client.Minecraft;

public class EaseOutQuart extends Animation {

    public long startTime;

    public EaseOutQuart(float duration, float start, float end, boolean reverse) {
        super(duration, start, end, reverse);
        startTime = Minecraft.getSystemTime();
    }

    @Override
    public float get() {
        timePassed = (float) (Minecraft.getSystemTime() - startTime);
        if (timePassed >= duration) return start + change;
        return animate(timePassed / duration) * change + start;
    }

    @Override
    protected float animate(float x) {
        return -1 * (x - 1) * (x - 1) * (x - 1) * (x - 1) + 1;
    }

    @Override
    public boolean isFinished() {
        timePassed = (float) (Minecraft.getSystemTime() - startTime);
        return super.isFinished();
    }
}
