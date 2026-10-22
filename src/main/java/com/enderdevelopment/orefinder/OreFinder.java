package com.enderdevelopment.orefinder;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class OreFinder implements ModInitializer {
    private static final String MOD_ID = "orefinder";
    private static final String KEY_CATEGORY = "key.category.orefinder";
    private static final String KEY_DESCRIPTION = "key.orefinder.find_ores";

    private static KeyBinding findOresKeyBinding;

    @Override
    public void onInitialize() {
        findOresKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DESCRIPTION,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_F,
                KEY_CATEGORY
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (findOresKeyBinding.wasPressed()) {
                // Logic to find ores will be added here
            }
        });
    }
}