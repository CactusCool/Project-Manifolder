package classes

import gregtech.api.capability.impl.SteamMultiWorkable
import gregtech.api.metatileentity.multiblock.ParallelLogicType
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController
import gregtech.api.recipes.RecipeBuilder
import org.jetbrains.annotations.NotNull

public class BetterSteamMultiWorktable extends SteamMultiWorkable {
    
    public BetterSteamMultiWorktable(RecipeMapSteamMultiblockController tileEntity, double CONVERSION_RATE) {
        super(tileEntity, CONVERSION_RATE)
    }

    @NotNull
    @Override
    public ParallelLogicType getParallelLogicType() {
        return ParallelLogicType.MULTIPLY

    }

    @Override
    public void applyParallelBonus(@NotNull RecipeBuilder<?> builder) {
        //increases recipe duration by 50%
        builder.duration((int)(builder.getDuration()*1.5))
    }

}

