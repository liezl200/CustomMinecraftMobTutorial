package com.sapphire.mob;

import com.sapphire.lib.Strings;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSapphireMob extends RenderLiving{

	private static final ResourceLocation mobTextures = new ResourceLocation(Strings.MODID + ":textures/entity/Sapphire.png");
	private static final String __OBFID = "CL_00000984";
	
	public RenderSapphireMob(RenderManager rm, ModelBase par1ModelBase, float par2) {
		super(rm, par1ModelBase, par2);
	}
	
	protected ResourceLocation getEntityTexture(EntitySapphireMob entity){
		return mobTextures;
	}
	
	protected ResourceLocation getEntityTexture(Entity entity){
		return this.getEntityTexture((EntitySapphireMob)entity);
	}

}
