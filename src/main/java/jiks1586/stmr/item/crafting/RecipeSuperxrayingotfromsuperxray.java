
package jiks1586.stmr.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import jiks1586.stmr.item.ItemSuperxraylngot;
import jiks1586.stmr.block.BlockSuperxray;
import jiks1586.stmr.ElementsSuperToolsReloaded;

@ElementsSuperToolsReloaded.ModElement.Tag
public class RecipeSuperxrayingotfromsuperxray extends ElementsSuperToolsReloaded.ModElement {
	public RecipeSuperxrayingotfromsuperxray(ElementsSuperToolsReloaded instance) {
		super(instance, 25);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSuperxray.block, (int) (1)), new ItemStack(ItemSuperxraylngot.block, (int) (1)), 0F);
	}
}
