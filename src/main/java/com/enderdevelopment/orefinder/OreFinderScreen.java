package com.enderdevelopment.orefinder;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class OreFinderScreen extends Screen {
    private static final Text TITLE = Text.literal("Ore Finder");

    protected OreFinderScreen() {
        super(TITLE);
    }

    @Override
    protected void init() {
        super.init();
        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Find Ores"), button -> {
            // Logic to find ores will be added here
        }).position(this.width / 2 - 100, this.height / 2 - 20).size(200, 40).build());
    }
}