
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
public class ItemXrayarmor extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:xrayarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("stmr:xrayarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("stmr:xrayarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("stmr:xrayarmorboots")
	public static final Item boots = null;
	public ItemXrayarmor(ElementsSuperToolsReloaded instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("XRAYARMOR", "stmr:xray_", 250, new int[]{4, 6, 6, 4}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
				3f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("xrayarmorhelmet")
				.setRegistryName("xrayarmorhelmet").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("xrayarmorbody")
				.setRegistryName("xrayarmorbody").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("xrayarmorlegs")
				.setRegistryName("xrayarmorlegs").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("xrayarmorboots")
				.setRegistryName("xrayarmorboots").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("stmr:xrayarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("stmr:xrayarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("stmr:xrayarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("stmr:xrayarmorboots", "inventory"));
	}
}
