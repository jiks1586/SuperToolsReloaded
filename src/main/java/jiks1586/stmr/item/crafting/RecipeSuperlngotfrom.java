
package jiks1586.stmr.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import jiks1586.stmr.item.ItemSuperlngot;
import jiks1586.stmr.block.BlockSuperore;
import jiks1586.stmr.ElementsSuperToolsReloaded;

@ElementsSuperToolsReloaded.ModElement.Tag
public class RecipeSuperlngotfrom extends ElementsSuperToolsReloaded.ModElement {
	public RecipeSuperlngotfrom(ElementsSuperToolsReloaded instance) {
		super(instance, 43);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockSuperore.block, (int) (1)), new ItemStack(ItemSuperlngot.block, (int) (1)), 2F);
	}
}
