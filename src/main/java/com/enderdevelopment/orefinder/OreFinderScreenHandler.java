package com.enderdevelopment.orefinder;

import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;

public class OreFinderScreenHandler extends ScreenHandler {
    protected OreFinderScreenHandler(ScreenHandlerType<?> type, int syncId) {
        super(type, syncId);
    }

    @Override
    public boolean canUse() {
        return true;
    }
}