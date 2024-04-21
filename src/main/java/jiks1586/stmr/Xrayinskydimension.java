package jiks1586.stmr;

import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;

import java.util.Random;
import net.minecraftforge.fml.common.Loader;
import net.minecraft.world.gen.feature.WorldGenMinable;
import jiks1586.stmr.block.BlockXray;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;

/**
 * Make the mod generate Xray block in Sky Dimension
 * @author CoolCLK
*/
@ElementsSuperToolsReloaded.ModElement.Tag
public class Xrayinskydimension extends ElementsSuperToolsReloaded.ModElement {
	public Xrayinskydimension(ElementsSuperToolsReloaded instance) {
		super(instance, 40);
	}
	
	@Override
	public void generateWorld(Random random, int posX, int posZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		if (Loader.instance().getModList().stream().anyMatch(mod -> mod.getModId() == "skydimension") && dimID == 2) {
			for (int i = 0; i < 7; i++) {
				int x = posX + random.nextInt(16);
				int y = random.nextInt(72) + 0;
				int z = posZ + random.nextInt(16);
				(new WorldGenMinable(BlockXray.block.getDefaultState(), 3, new com.google.common.base.Predicate<IBlockState>() {
					public boolean apply(IBlockState blockAt) {
						boolean blockCriteria = false;
						IBlockState require;
						if (blockAt.getBlock() == Blocks.STONE.getDefaultState().getBlock())
							blockCriteria = true;
						return blockCriteria;
					}
				})).generate(world, random, new BlockPos(x, y, z));
			}
		}
	}
}
