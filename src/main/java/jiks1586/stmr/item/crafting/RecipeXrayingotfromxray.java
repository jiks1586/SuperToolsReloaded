
package jiks1586.stmr.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import jiks1586.stmr.item.ItemXrayIngot;
import jiks1586.stmr.block.BlockXray;
import jiks1586.stmr.ElementsSuperToolsReloaded;

@ElementsSuperToolsReloaded.ModElement.Tag
public class RecipeXrayingotfromxray extends ElementsSuperToolsReloaded.ModElement {
	public RecipeXrayingotfromxray(ElementsSuperToolsReloaded instance) {
		super(instance, 3);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockXray.block, (int) (1)), new ItemStack(ItemXrayIngot.block, (int) (1)), 3F);
	}
}
