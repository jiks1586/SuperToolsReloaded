
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
public class ItemUltraarmor extends ElementsSuperToolsReloaded.ModElement {
	@GameRegistry.ObjectHolder("stmr:ultraarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("stmr:ultraarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("stmr:ultraarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("stmr:ultraarmorboots")
	public static final Item boots = null;
	public ItemUltraarmor(ElementsSuperToolsReloaded instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ULTRAARMOR", "stmr:ultra_", 350, new int[]{7, 9, 9, 7}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("item.armor.equip_generic")),
				4.5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("ultraarmorhelmet")
				.setRegistryName("ultraarmorhelmet").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("ultraarmorbody")
				.setRegistryName("ultraarmorbody").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("ultraarmorlegs")
				.setRegistryName("ultraarmorlegs").setCreativeTab(TabXraytab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("ultraarmorboots")
				.setRegistryName("ultraarmorboots").setCreativeTab(TabXraytab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("stmr:ultraarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("stmr:ultraarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("stmr:ultraarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("stmr:ultraarmorboots", "inventory"));
	}
}
