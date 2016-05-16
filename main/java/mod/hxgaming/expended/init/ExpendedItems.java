package mod.hxgaming.expended.init;

import mod.hxgaming.expended.Expended;
import mod.hxgaming.expended.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ExpendedItems 
{
	public static Item ra_battery;
	
	public static void init()
	{
		ra_battery = registerItem(new Item(), "ra_battery").setUnlocalizedName("ra_battery");
	
	}
	
	public static void registerRenders()
	{
		registerRender(ra_battery);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
		.register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	

	public static Item registerItem(Item item, String name)
	{
		return registerItem(item, name, null);
	}
	
	public static Item registerItem(Item item, String name, CreativeTabs tab)
	{
		GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
		return item;
	}

}
