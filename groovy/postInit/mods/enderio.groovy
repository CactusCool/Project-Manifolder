//remove items from jei
def total_removal = [
    item('enderio:block_sag_mill'),
    item('enderio:block_alloy_smelter'),
    item('enderio:block_enhanced_alloy_smelter'),
    item('enderio:block_simple_alloy_smelter')
]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipe_removal = [

]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}


//remove all sagmill recipes
mods.enderio.sag_mill.removeAll()

//remove all alloy smelter recipes
mods.enderio.alloy_smelter.removeAll()


//replace first teir conduit recipe
crafting.replaceShaped(item('enderio:item_power_conduit')*3, [
    [item('enderio:item_material', 4), item('enderio:item_material', 4), item('enderio:item_material', 4)],
    [item('gregtech:meta_ingot', 25), item('gregtech:meta_ingot', 25), item('gregtech:meta_ingot', 25)],
    [item('enderio:item_material', 4), item('enderio:item_material', 4), item('enderio:item_material', 4)]
])

