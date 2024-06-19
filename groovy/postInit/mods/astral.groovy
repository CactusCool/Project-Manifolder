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

mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blocktreebeacon'))
mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockaltar', 1))
mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockstarlightinfuser'))
mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockbore'))
mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockaltar', 2))
mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockaltar', 3))
mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blockritualpedestal'))

mods.astralsorcery.grindstone.removeAll()