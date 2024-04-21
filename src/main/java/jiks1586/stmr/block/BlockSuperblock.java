
package jiks1586.stmr.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import jiks1586.stmr.creativetab.TabXraytab;
import jiks1586.stmr.ElementsSuperToolsReloaded;

@ElementsSuperToolsReloaded.ModElement.Tag
public class BlockSuperblock extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:superblock")
	public static final Block block = null;
	public BlockSuperblock(ElementsSuperToolsReloaded instance) {
		super(instance, 63);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("superblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("stmr:superblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("superblock");
			setSoundType(SoundType.GROUND);
			setHardness(3F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabXraytab.tab);
		}
	}
}
