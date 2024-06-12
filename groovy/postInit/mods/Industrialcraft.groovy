def name_removals = [
    "item('ic2:te', 4)",
    "item('ic2:te', 46)"
]

for(int i = 1; i < 80; i++){
    crafting.removeByOutput(item('ic2:te', i));
}

/*
for(item in name_removals){
    crafting.removeByOutput(item);
}
*/
