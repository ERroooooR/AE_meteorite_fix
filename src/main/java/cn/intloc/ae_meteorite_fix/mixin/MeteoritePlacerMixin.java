package cn.intloc.ae_meteorite_fix.mixin;

import appeng.core.AELog;
import org.spongepowered.asm.mixin.Mixin;
import appeng.worldgen.meteorite.MeteoritePlacer;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MeteoritePlacer.class)
public class MeteoritePlacerMixin {
    public void place() {
        AELog.warn("tried to spawn meteorite");
    }
}
