package net.guizhanss.wildernether.utils;

import lombok.experimental.UtilityClass;
import me.schntgaispock.wildernether.slimefun.items.BlackstoneStove;

import javax.annotation.Nonnull;

@UtilityClass
public class BlackstoneStoveUtils {
    @Nonnull
    public String getModeName(BlackstoneStove.Mode mode) {
        return switch (mode) {
            case Oven -> "烤箱";
            case Frying -> "油炸";
            case Pot -> "蒸锅";
            case Brewing -> "酿造";
        };
    }
}
