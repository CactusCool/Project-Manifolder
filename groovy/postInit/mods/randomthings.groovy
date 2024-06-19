crafting.replaceShaped(item('randomthings:timeinabottle'), [
    [item('gregtech:wire_hex', 427), item('gregtech:meta_item_1', 205), item('gregtech:wire_hex', 427)],
    [item('gregtech:wire_hex', 427), item('minecraft:glass_bottle') ,item('gregtech:wire_hex', 427)],
    [item('gregtech:wire_hex', 427), item('gregtech:machine', 1393) ,item('gregtech:wire_hex', 427)]
])

crafting.addShaped(item('randomthings:timeinabottle'), [
    [item('botania:manaresource', 14), item('bloodarsenal:base_item', 9) ,item('botania:manaresource', 14)],
    [item('botania:manaresource', 14), item('minecraft:glass_bottle'), item('botania:manaresource', 14)],
    [item('botania:manaresource', 14), item('astralsorcery:itemcelestialcrystal').withNbt(["astralsorcery": ["crystalProperties": ["size": 900, "purity": 100, "collectiveCapability": 100, "fract": 0, "sizeOverride": -1]]]), item('botania:manaresource', 14)]
])