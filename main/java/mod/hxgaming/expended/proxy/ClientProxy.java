package mod.hxgaming.expended.proxy;

import mod.hxgaming.expended.init.ExpendedItems;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy

{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
			super.preInit(event);
			ExpendedItems.init();
	}
		
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);
		ExpendedItems.registerRenders();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		super.postInit(event);	
	}
	


}
