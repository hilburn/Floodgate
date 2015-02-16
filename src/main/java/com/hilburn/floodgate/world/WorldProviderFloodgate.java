package com.hilburn.floodgate.world;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderFloodgate extends WorldProvider{

	public void registerWorldChunkManager(){
		WorldChunkManager manager = new WorldChunkManagerHell(BiomeGenBase.deepOcean, BiomeGenBase.deepOcean.rainfall);
		this.worldChunkMgr = manager;               
		this.dimensionId = 0;
	}
	
	@Override
	public IChunkProvider createChunkGenerator()        {               
		return new ChunkProviderFloodgate(worldObj, worldObj.getSeed(), false);        
	}
	  
	@Override
	public String getDimensionName() {
		return "Flooded world";
	}

}
