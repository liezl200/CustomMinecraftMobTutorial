package com.sapphire.main;

import com.sapphire.lib.Strings;
import com.sapphire.mob.EntitySapphire;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.Mod.Metadata;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Strings.MODID, name = Strings.name, version = Strings.version)
public class Main
{
	
	@SidedProxy(clientSide = "com.sapphire.main.ClientProxy", serverSide = "com.sapphire.main.ServerProxy")
	public static ServerProxy proxy;

    @Metadata
    public static ModMetadata meta;
    
    @Instance(Strings.MODID)
    public static Main modInstance;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent PreEvent)
    {
    	EntitySapphire.mainRegistry();
    	proxy.registerRenderThings();
    }

}
