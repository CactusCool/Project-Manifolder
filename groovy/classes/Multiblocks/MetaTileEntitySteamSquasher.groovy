package classes.Multiblocks

import classes.BetterSteamMultiWorktable

//gt imports 
import gregtech.api.capability.impl.SteamMultiWorkable;
import gregtech.api.metatileentity.MetaTileEntity
import gregtech.api.metatileentity.interfaces.IGregTechTileEntity
import gregtech.api.metatileentity.multiblock.IMultiblockPart
import gregtech.api.metatileentity.multiblock.RecipeMapSteamMultiblockController
import gregtech.api.pattern.BlockPattern
import gregtech.api.pattern.FactoryBlockPattern
import gregtech.client.renderer.ICubeRenderer
import gregtech.api.recipes.RecipeMaps
import gregtech.client.utils.TooltipHelper
//import textures and gt blocks
import gregtech.client.renderer.texture.Textures
import gregtech.common.blocks.MetaBlocks
import gregtech.common.blocks.BlockMetalCasing.MetalCasingType
import gregtech.common.blocks.BlockTurbineCasing.TurbineCasingType
import gregtech.common.blocks.BlockFireboxCasing.FireboxCasingType

//minecraft imports
import net.minecraft.init.Blocks
import net.minecraft.util.ResourceLocation
import net.minecraftforge.fml.relauncher.Side
import net.minecraftforge.fml.relauncher.SideOnly
import net.minecraft.client.resources.I18n
import net.minecraft.world.World
import net.minecraft.util.EnumParticleTypes
import net.minecraft.block.state.IBlockState
import net.minecraft.item.ItemStack

//outside imports
import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable
import java.util.List

public class MetaTileEntitySteamSquasher extends RecipeMapSteamMultiblockController {    
    
    //Parallel ammount
    private static final int PARALLEL_LIMIT = 8;
    
    //constructor
    public MetaTileEntitySteamSquasher(ResourceLocation metaTileEntityId){
        super(metaTileEntityId, RecipeMaps.COMPRESSOR_RECIPES, CONVERSION_RATE)
        this.recipeMapWorkable = new BetterSteamMultiWorktable(this, CONVERSION_RATE);
        this.recipeMapWorkable.setParallelLimit(PARALLEL_LIMIT);
    }

    @Override
    public MetaTileEntity createMetaTileEntity(IGregTechTileEntity tileEntity) {
        return new MetaTileEntitySteamSquasher(metaTileEntityId)
    }

    @Override
    protected BlockPattern createStructurePattern() {
        return FactoryBlockPattern.start() 
                .aisle("XXX", "XXX", "XXX")
                .aisle("XXX", "XGX", "XXX")
                .aisle("XXX", "XGX", "XXX")
                .aisle("XXX", "XSX", "XXX")
                .where('S' as char, selfPredicate())
                .where('X' as char, states(MetaBlocks.METAL_CASING.getState(MetalCasingType.BRONZE_BRICKS)).setMinGlobalLimited(14).or(autoAbilities()))
                .where('G' as char, states(MetaBlocks.TURBINE_CASING.getState(TurbineCasingType.BRONZE_GEARBOX)))
                .where('#' as char, air())
                .build()
    }

  

    //sets bus texture
    @Override
    @SideOnly(Side.CLIENT)
    public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
        return Textures.BRONZE_PLATED_BRICKS
    }

    //sets controller texture
    @SideOnly(Side.CLIENT)
    @NotNull
    @Override
    protected ICubeRenderer getFrontOverlay() {
        return Textures.COMPRESSOR_OVERLAY
    }

    //disables maintenance
    @Override
    public boolean hasMaintenanceMechanics() {
        return false;
    }


    @Override
    public int getItemOutputLimit() {
        return 1;
    }

    //adds tooltips
    @Override
    public void addInformation(ItemStack stack, @Nullable World player, @NotNull List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);
        tooltip.add(I18n.format("gregtech.multiblock.steam_.duration_modifier"));
        tooltip.add(I18n.format("gregtech.universal.tooltip.parallel", PARALLEL_LIMIT));
        tooltip.add(TooltipHelper.BLINKING_ORANGE.toString() + I18n.format("gregtech.multiblock.require_steam_parts"));
    }

    /*
    //partical effects while running
    @SideOnly(Side.CLIENT)
    @Override
    public void randomDisplayTick() {
        if (isActive()) {
            VanillaParticleEffects.defaultFrontEffect(this, 0.4F, EnumParticleTypes.FLAME);
        }
    }   
    */
}