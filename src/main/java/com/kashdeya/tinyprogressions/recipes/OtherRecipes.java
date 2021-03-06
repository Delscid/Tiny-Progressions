package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.registry.recipes.ShapedRecipe;
import com.kashdeya.tinyprogressions.registry.recipes.ShapelessRecipe;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OtherRecipes
{
	public static IRecipe POUCH, SUGAR1;
	public static IRecipe FLINT1, INFIN_WATER_BUCKET;
	public static IRecipe FLINT_KNIFE, QUARTZ_KNIFE, QUARTZ_DUST;
	public static IRecipe MYCELIUM_SEEDS;
	public static IRecipe OBSIDIAN_INGOT, OBSIDIAN1;
	public static IRecipe WUB_JUICE;
	
	public static void init()
	{
		// WUB WUB JUICE
		if(ConfigHandler.vasholine){
			WUB_JUICE = new ShapedRecipe(FluidUtil.getFilledBucket(new FluidStack(FluidRegistry.getFluid("vasholine"), Fluid.BUCKET_VOLUME)),
					"sss",
					"sbs",
					"sss",
					'b', new ItemStack(Items.BUCKET),
					's', new ItemStack(TechItems.wub_gem));
		}
		if (ConfigHandler.wub_juice_tools && ConfigHandler.vasholine){
			GameRegistry.addSmelting(TechItems.wub_gem, new ItemStack(TechItems.wub_ingot), 1.0F);
		}
		
		// Infin Water Bucket
		if (ConfigHandler.infin_bucket){
			INFIN_WATER_BUCKET = new ShapedRecipe(new ItemStack(TechItems.infin_bucket), 
					"wew",
	                "sws",
	                " s ",
					's', new ItemStack(TechItems.steel_ingot),
					'w', new ItemStack(Items.WATER_BUCKET),
					'e', new ItemStack(Items.ENDER_EYE));
		}
		
		// Pouch
		if (ConfigHandler.pouch) {
		    POUCH = new ShapedRecipe(new ItemStack(TechItems.pouch), 
		    		"lsl",
		    		"clc",
		    		"lsl",
		    		's', new ItemStack(Items.STRING),
		    		'l', new ItemStack(Items.LEATHER),
		    		'c', new ItemStack(Blocks.CHEST));
		}
		
		// MISC Flint Recipe
		if (ConfigHandler.FlintRecipe){
			FLINT1 = new ShapedRecipe(new ItemStack(Items.FLINT), 
					"gg",
					"g ",
					'g', "blockGravel");
		}
		
		// Quartz Items
		if (ConfigHandler.QuartzKnife) {
			QUARTZ_KNIFE = new ShapedRecipe(new ItemStack(TechItems.quartz_knife), 
					"  s",
					" s ",
					"q  ",
					's', "stickWood",
					'q', "gemQuartz");
						
			QUARTZ_DUST = new ShapedRecipe(new ItemStack(TechItems.quartz_dust), 
					"kq",
					'k', new ItemStack(TechItems.quartz_knife),
					'q', "gemQuartz");
		}
					
		// Mycelium Seeds
		if (ConfigHandler.MyceliumSeeds) {
			MYCELIUM_SEEDS = new ShapedRecipe(new ItemStack(TechItems.mycelium_seeds), 
					"sss",
					"ses",
					"sss",
					's', new ItemStack(Items.WHEAT_SEEDS),
					'e', new ItemStack(Items.SPIDER_EYE));
		}
		
		// Flint Ingot WIP
		if (ConfigHandler.FlintBlock) {
			GameRegistry.addSmelting(TechBlocks.flint_block, new ItemStack(TechItems.flint_ingot), 1.0F);
		}
		
		// Reinforced Obsidian Ingot
		if (ConfigHandler.ReinforcedObsidian) {
			OBSIDIAN_INGOT = new ShapelessRecipe(new ItemStack(TechItems.reinforced_obsidian_ingot, 9), new ItemStack(TechBlocks.reinforced_obsidian));
			OBSIDIAN1 = new ShapedRecipe(new ItemStack(TechBlocks.reinforced_obsidian), 
					"sss",
					"sss",
					"sss",
					's', new ItemStack(TechItems.reinforced_obsidian_ingot));
		}
		
		// Flint Knife
		if (ConfigHandler.FlintKnife) {
			FLINT_KNIFE = new ShapelessRecipe(new ItemStack(TechItems.flint_knife), "flint", "flint", "stickWood");
		}
		
        // Old Reed
        if (ConfigHandler.old_reed) {
            SUGAR1 = new ShapelessRecipe(new ItemStack(Items.SUGAR), new ItemStack(TechItems.dead_reed));
        }

	}
}
