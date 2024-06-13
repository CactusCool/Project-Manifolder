//remove recipies 
def total_removal = [

]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipie_removal = [
    item('teslacorelib:machine_case')
]

for(item : recipie_removal){
    crafting.removeByOutput(item);
}
