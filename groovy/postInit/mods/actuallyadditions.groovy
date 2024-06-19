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
    item('actuallyadditions:block_bio_reactor'),
    item('actuallyadditions:item_filling_wand').withNbt(["Energy": 0]),
    item('actuallyadditions:item_filling_wand').withNbt(["Energy": 500000]),
    item('actuallyadditions:item_crate_keeper'),
    item('actuallyadditions:item_chest_to_crate_upgrade'),
    item('actuallyadditions:item_small_to_medium_crate_upgrade'),
    item('actuallyadditions:item_medium_to_large_crate_upgrade')
]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}


//recipe removals to be replaced later 
def recipe_removal = [
    item('actuallyadditions:block_atomic_reconstructor'),
    item('actuallyadditions:block_item_repairer'),
    item('actuallyadditions:block_greenhouse_glass'),
    item('actuallyadditions:block_farmer'),
    item('actuallyadditions:block_giant_chest_large'),
    item('actuallyadditions:item_drill', 3)
    
]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}


//remove all crusher recipes
mods.actuallyadditions.crusher.removeAll()

//crfting table recipes

//add recipe for initial craft of atomic reconstructor
crafting.addShaped('atomic reconstructor initial craft', item('actuallyadditions:block_atomic_reconstructor'), [
    [item('minecraft:stone'), item('actuallyadditions:block_furnace_solar'), item('minecraft:stone')],
    [item('appliedenergistics2:energy_cell'), item('project_manifolder:atomic_reconstruction_core'), item('nae2:part')],
    [item('minecraft:stone'), item('minecraft:stone'), item('minecraft:stone')]
] )

//change lens recipe to just be glass
crafting.replaceShaped(item('actuallyadditions:item_misc', 18), [
    [ore('blockGlass'), ore('blockGlass'), ore('blockGlass')],
    [ore('blockGlass'), null, ore('blockGlass')],
    [ore('blockGlass'), ore('blockGlass'), ore('blockGlass')]
])

//change lens of miner recipe
crafting.replaceShaped(item('actuallyadditions:item_mining_lens'), [
    [null, item('minecraft:stone_pickaxe'), null],
    [item('minecraft:stone_pickaxe'), item('actuallyadditions:item_misc', 18), item('minecraft:stone_pickaxe')],
    [null, item('minecraft:stone_pickaxe'), null]
])

//change recipe for iron casing
crafting.replaceShaped(item('actuallyadditions:block_misc', 9), [
    [null, item('minecraft:stone_pickaxe'), null],
    [item('minecraft:stone_pickaxe'), item('gregtech:steam_casing'), item('minecraft:stone_pickaxe')],
    [null, item('minecraft:stone_pickaxe'), null]
])

//change recipe for crate
crafting.replaceShaped(item('actuallyadditions:block_giant_chest'), [
        [item('gregtech:machine', 1625), item('gregtech:planks', 1), item('gregtech:machine', 1625)],
        [item('gregtech:planks', 1), item('actuallyadditions:block_misc', 4), item('gregtech:planks', 1)],
        [item('gregtech:machine', 1625), item('gregtech:planks', 1), item('gregtech:machine', 1625)]
])

//change recipe for medium crate
crafting.replaceShaped(item('actuallyadditions:block_giant_chest_medium'), [
        [item('actuallyadditions:block_giant_chest'), item('botania:livingwood'), item('actuallyadditions:block_giant_chest')],
        [item('botania:livingwood'), ore('circuitLv'), item('botania:livingwood')],
        [item('actuallyadditions:block_giant_chest'), item('botania:livingwood'), item('actuallyadditions:block_giant_chest')]
])

//changes recipe for large crate
crafting.replaceShaped(item('actuallyadditions:block_giant_chest_large'), [
        [item('actuallyadditions:block_giant_chest_medium'), item('botania:livingwood'), item('actuallyadditions:block_giant_chest_medium')],
        [item('botania:livingwood'), item('gregtech:meta_item_1', 202), item('botania:livingwood')],
        [item('actuallyadditions:block_giant_chest_medium'), item('botania:livingwood'), item('actuallyadditions:block_giant_chest_medium')]
])

//reconstructor recipes

//add recipe for netherack from cobble stone in reconstructor
mods.actuallyadditions.atomic_reconstructor.recipeBuilder()
    .input(item('minecraft:cobblestone'))
    .output(item('minecraft:netherrack'))
    .energy(2000)
    .register()

//mining lens changes
mods.actuallyadditions.stone_mining_lens.removeAll()





