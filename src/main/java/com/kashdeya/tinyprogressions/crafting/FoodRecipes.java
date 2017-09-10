package com.kashdeya.tinyprogressions.crafting;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechFoods;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FoodRecipes {

	public static void init() {
		// Juicer
		if (ConfigHandler.all_juices || ConfigHandler.JuiceBottles){
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.juicer), new Object[] {
					"l",
					"s",
						Character.valueOf('s'), "stone",
						Character.valueOf('l'), Blocks.STONE_BUTTON
			});
		}
		
		// Juices WO Bottles
		if (ConfigHandler.all_juices && ConfigHandler.JuiceBottles == false){
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
					"juicer", Items.APPLE
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
					"juicer", Items.CARROT
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
					"juicer", Items.POTATO
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
					"juicer", Items.BEETROOT
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
					"juicer", Blocks.CACTUS
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
					"juicer", Items.SLIME_BALL
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
					"juicer", Items.WHEAT
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
					"juicer", Items.MELON
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
					"juicer", Blocks.PUMPKIN
			});
		}
		
		// Juice Bottles
		if (ConfigHandler.JuiceBottles && ConfigHandler.all_juices == false){
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.apple_juice), new Object[] {
					"juicer", Items.APPLE, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.carrot_juice), new Object[] {
					"juicer", Items.CARROT, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.potatoe_juice), new Object[] {
					"juicer", Items.POTATO, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.beet_juice), new Object[] {
					"juicer", Items.BEETROOT, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.cactus_juice, 2), new Object[] {
					"juicer", Blocks.CACTUS, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.slime_juice), new Object[] {
					"juicer", Items.SLIME_BALL, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.wheat_juice), new Object[] {
					"juicer", Items.WHEAT, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.melon_juice), new Object[] {
					"juicer", Items.MELON, "glassBottle"
			});
			
			RecipeRegistry.addShapelessRecipe(new ItemStack(TechFoods.pumpkin_juice, 2), new Object[] {
					"juicer", Blocks.PUMPKIN, "glassBottle"
			});
		}
		
		// Apples
		if (ConfigHandler.DiamondApple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.diamond_apple), new Object[] {
					"ddd",
					"dad",
					"ddd",
						Character.valueOf('d'), "gemDiamond",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.EmeraldApple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.emerald_apple), new Object[] {
					"eee",
					"eae",
					"eee",
						Character.valueOf('e'), "gemEmerald",
						Character.valueOf('a'), Items.APPLE
			});
		}
		if (ConfigHandler.iron_apple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.iron_apple), new Object[] {
					"iii",
					"iai",
					"iii",
						Character.valueOf('i'), "ingotIron",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		if (ConfigHandler.redstone_apple) {
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.redstone_apple), new Object[] {
					"rrr",
					"rar",
					"rrr",
						Character.valueOf('r'), "dustRedstone",
						Character.valueOf('a'), Items.APPLE
			});
		}
 		
 		// Apple Pro
		if (ConfigHandler.ApplePro && ConfigHandler.NotchApple == false) {
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 0), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "nuggetGold",
						Character.valueOf('a'), Items.APPLE
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(TechFoods.golden_apple), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "ingotGold",
						Character.valueOf('a'), new ItemStack(Items.GOLDEN_APPLE, 1, 0)
			});
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "blockGold",
						Character.valueOf('a'), TechFoods.golden_apple
			});
		}
		
		// Notch Apple
		if (ConfigHandler.NotchApple && ConfigHandler.ApplePro == false) {
			RecipeRegistry.addShapedRecipe(new ItemStack(Items.GOLDEN_APPLE, 1, 1), new Object[] {
					"ggg",
					"gag",
					"ggg",
						Character.valueOf('g'), "blockGold",
						Character.valueOf('a'), Items.APPLE
			});
		}
	}
}