package com.sapphire.main;

import com.sapphire.mob.EntitySapphireMob;
import com.sapphire.mob.RenderSapphireMob;
import com.sapphire.mob.Sapphire;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	
	public void registerRenderThings(){
		
		//RenderingRegistry.registerEntityRenderingHandler(EntitySapphireMob.class, new RenderSapphireMob(new Sapphire(), 0)); // old way, for Forge 1.7
		//RenderingRegistry.registerEntityRenderingHandler(EntitySapphireMob.class, RenderSapphireMob::new); // java 8
		
		RenderingRegistry.registerEntityRenderingHandler(EntitySapphireMob.class, new IRenderFactory<EntitySapphireMob>() { // java 6/7
			@Override
			public Render<? super EntitySapphireMob> createRenderFor(RenderManager manager) {
				return new RenderSapphireMob(manager, new Sapphire(), 0);
			}
		});
			
		
	
	}

}
