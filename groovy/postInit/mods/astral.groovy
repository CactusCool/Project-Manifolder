def total_removal = [
 
]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipie_removal = [
   
]

for(item : recipie_removal){
    crafting.removeByOutput(item);
}

mods.astralsorcery.starlight_altar.removeByOutput(item('astralsorcery:blocktreebeacon'))