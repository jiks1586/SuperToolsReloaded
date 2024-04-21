
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
public class ItemSuper_xray_armor extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:super_xray_armorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("stmr:super_xray_armorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("stmr:super_xray_armorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("stmr:super_xray_armorboots")
	public static final Item boots = null;
	public ItemSuper_xray_armor(ElementsSuperToolsReloaded instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("SUPER_XRAY_ARMOR", "stmr:super_xray_", 325, new int[]{6, 7, 8, 6}, 12,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
				4f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("super_xray_armorhelmet")
				.setRegistryName("super_xray_armorhelmet").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("super_xray_armorbody")
				.setRegistryName("super_xray_armorbody").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("super_xray_armorlegs")
				.setRegistryName("super_xray_armorlegs").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("super_xray_armorboots")
				.setRegistryName("super_xray_armorboots").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("stmr:super_xray_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("stmr:super_xray_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("stmr:super_xray_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("stmr:super_xray_armorboots", "inventory"));
	}
}
