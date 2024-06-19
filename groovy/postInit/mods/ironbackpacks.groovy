
//remove all recipes
crafting.removeByOutput(item('ironbackpacks:backpack'))

//replace basic backpack
crafting.addShaped(item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:basic", "spec": "NONE", "upgrade": []]]), [
    [ore('wool'),item('gregtech:meta_plate', 1648) ,ore('wool')],
    [item('gregtech:meta_plate', 1648),ore('chest') ,item('gregtech:meta_plate', 1648)],
    [ore('wool'),item('gregtech:meta_plate', 1648) ,ore('wool')]
])

//replace iron backpack
crafting.addShaped(item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:iron", "spec": "STORAGE", "upgrade": []]]), [
        [item('gregtech:meta_plate', 324),item('actuallyadditions:block_giant_chest'),item('gregtech:meta_plate', 324)],
        [item('gregtech:meta_plate', 324),item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:basic", "spec": "NONE", "upgrade": []]])  , item('gregtech:meta_plate', 324)],
        [item('gregtech:meta_plate', 324),item('gregtech:meta_block_compressed_20', 4) ,item('gregtech:meta_plate', 324)]
])

//replace gold backpack
crafting.addShaped(item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:gold", "spec": "STORAGE", "upgrade": []]]), [
    [item('gregtech:meta_plate', 41),item('actuallyadditions:block_giant_chest_medium') ,item('gregtech:meta_plate', 41)],
    [item('gregtech:meta_plate', 41),item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:iron", "spec": "STORAGE", "upgrade": []]]) ,item('gregtech:meta_plate', 41)],
    [item('gregtech:meta_plate', 41),item('minecraft:gold_block') ,item('gregtech:meta_plate', 41)]
])

//replace diamond backpack
crafting.addShaped(item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:diamond", "spec": "STORAGE", "upgrade": []]]), [
    [item('gregtech:meta_plate', 276),item('actuallyadditions:block_giant_chest_large') ,item('gregtech:meta_plate', 276)],
    [item('gregtech:meta_plate', 276),item('ironbackpacks:backpack').withNbt(["packInfo": ["type": "ironbackpacks:gold", "spec": "STORAGE", "upgrade": []]]),item('gregtech:meta_plate', 276)],
    [item('gregtech:meta_plate', 276),item('minecraft:diamond_block') ,item('gregtech:meta_plate', 276)]
])


