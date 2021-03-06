package com.kashdeya.tinyprogressions.inits;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.handlers.DamageHandler;
import com.kashdeya.tinyprogressions.handlers.MaterialHandler;
import com.kashdeya.tinyprogressions.items.battle.BattleMain;
import com.kashdeya.tinyprogressions.items.battle.EmeraldBattle;
import com.kashdeya.tinyprogressions.items.battle.ObsidianBattle;
import com.kashdeya.tinyprogressions.items.bsc.BscDiamondAxe;
import com.kashdeya.tinyprogressions.items.bsc.BscDiamondHoe;
import com.kashdeya.tinyprogressions.items.bsc.BscDiamondPickaxe;
import com.kashdeya.tinyprogressions.items.bsc.BscDiamondSpade;
import com.kashdeya.tinyprogressions.items.bsc.BscDiamondSword;
import com.kashdeya.tinyprogressions.items.bsc.BscGoldAxe;
import com.kashdeya.tinyprogressions.items.bsc.BscGoldHoe;
import com.kashdeya.tinyprogressions.items.bsc.BscGoldPickaxe;
import com.kashdeya.tinyprogressions.items.bsc.BscGoldSpade;
import com.kashdeya.tinyprogressions.items.bsc.BscGoldSword;
import com.kashdeya.tinyprogressions.items.bsc.BscIronAxe;
import com.kashdeya.tinyprogressions.items.bsc.BscIronHoe;
import com.kashdeya.tinyprogressions.items.bsc.BscIronPickaxe;
import com.kashdeya.tinyprogressions.items.bsc.BscIronSpade;
import com.kashdeya.tinyprogressions.items.bsc.BscIronSword;
import com.kashdeya.tinyprogressions.items.multi.EmeraldMulti;
import com.kashdeya.tinyprogressions.items.multi.FlintMulti;
import com.kashdeya.tinyprogressions.items.multi.MultiMain;
import com.kashdeya.tinyprogressions.items.multi.ObsidianMulti;
import com.kashdeya.tinyprogressions.items.scythes.EmeraldScythe;
import com.kashdeya.tinyprogressions.items.scythes.ObsidianScythe;
import com.kashdeya.tinyprogressions.items.scythes.ScytheMain;
import com.kashdeya.tinyprogressions.items.seaxe.SeaIronAxe;
import com.kashdeya.tinyprogressions.items.seaxe.SeaIronPickaxe;
import com.kashdeya.tinyprogressions.items.spears.EmeraldSpear;
import com.kashdeya.tinyprogressions.items.spears.ObsidianSpear;
import com.kashdeya.tinyprogressions.items.spears.SpearMain;
import com.kashdeya.tinyprogressions.items.tools.BirthdayPickaxe;
import com.kashdeya.tinyprogressions.items.tools.KappaPick;
import com.kashdeya.tinyprogressions.items.tools.base.BaseAxe;
import com.kashdeya.tinyprogressions.items.tools.base.BaseHoe;
import com.kashdeya.tinyprogressions.items.tools.base.BasePickaxe;
import com.kashdeya.tinyprogressions.items.tools.base.BaseSpade;
import com.kashdeya.tinyprogressions.items.tools.base.BaseSword;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneAxe;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneHoe;
import com.kashdeya.tinyprogressions.items.tools.bone.BonePickaxe;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneSpade;
import com.kashdeya.tinyprogressions.items.tools.bone.BoneSword;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldAxe;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldHoe;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldPickaxe;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldSpade;
import com.kashdeya.tinyprogressions.items.tools.emerald.EmeraldSword;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintAxe;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintHoe;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintPickaxe;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintSpade;
import com.kashdeya.tinyprogressions.items.tools.flint.FlintSword;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianAxe;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianHoe;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianPickaxe;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianSpade;
import com.kashdeya.tinyprogressions.items.tools.obsidian.ObsidianSword;
import com.kashdeya.tinyprogressions.items.tools.wub.WubAxe;
import com.kashdeya.tinyprogressions.items.tools.wub.WubHoe;
import com.kashdeya.tinyprogressions.items.tools.wub.WubMulti;
import com.kashdeya.tinyprogressions.items.tools.wub.WubPickaxe;
import com.kashdeya.tinyprogressions.items.tools.wub.WubSpade;
import com.kashdeya.tinyprogressions.items.tools.wub.WubSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class TechTools {
	// Flint
	public static Item flint_pickaxe;
	public static Item flint_axe;
	public static Item flint_spade;
	public static Item flint_sword;
	public static Item flint_hoe;
	// Bone
	public static Item bone_pickaxe;
	public static Item bone_axe;
	public static Item bone_spade;
	public static Item bone_sword;
	public static Item bone_hoe;
	// Birthday
	public static Item birthday_pickaxe;
	// Kappa Pick
	public static Item kappa_pick;
	// Emerald
	public static Item emerald_axe;
	public static Item emerald_pickaxe;
	public static Item emerald_spade;
	public static Item emerald_hoe;
	public static Item emerald_sword;
	// Obsidian
	public static Item obsidian_axe;
	public static Item obsidian_pickaxe;
	public static Item obsidian_spade;
	public static Item obsidian_hoe;
	public static Item obsidian_sword;
	// Scythe
	public static Item wooden_scythe;
	public static Item stone_scythe;
	public static Item golden_scythe;
	public static Item iron_scythe;
	public static Item emerald_scythe;
	public static Item diamond_scythe;
	public static Item obsidian_scythe;
	// Multi
	public static Item wooden_multi;
	public static Item stone_multi;
	public static Item golden_multi;
	public static Item iron_multi;
	public static Item emerald_multi;
	public static Item diamond_multi;
	public static Item obsidian_multi;
	public static Item flint_multi;
	// Battle
	public static Item wooden_battle;
	public static Item stone_battle;
	public static Item golden_battle;
	public static Item iron_battle;
	public static Item emerald_battle;
	public static Item diamond_battle;
	public static Item obsidian_battle;
	// Spear
	public static Item wooden_spear;
	public static Item stone_spear;
	public static Item golden_spear;
	public static Item iron_spear;
	public static Item emerald_spear;
	public static Item diamond_spear;
	public static Item obsidian_spear;
	// bsc tools and weapons
	public static Item bsc_iron_sword;
	public static Item bsc_iron_pickaxe;
	public static Item bsc_iron_axe;
	public static Item bsc_iron_hoe;
	public static Item bsc_iron_spade;
	public static Item bsc_gold_sword;
	public static Item bsc_gold_pickaxe;
	public static Item bsc_gold_axe;
	public static Item bsc_gold_hoe;
	public static Item bsc_gold_spade;
	public static Item bsc_diamond_sword;
	public static Item bsc_diamond_pickaxe;
	public static Item bsc_diamond_axe;
	public static Item bsc_diamond_hoe;
	public static Item bsc_diamond_spade;
	// nether tools and weapons
	public static Item nether_iron_sword;
	public static Item nether_iron_pickaxe;
	public static Item nether_iron_axe;
	public static Item nether_iron_hoe;
	public static Item nether_iron_spade;
	public static Item nether_gold_sword;
	public static Item nether_gold_pickaxe;
	public static Item nether_gold_axe;
	public static Item nether_gold_hoe;
	public static Item nether_gold_spade;
	public static Item nether_diamond_sword;
	public static Item nether_diamond_pickaxe;
	public static Item nether_diamond_axe;
	public static Item nether_diamond_hoe;
	public static Item nether_diamond_spade;
	public static Item nether_sword;
	public static Item nether_pickaxe;
	public static Item nether_axe;
	public static Item nether_hoe;
	public static Item nether_spade;
	// c axe
	public static Item c_axe;
	// Wub Extras
	public static Item wub_axe;
	public static Item wub_pickaxe;
	public static Item wub_spade;
	public static Item wub_hoe;
	public static Item wub_sword;
	public static Item wub_paxel;
	
	public static void init(){
		// wub extras
		if (ConfigHandler.wub_juice_tools && ConfigHandler.vasholine){
			wub_pickaxe = new WubPickaxe(MaterialHandler.WUBWUB).setUnlocalizedName("wub_pickaxe");
			wub_axe = new WubAxe(MaterialHandler.WUBWUB, 11.0F, -1.2F).setUnlocalizedName("wub_axe");
			wub_spade = new WubSpade(MaterialHandler.WUBWUB).setUnlocalizedName("wub_spade");
			wub_sword = new WubSword(MaterialHandler.WUBWUB).setUnlocalizedName("wub_sword");
			wub_hoe = new WubHoe(MaterialHandler.WUBWUB).setUnlocalizedName("wub_hoe");
			wub_paxel = new WubMulti(MaterialHandler.PWUBWUB).setUnlocalizedName("wub_paxel").setMaxDamage(DamageHandler.wub_multi);
		}
		// nether tools and weapons
		if (ConfigHandler.nether_rod && ConfigHandler.nether_iron_tools_weapons){
			nether_iron_pickaxe = new BasePickaxe(Item.ToolMaterial.IRON).setUnlocalizedName("nether_iron_pickaxe");
			nether_iron_axe = new BaseAxe(Item.ToolMaterial.IRON, 8.0F, -1.2F).setUnlocalizedName("nether_iron_axe");
			nether_iron_spade = new BaseSpade(Item.ToolMaterial.IRON).setUnlocalizedName("nether_iron_spade");
			nether_iron_sword = new BaseSword(Item.ToolMaterial.IRON).setUnlocalizedName("nether_iron_sword");
			nether_iron_hoe = new BaseHoe(Item.ToolMaterial.IRON).setUnlocalizedName("nether_iron_hoe");
		}
		if (ConfigHandler.nether_rod && ConfigHandler.nether_gold_tools_weapons){
			nether_gold_pickaxe = new BasePickaxe(Item.ToolMaterial.GOLD).setUnlocalizedName("nether_gold_pickaxe");
			nether_gold_axe = new BaseAxe(Item.ToolMaterial.GOLD, 6.0F, -1.2F).setUnlocalizedName("nether_gold_axe");
			nether_gold_spade = new BaseSpade(Item.ToolMaterial.GOLD).setUnlocalizedName("nether_gold_spade");
			nether_gold_sword = new BaseSword(Item.ToolMaterial.GOLD).setUnlocalizedName("nether_gold_sword");
			nether_gold_hoe = new BaseHoe(Item.ToolMaterial.GOLD).setUnlocalizedName("nether_gold_hoe");
		}
		if (ConfigHandler.nether_rod && ConfigHandler.nether_diamond_tools_weapons){
			nether_diamond_pickaxe = new BasePickaxe(Item.ToolMaterial.DIAMOND).setUnlocalizedName("nether_diamond_pickaxe");
			nether_diamond_axe = new BaseAxe(Item.ToolMaterial.DIAMOND, 8.0F, -1.2F).setUnlocalizedName("nether_diamond_axe");
			nether_diamond_spade = new BaseSpade(Item.ToolMaterial.DIAMOND).setUnlocalizedName("nether_diamond_spade");
			nether_diamond_sword = new BaseSword(Item.ToolMaterial.DIAMOND).setUnlocalizedName("nether_diamond_sword");
			nether_diamond_hoe = new BaseHoe(Item.ToolMaterial.DIAMOND).setUnlocalizedName("nether_diamond_hoe");
		}
		if (ConfigHandler.nether_rod && ConfigHandler.nether_tools_weapons){
			nether_pickaxe = new BasePickaxe(Item.ToolMaterial.STONE).setUnlocalizedName("nether_pickaxe");
			nether_axe = new BaseAxe(Item.ToolMaterial.STONE, 8.0F, -1.2F).setUnlocalizedName("nether_axe");
			nether_spade = new BaseSpade(Item.ToolMaterial.STONE).setUnlocalizedName("nether_spade");
			nether_sword = new BaseSword(Item.ToolMaterial.STONE).setUnlocalizedName("nether_sword");
			nether_hoe = new BaseHoe(Item.ToolMaterial.STONE).setUnlocalizedName("nether_hoe");
		}
		// c axe
		if (ConfigHandler.c_axe && ConfigHandler.sea_axe){
			c_axe = new SeaIronAxe(MaterialHandler.SEAIRON, 10.0F, -1.2F).setUnlocalizedName("c_axe");
		}
		if (ConfigHandler.c_axe && ConfigHandler.sea_pickaxe){
			c_axe = new SeaIronPickaxe(MaterialHandler.SEAIRON).setUnlocalizedName("c_axe");
		}
		// bsc tools and weapons
		if (ConfigHandler.bsc_rod && ConfigHandler.bsc_iron_tools_weapons){
			bsc_iron_pickaxe = new BscIronPickaxe(MaterialHandler.BSCIRON).setUnlocalizedName("bsc_iron_pickaxe");
			bsc_iron_axe = new BscIronAxe(MaterialHandler.BSCIRON, 8.0F, -1.2F).setUnlocalizedName("bsc_iron_axe");
			bsc_iron_spade = new BscIronSpade(MaterialHandler.BSCIRON).setUnlocalizedName("bsc_iron_spade");
			bsc_iron_sword = new BscIronSword(MaterialHandler.BSCIRON).setUnlocalizedName("bsc_iron_sword");
			bsc_iron_hoe = new BscIronHoe(MaterialHandler.BSCIRON).setUnlocalizedName("bsc_iron_hoe");
		}
		if (ConfigHandler.bsc_rod && ConfigHandler.bsc_gold_tools_weapons){
			bsc_gold_pickaxe = new BscGoldPickaxe(MaterialHandler.BSCGOLD).setUnlocalizedName("bsc_gold_pickaxe");
			bsc_gold_axe = new BscGoldAxe(MaterialHandler.BSCGOLD, 6.0F, -1.2F).setUnlocalizedName("bsc_gold_axe");
			bsc_gold_spade = new BscGoldSpade(MaterialHandler.BSCGOLD).setUnlocalizedName("bsc_gold_spade");
			bsc_gold_sword = new BscGoldSword(MaterialHandler.BSCGOLD).setUnlocalizedName("bsc_gold_sword");
			bsc_gold_hoe = new BscGoldHoe(MaterialHandler.BSCGOLD).setUnlocalizedName("bsc_gold_hoe");
		}
		if (ConfigHandler.bsc_rod && ConfigHandler.bsc_diamond_tools_weapons){
			bsc_diamond_pickaxe = new BscDiamondPickaxe(MaterialHandler.BSCDIAMOND).setUnlocalizedName("bsc_diamond_pickaxe");
			bsc_diamond_axe = new BscDiamondAxe(MaterialHandler.BSCDIAMOND, 8.0F, -1.2F).setUnlocalizedName("bsc_diamond_axe");
			bsc_diamond_spade = new BscDiamondSpade(MaterialHandler.BSCDIAMOND).setUnlocalizedName("bsc_diamond_spade");
			bsc_diamond_sword = new BscDiamondSword(MaterialHandler.BSCDIAMOND).setUnlocalizedName("bsc_diamond_sword");
			bsc_diamond_hoe = new BscDiamondHoe(MaterialHandler.BSCDIAMOND).setUnlocalizedName("bsc_diamond_hoe");
		}
		// Flint
		if (ConfigHandler.FlintTools){
			flint_pickaxe = new FlintPickaxe(MaterialHandler.FLINT).setUnlocalizedName("flint_pickaxe");
			flint_axe = new FlintAxe(MaterialHandler.FLINT, 6.5F, -1.2F).setUnlocalizedName("flint_axe");
			flint_spade = new FlintSpade(MaterialHandler.FLINT).setUnlocalizedName("flint_spade");
			flint_sword = new FlintSword(MaterialHandler.FLINT).setUnlocalizedName("flint_sword");
			flint_hoe = new FlintHoe(MaterialHandler.FLINT).setUnlocalizedName("flint_hoe");
		}
		// Bone
		if (ConfigHandler.BoneTools){
			bone_pickaxe = new BonePickaxe(MaterialHandler.BONE).setUnlocalizedName("bone_pickaxe");
			bone_axe = new BoneAxe(MaterialHandler.BONE, 5.5F, -1.2F).setUnlocalizedName("bone_axe");
			bone_spade = new BoneSpade(MaterialHandler.BONE).setUnlocalizedName("bone_spade");
			bone_sword = new BoneSword(MaterialHandler.BONE).setUnlocalizedName("bone_sword");
			bone_hoe = new BoneHoe(MaterialHandler.BONE).setUnlocalizedName("bone_hoe");
		}
		// Birthday
	    if (ConfigHandler.BirthdayPickaxe){
	    	birthday_pickaxe = new BirthdayPickaxe(MaterialHandler.BIRTHDAY);
		}
	    // Kappa Pick
	    if (ConfigHandler.kappa_pick){
	    	kappa_pick = new KappaPick(MaterialHandler.KAPPA).setUnlocalizedName("kappa_pick");
	    }
	    // Scythe
	    if (ConfigHandler.wooden_scythe){
	    	wooden_scythe = new ScytheMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_scythe").setMaxDamage(DamageHandler.wooden_scythe);
	    }
	    if (ConfigHandler.stone_scythe){
			stone_scythe = new ScytheMain(ToolMaterial.STONE).setUnlocalizedName("stone_scythe").setMaxDamage(DamageHandler.stone_scythe);
	    }
	    if (ConfigHandler.golden_scythe){
			golden_scythe = new ScytheMain(ToolMaterial.GOLD).setUnlocalizedName("golden_scythe").setMaxDamage(DamageHandler.golden_scythe);
	    }
	    if (ConfigHandler.iron_scythe){
			iron_scythe = new ScytheMain(ToolMaterial.IRON).setUnlocalizedName("iron_scythe").setMaxDamage(DamageHandler.iron_scythe);
	    }
	    if (ConfigHandler.diamond_scythe){
			diamond_scythe = new ScytheMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_scythe").setMaxDamage(DamageHandler.diamond_scythe);
	    }
		if (ConfigHandler.emerald_scythe){
			emerald_scythe = new EmeraldScythe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_scythe").setMaxDamage(DamageHandler.emerald_scythe);
		}
		if (ConfigHandler.obsidian_scythe){
			obsidian_scythe = new ObsidianScythe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_scythe").setMaxDamage(DamageHandler.obsidian_scythe);
		}
		// Emerald
		if (ConfigHandler.emerald_axe){
		    emerald_axe = new EmeraldAxe(MaterialHandler.EMERALD, 10.0F, -1.2F).setUnlocalizedName("emerald_axe").setMaxDamage(DamageHandler.emerald_axe);
		}
		if (ConfigHandler.emerald_pickaxe){
			emerald_pickaxe = new EmeraldPickaxe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_pickaxe").setMaxDamage(DamageHandler.emerald_pickaxe);
		}
		if (ConfigHandler.emerald_spade){
			emerald_spade = new EmeraldSpade(MaterialHandler.EMERALD).setUnlocalizedName("emerald_spade").setMaxDamage(DamageHandler.emerald_spade);
		}
		if (ConfigHandler.emerald_hoe){
			emerald_hoe = new EmeraldHoe(MaterialHandler.EMERALD).setUnlocalizedName("emerald_hoe").setMaxDamage(DamageHandler.emerald_hoe);
		}
		if (ConfigHandler.emerald_sword){
			emerald_sword = new EmeraldSword(MaterialHandler.EMERALD).setUnlocalizedName("emerald_sword").setMaxDamage(DamageHandler.emerald_sword);
		}
		// Obsidian
		if (ConfigHandler.obsidian_axe){
		    obsidian_axe = new ObsidianAxe(MaterialHandler.OBSIDIAN, 9.0F, -1.2F).setUnlocalizedName("obsidian_axe").setMaxDamage(DamageHandler.obsidian_axe);
		}
		if (ConfigHandler.obsidian_pickaxe){
			obsidian_pickaxe = new ObsidianPickaxe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_pickaxe").setMaxDamage(DamageHandler.obsidian_pickaxe);
		}
		if (ConfigHandler.obsidian_spade){
			obsidian_spade = new ObsidianSpade(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_spade").setMaxDamage(DamageHandler.obsidian_spade);
		}
		if (ConfigHandler.obsidian_hoe){
			obsidian_hoe = new ObsidianHoe(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_hoe").setMaxDamage(DamageHandler.obsidian_hoe);
		}
		if (ConfigHandler.obsidian_sword){
			obsidian_sword = new ObsidianSword(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_sword").setMaxDamage(DamageHandler.obsidian_sword);
		}
		// Multi
		if (ConfigHandler.wooden_multi){
			wooden_multi = new MultiMain(MaterialHandler.PWOOD).setUnlocalizedName("wooden_multi").setMaxDamage(DamageHandler.wooden_multi);
		}
		if (ConfigHandler.flint_multi){
			flint_multi = new FlintMulti(MaterialHandler.PFLINT).setUnlocalizedName("flint_multi").setMaxDamage(DamageHandler.flint_multi);
		}
		if (ConfigHandler.stone_multi){
			stone_multi = new MultiMain(MaterialHandler.PSTONE).setUnlocalizedName("stone_multi").setMaxDamage(DamageHandler.stone_multi);
		}
		if (ConfigHandler.golden_multi){
			golden_multi = new MultiMain(MaterialHandler.PGOLD).setUnlocalizedName("golden_multi").setMaxDamage(DamageHandler.golden_multi);
		}
		if (ConfigHandler.iron_multi){
			iron_multi = new MultiMain(MaterialHandler.PIRON).setUnlocalizedName("iron_multi").setMaxDamage(DamageHandler.iron_multi);
		}
		if (ConfigHandler.diamond_multi){
			diamond_multi = new MultiMain(MaterialHandler.PDIAMOND).setUnlocalizedName("diamond_multi").setMaxDamage(DamageHandler.diamond_multi);
		}
		if (ConfigHandler.emerald_multi){
			emerald_multi = new EmeraldMulti(MaterialHandler.PEMERALD).setUnlocalizedName("emerald_multi").setMaxDamage(DamageHandler.emerald_multi);
		}
		if (ConfigHandler.obsidian_multi){
			obsidian_multi = new ObsidianMulti(MaterialHandler.POBSIDIAN).setUnlocalizedName("obsidian_multi").setMaxDamage(DamageHandler.obsidian_multi);
		}
		// Battle
		if (ConfigHandler.wooden_battle){
			wooden_battle = new BattleMain(ToolMaterial.WOOD, 6.0F, -1.2F).setUnlocalizedName("wooden_battle").setMaxDamage(DamageHandler.wooden_battle);
		}
		if (ConfigHandler.stone_battle){
			stone_battle = new BattleMain(ToolMaterial.STONE, 8.0F, -1.2F).setUnlocalizedName("stone_battle").setMaxDamage(DamageHandler.stone_battle);
		}
		if (ConfigHandler.golden_battle){
			golden_battle = new BattleMain(ToolMaterial.GOLD, 6.0F, -1.2F).setUnlocalizedName("golden_battle").setMaxDamage(DamageHandler.golden_battle);
		}
		if (ConfigHandler.iron_battle){
			iron_battle = new BattleMain(ToolMaterial.IRON, 8.0F, -1.2F).setUnlocalizedName("iron_battle").setMaxDamage(DamageHandler.iron_battle);
		}
		if (ConfigHandler.diamond_battle){
			diamond_battle = new BattleMain(ToolMaterial.DIAMOND, 8.0F, -1.2F).setUnlocalizedName("diamond_battle").setMaxDamage(DamageHandler.diamond_battle);
		}
		if (ConfigHandler.emerald_battle){
			emerald_battle = new EmeraldBattle(MaterialHandler.EMERALD, 10.0F, -1.2F).setUnlocalizedName("emerald_battle").setMaxDamage(DamageHandler.emerald_battle);
		}
		if (ConfigHandler.obsidian_battle){
			obsidian_battle = new ObsidianBattle(MaterialHandler.OBSIDIAN, 9.0F, -1.2F).setUnlocalizedName("obsidian_battle").setMaxDamage(DamageHandler.obsidian_battle);
		}
		// Spear
		if (ConfigHandler.wooden_spear){
			wooden_spear = new SpearMain(ToolMaterial.WOOD).setUnlocalizedName("wooden_spear").setMaxDamage(DamageHandler.wooden_spear);
		}
		if (ConfigHandler.stone_spear){
			stone_spear = new SpearMain(ToolMaterial.STONE).setUnlocalizedName("stone_spear").setMaxDamage(DamageHandler.stone_spear);
		}
		if (ConfigHandler.golden_spear){
			golden_spear = new SpearMain(ToolMaterial.GOLD).setUnlocalizedName("golden_spear").setMaxDamage(DamageHandler.golden_spear);
		}
		if (ConfigHandler.iron_spear){
			iron_spear = new SpearMain(ToolMaterial.IRON).setUnlocalizedName("iron_spear").setMaxDamage(DamageHandler.iron_spear);
		}
		if (ConfigHandler.diamond_spear){
			diamond_spear = new SpearMain(ToolMaterial.DIAMOND).setUnlocalizedName("diamond_spear").setMaxDamage(DamageHandler.diamond_spear);
		}
		if (ConfigHandler.emerald_spear){
			emerald_spear = new EmeraldSpear(MaterialHandler.EMERALD).setUnlocalizedName("emerald_spear").setMaxDamage(DamageHandler.emerald_spear);
		}
		if (ConfigHandler.obsidian_spear){
			obsidian_spear = new ObsidianSpear(MaterialHandler.OBSIDIAN).setUnlocalizedName("obsidian_spear").setMaxDamage(DamageHandler.obsidian_spear);
		}
	}
}
