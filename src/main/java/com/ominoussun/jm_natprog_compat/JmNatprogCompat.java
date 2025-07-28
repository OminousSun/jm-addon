package com.ominoussun.jm_natprog_compat;

import net.minecraftforge.fml.common.Mod;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JmNatprogCompat.MODID)
public class JmNatprogCompat
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "jm_natprog_compat";

    public JmNatprogCompat()
    {
        MixinBootstrap.init();
        Mixins.addConfiguration(MODID + ".mixins.json"); //

    }
}
