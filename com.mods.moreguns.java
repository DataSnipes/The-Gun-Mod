package com.mods.moreweapons;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import AK47.json;

 
@Mod(modid = ButterMod.MODID, version = Guns.VERSION)
public class GunsMod {

    public static final String MODID = "More Weapons";
    public static final String VERSION = "1.0";

    @EventHandler

    public void init(FMLInitializationEvent event) {
        // some example code
        Item Glock16 = new ItemCrossbow().setItemName("Glock 16").setitem
        
        GameRegistry.registerItem(Item.Glock16, "Glock 16");
    
        
 }
 }