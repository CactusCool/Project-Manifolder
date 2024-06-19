//remove recipes 
def total_removal = [

]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipe_removal = [
    
]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}


crafting.replaceShaped(item('botania:spreader'), [
    [item('botania:livingwood'), item('botania:livingwood'), item('botania:livingwood')],
    [item('gregtech:meta_ingot', 324), item('project_manifolder:mana_focus'), null],
    [item('botania:livingwood'), item('botania:livingwood'), item('botania:livingwood')]
])
