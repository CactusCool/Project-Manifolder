//remove recipies 
def total_removal = [
    item('actuallyadditions:block_leaf_generator'),
    item('actuallyadditions:block_oil_generator'),
    item('actuallyadditions:block_coal_generator')
]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipie_removal = [
    item('actuallyadditions:block_atomic_reconstructor'),
    
]

for(item : recipie_removal){
    crafting.removeByOutput(item);
}



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

crafting.replaceShaped(item('actuallyadditions:block_misc', 9), [
    [null, item('minecraft:stone_pickaxe'), null],
    [item('minecraft:stone_pickaxe'), item('gregtech:steam_casing'), item('minecraft:stone_pickaxe')],
    [null, item('minecraft:stone_pickaxe'), null]
])

mods.actuallyadditions.atomic_reconstructor.recipeBuilder()
    .input(item('minecraft:cobblestone'))
    .output(item('minecraft:netherrack'))
    .energy(2000)
    .register()