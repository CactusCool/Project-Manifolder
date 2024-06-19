
//remove recipes 
def total_removal = [

]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipe_removal = [
    item('gregtech:meta_item_1', 516),

]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}

//add recipie for evacuated glass tube
mods.gregtech.extractor.recipeBuilder()
    .inputs(item('gregtech:meta_item_1', 517))
    .outputs(item('project_manifolder:evacuated_glass_tube'))
    .duration(160)
    .EUt(24)
    .buildAndRegister()


//add recipie for vacuume tube
crafting.addShaped(item('gregtech:meta_item_1', 516), [
    [null, null, null],
    [item('gregtech:meta_bolt', 324),item('project_manifolder:evacuated_glass_tube') ,item('gregtech:meta_bolt', 324)],
    [item('gregtech:wire_single', 25), item('gregtech:wire_single', 25), item('gregtech:wire_single', 25)]
])