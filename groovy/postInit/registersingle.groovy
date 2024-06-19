import gregtech.common.metatileentities.MetaTileEntities
import classes.Singleblocks.MetaTileEntitySteamMixer


if (isReloading()) return

//register steam multiblocks
MetaTileEntities.registerMetaTileEntity(32003, new MetaTileEntitySteamMixer((new ResourceLocation("gregtech", "high_pressure_steam_mixer")), true))
MetaTileEntities.registerMetaTileEntity(32004, new MetaTileEntitySteamMixer((new ResourceLocation("gregtech", "steam_mixer")), false))