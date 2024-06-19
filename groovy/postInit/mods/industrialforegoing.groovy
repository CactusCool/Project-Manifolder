//remove recipes 
def total_removal = [

]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipe_removal = [
    item('teslacorelib:machine_case')
]

for(item : recipe_removal){
    crafting.removeByOutput(item);
}
