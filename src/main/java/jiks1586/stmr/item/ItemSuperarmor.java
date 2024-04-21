
package jiks1586.stmr.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import jiks1586.stmr.creativetab.TabXraytab;
import jiks1586.stmr.ElementsSuperToolsReloaded;

@ElementsSuperToolsReloaded.ModElement.Tag
public class ItemSuperarmor extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:superarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("stmr:superarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("stmr:superarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("stmr:superarmorboots")
	public static final Item boots = null;
	public ItemSuperarmor(ElementsSuperToolsReloaded instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SUPERARMOR", "stmr:super_", 275, new int[]{5, 7, 7, 5}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
				3.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("superarmorhelmet")
				.setRegistryName("superarmorhelmet").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("superarmorbody")
				.setRegistryName("superarmorbody").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("superarmorlegs")
				.setRegistryName("superarmorlegs").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("superarmorboots")
				.setRegistryName("superarmorboots").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("stmr:superarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("stmr:superarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("stmr:superarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("stmr:superarmorboots", "inventory"));
	}
}
