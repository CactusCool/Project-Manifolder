//remove items completly
def total_removal = [
    item('actuallyadditions:block_leaf_generator'),
    item('actuallyadditions:block_oil_generator'),
    item('actuallyadditions:block_coal_generator'),
    item('actuallyadditions:block_canola_press'),
    item('actuallyadditions:block_lava_factory_controller'),
    item('actuallyadditions:block_grinder'),
    item('actuallyadditions:block_grinder_double'),
    item('actuallyadditions:item_drill'),
    item('actuallyadditions:block_heat_collector'),
]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}


//recipie removals to be replaced later 
def recipie_removal = [
    item('actuallyadditions:block_atomic_reconstructor'),
    item('actuallyadditions:block_item_repairer'),
    item('actuallyadditions:block_greenhouse_glass'),
    item('actuallyadditions:block_farmer'),
    item('actuallyadditions:block_giant_chest_medium'),
    item('actuallyadditions:block_giant_chest_large')
]

for(item : recipie_removal){
    crafting.removeByOutput(item);
}


//crfting table recipies

//add recipie for initial craft of atomic reconstructor
crafting.addShaped('atomic reconstructor initial craft', item('actuallyadditions:block_atomic_reconstructor'), [
    [item('minecraft:stone'), item('actuallyadditions:block_furnace_solar'), item('minecraft:stone')],
    [item('appliedenergistics2:energy_cell'), item('project_manifolder:atomic_reconstruction_core'), item('nae2:part')],
    [item('minecraft:stone'), item('minecraft:stone'), item('minecraft:stone')]
] )

//change lens recipie to just be glass
crafting.replaceShaped(item('actuallyadditions:item_misc', 18), [
    [ore('blockGlass'), ore('blockGlass'), ore('blockGlass')],
    [ore('blockGlass'), null, ore('blockGlass')],
    [ore('blockGlass'), ore('blockGlass'), ore('blockGlass')]
])

//change lens of miner recipie
crafting.replaceShaped(item('actuallyadditions:item_mining_lens'), [
    [null, item('minecraft:stone_pickaxe'), null],
    [item('minecraft:stone_pickaxe'), item('actuallyadditions:item_misc', 18), item('minecraft:stone_pickaxe')],
    [null, item('minecraft:stone_pickaxe'), null]
])

//change recipie for iron casing
crafting.replaceShaped(item('actuallyadditions:block_misc', 9), [
    [null, item('minecraft:stone_pickaxe'), null],
    [item('minecraft:stone_pickaxe'), item('gregtech:steam_casing'), item('minecraft:stone_pickaxe')],
    [null, item('minecraft:stone_pickaxe'), null]
])



//reconstructor recipies

//add recipie for netherack from cobble stone in reconstructor
mods.actuallyadditions.atomic_reconstructor.recipeBuilder()
    .input(item('minecraft:cobblestone'))
    .output(item('minecraft:netherrack'))
    .energy(2000)
    .register()




