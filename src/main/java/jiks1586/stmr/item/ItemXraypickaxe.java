
package jiks1586.stmr.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import jiks1586.stmr.creativetab.TabXraytab;
import jiks1586.stmr.ElementsSuperToolsReloaded;

import java.util.Set;
import java.util.HashMap;

@ElementsSuperToolsReloaded.ModElement.Tag
public class ItemXraypickaxe extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:xraypickaxe")
	public static final Item block = null;
	public ItemXraypickaxe(ElementsSuperToolsReloaded instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("XRAYPICKAXE", 3, 3122, 8f, 3f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("xraypickaxe").setRegistryName("xraypickaxe").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stmr:xraypickaxe", "inventory"));
	}
}
