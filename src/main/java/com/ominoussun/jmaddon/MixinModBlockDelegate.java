package com.ominoussun.jmaddon;

import com.mojang.logging.LogUtils;
import journeymap.client.mod.IModBlockHandler;
import journeymap.client.mod.ModBlockDelegate;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.HashMap;


@Mixin(ModBlockDelegate.class)
public class MixinModBlockDelegate
{
    private HashMap<String, Class<? extends IModBlockHandler>> handlerClasses = new HashMap<>();

    @Inject(method = "reset", remap = false,
            at = @At(
                    value = "INVOKE",
                    target = "Ljava/util/HashMap;clear()V",
                    shift = At.Shift.AFTER
            )
    )
    public void reset(CallbackInfo ci)
    {
        System.out.println("Injection in process");
        handlerClasses.put("natprog", NaturalProgression.class);
    }


}
