package dev.aaronhowser.mods.nopotionicons.mixin;

import net.minecraft.entity.effect.StatusEffectInstance;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StatusEffectInstance.class)
public class StatusEffectInstanceMixin {
    @Inject(at = @At("HEAD"), method = "shouldShowIcon", cancellable = true)
    private void init(CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}