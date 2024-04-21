
package jiks1586.stmr.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import jiks1586.stmr.creativetab.TabXraytab;
import jiks1586.stmr.ElementsSuperToolsReloaded;

import java.util.Set;
import java.util.HashMap;

@ElementsSuperToolsReloaded.ModElement.Tag
public class ItemXrayhoe extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:xrayhoe")
	public static final Item block = null;
	public ItemXrayhoe(ElementsSuperToolsReloaded instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("XRAYHOE", 3, 3122, 5f, 0f, 2)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("xrayhoe").setRegistryName("xrayhoe").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stmr:xrayhoe", "inventory"));
	}
}
