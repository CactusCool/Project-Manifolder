def total_removal = [
    item('appliedenergistics2:material', 46),
    item('appliedenergistics2:material', 49),
    item('appliedenergistics2:material', 51),
    item('appliedenergistics2:material', 3),
    item('appliedenergistics2:material', 2)
]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipe_removal = [

]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}


