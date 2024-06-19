import gregtech.common.metatileentities.MetaTileEntities
import classes.Multiblocks.MetaTileEntitySteamAlloyFactory
import classes.Multiblocks.MetaTileEntitySteamSquasher
import classes.Multiblocks.MetaTileEntitySteamSuucker


if (isReloading()) return

//register steam multiblocks
MetaTileEntities.registerMetaTileEntity(32000, new MetaTileEntitySteamAlloyFactory(new ResourceLocation("gregtech", "steam_alloy_factory")))
MetaTileEntities.registerMetaTileEntity(32001, new MetaTileEntitySteamSquasher(new ResourceLocation("gregtech", "steam_squasher")))
MetaTileEntities.registerMetaTileEntity(32002, new MetaTileEntitySteamSuucker(new ResourceLocation("gregtech", "steam_suucker")))