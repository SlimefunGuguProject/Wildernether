package net.guizhanss.wildernether.utils;

import lombok.experimental.UtilityClass;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove;

import javax.annotation.Nonnull;

@UtilityClass
public class BlackstoneStoveUtils {
    @Nonnull
    public String getMode(BlackstoneStove.Mode mode) {
        switch (mode) {
            case Oven:
                return "烤箱";
            case Frying:
                return "油炸";
            case Pot:
                return "蒸锅";
            case Brewing:
                return "酿造";
            default:
                return "未知";
        }
    }
}
