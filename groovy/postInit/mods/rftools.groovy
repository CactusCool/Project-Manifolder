//remove recipes 
def total_removal = [

]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipe_removal = [
    item('rftools:machine_frame')
]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}
