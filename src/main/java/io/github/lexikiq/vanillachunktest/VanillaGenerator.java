package io.github.lexikiq.vanillachunktest;

import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class VanillaGenerator extends ChunkGenerator {
	@Override
	public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid biome) {
		// System.out.println(chunkX + " " + chunkZ);
		return createVanillaChunkData(world, chunkX, chunkZ);
	}
}
