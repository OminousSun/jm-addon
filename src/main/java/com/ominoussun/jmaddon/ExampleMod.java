package com.ominoussun.jmaddon;

import net.minecraftforge.fml.common.Mod;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "jmaddon";

    public ExampleMod()
    {
        MixinBootstrap.init();
        System.out.println("TEST 1");
        Mixins.addConfiguration("mixins.json");
        System.out.println("TEST 2");
    }
}
