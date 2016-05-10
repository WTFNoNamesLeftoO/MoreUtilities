package iamtheissue.moreutilities.init;



import cpw.mods.fml.common.registry.GameRegistry;
import iamtheissue.moreutilities.items.ItemFuelPellet;
import iamtheissue.moreutilities.items.ItemPoisonous;
import iamtheissue.moreutilities.main.Main;
import iamtheissue.moreutilities.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class Items
{
	
	public static Item raw_squid;
	public static Item cooked_squid;
	public static Item raw_horse;
	public static Item cooked_horse;
	public static Item raw_spider_leg;
	public static Item cooked_spider_leg;
	public static Item cooked_spider_eye;
	public static Item raw_mutton;
	public static Item cooked_mutton;
	
	public static Item coal_pellet;
	public static Item charcoal_pellet;
	
		
	public static void init()
	{
		raw_squid = new ItemFood(2, 0.4f, false).setUnlocalizedName("raw_squid").setTextureName(Reference.MOD_ID + ":raw_squid");
		cooked_squid = new ItemFood(5, 6f, false).setUnlocalizedName("cooked_squid").setTextureName(Reference.MOD_ID + ":cooked_squid");
		raw_horse = new ItemFood(3, 1.8f, true).setUnlocalizedName("raw_horse").setTextureName(Reference.MOD_ID + ":raw_horse");
		cooked_horse = new ItemFood(8, 12.8f, true).setUnlocalizedName("cooked_horse").setTextureName(Reference.MOD_ID + ":cooked_horse");
		raw_spider_leg = new ItemPoisonous(1, 0.2f, 100, 0).setUnlocalizedName("raw_spider_leg").setTextureName(Reference.MOD_ID + ":raw_spider_leg");
		cooked_spider_leg = new ItemFood(2,  2f, false).setUnlocalizedName("cooked_spider_leg").setTextureName(Reference.MOD_ID + ":cooked_spider_leg");
		cooked_spider_eye = new ItemFood(2,  2f, false).setUnlocalizedName("cooked_spider_eye").setTextureName(Reference.MOD_ID + ":cooked_spider_eye");
		raw_mutton = new ItemFood(2, 1.2f, true).setUnlocalizedName("raw_mutton").setTextureName(Reference.MOD_ID + ":raw_mutton");
		cooked_mutton = new ItemFood(6, 9.6f, true).setUnlocalizedName("cooked_mutton").setTextureName(Reference.MOD_ID + ":cooked_mutton");
		
		
		
		coal_pellet = new ItemFuelPellet(200).setUnlocalizedName("coal_pellet").setTextureName(Reference.MOD_ID + ":coal_pellet");
		charcoal_pellet = new ItemFuelPellet(200).setUnlocalizedName("charcoal_pellet").setTextureName(Reference.MOD_ID + ":charcoal_pellet");
		
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(raw_squid, raw_squid.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_squid, cooked_squid.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_horse, raw_horse.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_horse, cooked_horse.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_spider_leg, raw_spider_leg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider_leg, cooked_spider_leg.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_spider_eye, cooked_spider_eye.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(raw_mutton, raw_mutton.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cooked_mutton, cooked_mutton.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(coal_pellet, coal_pellet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(charcoal_pellet, charcoal_pellet.getUnlocalizedName().substring(5));
		
		
		}
	
	public static void registerThaumcraftAspects()
	{
		/*
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_squid), (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.LIFE, 1).add(Aspect.WATER, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_squid), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_horse), (new AspectList()).add(Aspect.BEAST, 2).add(Aspect.LIFE, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_horse), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_spider), (new AspectList()).add(Aspect.DEATH, 2).add(Aspect.BEAST, 2).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider), (new AspectList()).add(Aspect.LIFE, 2).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(raw_spider_leg), (new AspectList()).add(Aspect.DEATH, 1).add(Aspect.BEAST, 1).add(Aspect.EARTH, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider_leg), (new AspectList()).add(Aspect.LIFE, 1).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		ThaumcraftApi.registerObjectTag(new ItemStack(cooked_spider_eye), (new AspectList()).add(Aspect.LIFE, 1).add(Aspect.CRAFT, 1).add(Aspect.BEAST, 1));
		
		ThaumcraftApi.registerObjectTag(new ItemStack(phial_goo, 1, 0), (new AspectList()).add(Aspect.FLUX, 2).add(Aspect.AURA, 2));
		ThaumcraftApi.registerObjectTag(new ItemStack(phial_goo, 1, 1), (new AspectList()).add(Aspect.FLUX, 4).add(Aspect.AURA, 4));
		*/
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
