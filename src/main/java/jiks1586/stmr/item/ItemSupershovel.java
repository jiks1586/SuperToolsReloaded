
package jiks1586.stmr.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import jiks1586.stmr.creativetab.TabXraytab;
import jiks1586.stmr.ElementsSuperToolsReloaded;

import java.util.Set;
import java.util.HashMap;

@ElementsSuperToolsReloaded.ModElement.Tag
public class ItemSupershovel extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:supershovel")
	public static final Item block = null;
	public ItemSupershovel(ElementsSuperToolsReloaded instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("SUPERSHOVEL", 3, 3903, 12f, 2f, 2)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 3);
				return ret.keySet();
			}
		}.setUnlocalizedName("supershovel").setRegistryName("supershovel").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("stmr:supershovel", "inventory"));
	}
}
