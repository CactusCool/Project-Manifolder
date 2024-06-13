//remove recipies 
def total_removal = [

]


for(item : total_removal){
    mods.hei.ingredient.removeAndHide(item);
}



def recipie_removal = [
    item('rftools:machine_frame')
]

for(item : recipie_removal){
    crafting.removeByOutput(item);
}
