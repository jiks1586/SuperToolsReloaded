
package jiks1586.stmr.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import jiks1586.stmr.item.ItemXrayIngot;
import jiks1586.stmr.ElementsSuperToolsReloaded;

@ElementsSuperToolsReloaded.ModElement.Tag
public class TabXraytab extends ElementsSuperToolsReloaded.ModElement {
	public TabXraytab(ElementsSuperToolsReloaded instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabxraytab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemXrayIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
