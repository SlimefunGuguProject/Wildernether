package me.schntgaispock.wildernether.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.schntgaispock.wildernether.util.ItemUtil;
import me.schntgaispock.wildernether.util.Theme;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class WildernetherStacks {

    // Guide Use Only
    public static final CustomItemStack GUIDE_WILDERNETHER, GUIDE_MATERIALS, GUIDE_PLANTS, GUIDE_CUISINE, 
        GUIDE_TOOLS, GUIDE_BREWS, GUIDE_RECIPE_HOGLIN_BOUILLON;
    
    public static final CustomItemStack RECIPE_BREAK_NETHER_PLANTS, RECIPE_BLACKSTONE_STOVE_OVEN,
        RECIPE_BLACKSTONE_STOVE_FRYING, RECIPE_BLACKSTONE_STOVE_POT, RECIPE_BLACKSTONE_STOVE_BREWING,
        RECIPE_KILL_MOB, RECIPE_HOGLIN;

    // Utility
    public static final ItemStack WATER_BOTTLE;

    // Materials
    public static final SlimefunItemStack CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;
    public static final SlimefunItemStack FUNGAL_IRON_SCRAP, FUNGAL_GOLD_SCRAP;

    // Tools
    public static final SlimefunItemStack BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER, BLACKSTONE_STOVE;

    // Common
    public static final SlimefunItemStack WARPED_CACTUS, BLAZESPROUT, NETHER_TUBERS, CRYSTAL_MUSHROOM,
        SHROOMLIGHT_SPORES, WARPED_ROSE, RED_CARROT;
    // Uncommon
    public static final SlimefunItemStack CRIMSON_DREADLOCKS, TWISTED_BEAN_SPROUT, RED_SPIDER_LILY, WARPED_LOTUS;
    // Rare
    public static final SlimefunItemStack SMOLDERING_HERBS, IMMOLATED_VINES, OCTARINE_NETHERCAP, EMERALD_FIREBLOOM;
    // Secret
    public static final SlimefunItemStack GARDEN_OF_THE_LOST_SOUL, TULIP_OF_PARTINGS, BLOOM_OF_UNHEARD_CRIES,
    BLOSSOM_OF_SOLITUDE, LAMENT_OF_THE_DAMNED;

    // Ingredients
    public static final SlimefunItemStack HOGLIN_SPARE_RIB, HOGLIN_BELLY, HOGLIN_TROTTERS, HOGLIN_BOUILLON, CACTUS_JUICE;
    // Crafted
    public static final SlimefunItemStack WARPED_SALAD, MUSHROOM_SLICES;
    // Oven
    public static final SlimefunItemStack BAKED_NETHER_TUBERS, GLOWING_BEANS;
    // Frying
    public static final SlimefunItemStack NETHER_CHIPS, FRIED_WARPED_FUNGUS, FRIED_CRIMSON_FUNGUS, SPICY_FRIED_LOTUS;
    // Pot
    public static final SlimefunItemStack CRIMSON_STEW, WARPED_STEW, NETHER_HOTPOT, PORK_BONE_SOUP,
        BOILED_NETHER_TUBERS, BOILED_WARPED_CACTUS;
    // Brews
    public static final SlimefunItemStack BREW_OF_FIRE_WARDING, BREW_OF_FARSIGHT, BREW_OF_CELERITY;

    static {
        // ---------- Guide Items ----------
        GUIDE_WILDERNETHER = new CustomItemStack(
            Material.WARPED_ROOTS,
            Theme.WARPED.getColor() + "迷狱生机"
        );

        GUIDE_MATERIALS = new CustomItemStack(
            Material.MAGMA_CREAM,
            Theme.CRIMSON.getColor() + "材料"
        );

        GUIDE_TOOLS = new CustomItemStack(
            Material.STONE_HOE,
            Theme.BLACKSTONE.getColor() + "工具"
        );

        GUIDE_PLANTS = new CustomItemStack(
            Material.NETHER_SPROUTS,
            Theme.WARPED.getColor() + "植物"
        );
        
        GUIDE_CUISINE = new CustomItemStack(
            Material.COOKED_PORKCHOP,
            Theme.CUISINE.getColor() + "烹饪"
        );
        
        GUIDE_BREWS = new CustomItemStack(
            Material.GLASS_BOTTLE,
            Theme.BREW.getColor() + "酿造"
        );

        GUIDE_RECIPE_HOGLIN_BOUILLON = new CustomItemStack(
            Material.PORKCHOP,
            Theme.CUISINE.getColor() + "任意疣猪兽的肉"
        );

        RECIPE_BREAK_NETHER_PLANTS = new CustomItemStack(
            Material.NETHER_SPROUTS,
            "&b收割下界植物",
            "&7此资源通过大钐镰收割下界植物获取",
            "&7有效植物为:",
            "&7下界苗、诡异菌索、绯红菌索、",
            "&7诡异菌、绯红菌、缠怨藤",
            "&7垂泪藤、菌光体"
        );

        RECIPE_BLACKSTONE_STOVE_OVEN = new CustomItemStack(
            Material.BLAST_FURNACE,
            "&b黑石炉(烤箱)",            
            "&7该配方是通过黑石炉的烤箱模式制作的",
            "&7这是默认设置"
        );

        RECIPE_BLACKSTONE_STOVE_FRYING = new CustomItemStack(
            Material.BLAST_FURNACE,
            "&b黑石炉(油炸)",
            "&7该配方是通过黑石炉的油炸模式制作的",
            "&7在炉子上放置一个重制侧重压力板",
            "&7例如:铁制压力板",
            "&7来启用这个模式"
        );

        RECIPE_BLACKSTONE_STOVE_POT = new CustomItemStack(
            Material.BLAST_FURNACE,
            "&b黑石炉(蒸锅)",
            "&7该配方是通过黑石炉的蒸锅模式制作的",
            "&7在炉子上放置一个炼药锅",
            "&7来启用这个模式"
        );

        RECIPE_BLACKSTONE_STOVE_BREWING = new CustomItemStack(
            Material.BLAST_FURNACE,
            "&b黑石炉(酿造)",
            "&7该配方是通过黑石炉的酿造模式制作的",
            "&7在炉子上放置一个轻制侧重压力板",
            "&7例如:金制压力板",
            "&7来启用这个模式",
            "&7水瓶可以用仙人掌汁代替"
        );

        RECIPE_KILL_MOB = new CustomItemStack(
            Material.GOLDEN_SWORD,
            "&b狩猎",
            "&7该物品通过杀死指定生物获得"
        );

        RECIPE_HOGLIN = new CustomItemStack(
            Material.HOGLIN_SPAWN_EGG,
            "&f疣猪兽"
        );

        WATER_BOTTLE = ItemUtil.getWaterBottle();

        // ---------- Materials ----------
        CRIMSON_FRAME = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "CRIMSON_FRAME",
            Material.CRIMSON_FENCE_GATE,
            "&4绯红框架",
            "",
            "&7由一种大型绯红菌的茎",
            "&7制成的结实的框架"
        );
        
        WARPED_FRAME = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_FRAME",
            Material.WARPED_FENCE_GATE,
            "&2诡异框架",
            "",
            "&7由一种大型的诡异菌的茎",
            "&7制成的结实的框架"
        );

        SOUL_STONE = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "SOUL_STONE",
            Material.LODESTONE,
            Theme.SOUL.getColor() + "灵魂之石",
            "",
            "&7你可以听见他们",
            "&7在深渊中怒吼"
        );

        FUNGAL_IRON_SCRAP = ItemUtil.formattedSlimefunItemStack(
            Theme.NEUTRAL,
            "FUNGAL_IRON_SCRAP",
            Material.IRON_NUGGET,
            Theme.NEUTRAL.getColor() + "真菌铁屑",
            "",
            "&7一小块杂草丛生的废铁",
            "",
            "&7&o可在原版工作台中使用"
        );

        FUNGAL_GOLD_SCRAP = ItemUtil.formattedSlimefunItemStack(
            Theme.NEUTRAL,
            "FUNGAL_GOLD_SCRAP",
            Material.GOLD_NUGGET,
            Theme.NEUTRAL.getColor() + "真菌金屑",
            "",
            "一小块杂草丛生的黄金",
            "",
            "&7&o可在原版工作台中使用"
        );
        
        // ---------- Tools ----------
        BLACKSTONE_SCYTHE = ItemUtil.formattedSlimefunItemStack(
            Theme.BLACKSTONE,
            "BLACKSTONE_SCYTHE",
            Material.STONE_HOE,
            Theme.BLACKSTONE.getColor() + "黑石大钐镰",
            "",
            "&7它那锋利的刀刃",
            "&7非常适合切割",
            "&7生长于下界的植物"
        );
        
        SOUL_SCYTHE = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "SOUL_SCYTHE",
            Material.NETHERITE_HOE,
            Theme.SOUL.getColor() + "灵魂大钐镰",
            "",
            "&7它的刀刃颤动着",
            "&7如果你用此钐镰来收割下界植物",
            "&7你将会发现一些",
            "&7神秘的植物!"
        );

        NETHER_COMPOSTER = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "NETHER_COMPOSTER",
            Material.COMPOSTER,
            "&6下界堆肥机",
            "",
            "&7由下界真菌制成",
            "&7适宜分解最坚硬的植物"
        );

        BLACKSTONE_STOVE = ItemUtil.formattedSlimefunItemStack(
            Theme.BLACKSTONE,
            "BLACKSTONE_STOVE",
            Material.BLAST_FURNACE,
            Theme.BLACKSTONE.getColor() + "黑石炉",
            "",
            "由下界岩石打造",
            "可源源不断提供燃料!"
        );

        // ---------- Plants ----------
        WARPED_CACTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_CACTUS",
            Material.CACTUS,
            "&a诡异仙人掌",
            "",
            "&7一种微小且诡异的仙人掌",
            "&7由诡异菌的菌丝生长而成",
            "&7小心不要踩到它!"
        );

        BLAZESPROUT = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "BLAZESPROUT",
            Material.RED_DYE,
            "&4烈焰芽",
            "",
            "",
            "&7它长期生长在烈焰人的旁边",
            "&7以烈焰人身上的烈焰粉为肥料",
            "&7借此生长出了一个炽热的水泡",
            "",
            "&7&o可用于下界堆肥机"
        );

        NETHER_TUBERS = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "NETHER_TUBERS",
            Material.POTATO,
            "&d下界块茎",
            "",
            "&7这其实是一种土豆"
        );

        CRYSTAL_MUSHROOM = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "CRYSTAL_MUSHROOM",
            Material.RED_MUSHROOM,
            "&c水晶蘑菇",
            "",
            "&7这种蘑菇生长在下界石英簇之中",
            "&7受周围环境影响",
            "&7其顶部也生长出了一块块石英晶体"
        );

        SHROOMLIGHT_SPORES = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "SHROOMLIGHT_SPORES",
            Material.PUMPKIN_SEEDS,
            "&6蘑菇孢子",
            "",
            "&7这些孢子看起来并不发光",
            "&7也没有类似于其他蘑菇一样的球茎"
        );

        WARPED_ROSE = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_ROSE",
            Material.WITHER_ROSE,
            "&9诡异玫瑰",
            "",
            "&7这朵玫瑰的刺比它的叶子都大"
        );

        RED_CARROT = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "RED_CARROT",
            Material.CARROT,
            "&4绯红胡萝卜",
            "",
            "&7它似乎冒着岩浆"
        );

        // Uncommon
        CRIMSON_DREADLOCKS = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "CRIMSON_DREADLOCKS",
            Material.WEEPING_VINES,
            "&2诡异长发绺",
            "",
            "&7它的每一个根茎",
            "&7长得同你手臂一样粗..."
        );

        TWISTED_BEAN_SPROUT = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "TWISTED_BEAN_SPROUT",
            Material.TWISTING_VINES,
            "&a绞豆芽",
            "",
            "&7一种高纤维的来源!"
        );

        RED_SPIDER_LILY = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON,
            "RED_SPIDER_LILY",
            Material.POPPY,
            "&c红蜘蛛百合",
            "",
            "&7它那卷曲的花瓣似乎想要吞噬你"
        );

        WARPED_LOTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED,
            "WARPED_LOTUS",
            Material.SPORE_BLOSSOM,
            "&d诡异莲花",
            "",
            "&7它们通常不是生长在水上吗?"
        );

        // Rare
        SMOLDERING_HERBS = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON_DARK,
            "SMOLDERING_HERBS",
            Material.FERN,
            "&6闷烧草药",
            "",
            "&7它们实际上不会燃烧"
        );

        IMMOLATED_VINES = ItemUtil.formattedSlimefunItemStack(
            Theme.CRIMSON_DARK,
            "IMMOLATED_VINES",
            Material.WEEPING_VINES,
            "&c烈火藤蔓",
            "",
            "&7它的根茎上溢满了火焰",
            "&7如图跳动的心脏一般"
        );

        OCTARINE_NETHERCAP = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED_DARK,
            "OCTARINE_NETHERCAP",
            Material.WARPED_FUNGUS,
            "&5八氢萘帽",
            "",
            "&7它散发出淡淡的暗紫色荧光"
        );

        EMERALD_FIREBLOOM = ItemUtil.formattedSlimefunItemStack(
            Theme.WARPED_DARK,
            "EMERALD_FIREBLOOM",
            Material.FERN,
            "&a翡翠火焰织茎",
            "",
            "&7它的花瓣如火焰一般舞动"
        );
        

        // Secret
        GARDEN_OF_THE_LOST_SOUL = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "GARDEN_OF_THE_LOST_SOUL",
            Material.GRASS,
            "&b失落的灵魂花园",
            "&7章节 1",
            "",
            "&7这是被困在下界的冒险者唯一的避难所",
            "&7他们用和平世界的植物", 
            "&7栽培这个花园",
            "&7并逃避到短暂的梦境之中"
        );

        TULIP_OF_PARTINGS = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "TULIP_OF_PARTINGS",
            Material.WHITE_TULIP,
            "&e离别的郁金香",
            "&7章节 2",
            "",
            "&7他心中的绿洲",
            "&7被下界的野风吹散",
            "&7他的口袋里仅剩下",
            "&7一朵残弱的郁金香",
            "&7这是他来自那个世界的唯一纪念"
        );

        BLOOM_OF_UNHEARD_CRIES = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "BLOOM_OF_UNHEARD_CRIES",
            Material.FLOWERING_AZALEA,
            "&9下界的痛哭",
            "&7章回 3",
            "",
            "&7他的避难所消失了", 
            "&7每一朵花都被特殊的环境扭曲",
            "&7出自于内心的恐惧",
            "&7他决定寻找回家的路",
            "&7唉，",
            "&7他的喊声只能传到那盛气凌人的天空",
            "&7以及拖着他脚步的棕色沙子"
        );

        BLOSSOM_OF_SOLITUDE = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "BLOSSOM_OF_SOLITUDE",
            Material.CRIMSON_FUNGUS,
            "&6孤独之花",
            "&7章回 4",
            "",
            "&7走了几天后,",
            "&7这位冒险家再也走不动了",
            "&7他瘫倒在坚硬的岩石上",
            "&7猩红的鲜血从溃烂的伤口中流出",
            "&7他无法感受到刺痛刮擦般的痒",
            "&7也无法感受到空腹的痛苦。"
        );

        LAMENT_OF_THE_DAMNED = ItemUtil.formattedSlimefunItemStack(
            Theme.SOUL,
            "LAMENT_OF_THE_DAMNED",
            Material.WEEPING_VINES,
            "&8被诅咒者的哀歌",
            "&7章回 5",
            "",
            "&7曾经炽热的硫磺",
            "&7使这片土地变得杂草丛生",
            "&7扭曲的植物随风飞舞",
            "&7并随着时间的推移而变异",
            "&7然而他的灵魂再也无法得到安慰",
            "&7因为他被永远地诅咒在这个未知的土地上"
        );

        
        // ---------- Cuisine ----------

        // Ingredients
        HOGLIN_SPARE_RIB = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_SPARE_RIB",
            Material.BEEF,
            "&6疣猪兽排",
            "",
            "疣猪兽上的一块鲜美的肋骨"
        );
        
        HOGLIN_BELLY = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_BELLY",
            Material.PORKCHOP,
            "&c疣猪兽肚",
            "",
            "&7肥瘦相间，流满了汁水"
        );
        
        HOGLIN_TROTTERS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_TROTTERS",
            Material.RABBIT_FOOT,
            "&e疣猪兽蹄",
            "",
            "&7记得配上黄豆"
        );

        HOGLIN_BOUILLON = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "HOGLIN_BOUILLON",
            Material.WATER_BUCKET,
            "&a疣猪兽汤",
            "",
            "&7煨制的美味肉汤"
        );

        BOILED_WARPED_CACTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "BOILED_WARPED_CACTUS",
            Material.GREEN_DYE,
            "&a煨制仙人掌",
            "",
            "&7你可以食用仙人掌了?",
            "",
            LoreBuilder.hunger(1)
        );

        CACTUS_JUICE = ItemUtil.modifyWaterBottle(
            ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
                "CACTUS_JUICE",
                Material.POTION,
                "&a仙人掌汁",
                "",
                "&7一个普通的水瓶",
                "&7散发着淡淡的硫磺和仙人掌的味道"
            ),
            Color.fromRGB(0x7c, 0xd3, 0x9c)
        );

        // Crafted
        WARPED_SALAD = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "WARPED_SALAD",
            Material.GREEN_DYE,
            "&a诡异沙拉",
            "",
            "&7沙拉是绿色的，所以可以吃",
            "",
            LoreBuilder.hunger(4)
        );

        MUSHROOM_SLICES = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "MUSHROOM_SLICES",
            Material.BEETROOT_SEEDS,
            "&e蘑菇片",
            "",
            "&7至少看上去不错...",
            "",
            LoreBuilder.hunger(3)
        );

        BAKED_NETHER_TUBERS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "BAKED_NETHER_TUBERS",
            Material.BAKED_POTATO,
            "&b烤下界块茎",
            "",
            "&7闻着很香",
            "",
            LoreBuilder.hunger(3)
        );

        GLOWING_BEANS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "GLOWING_BEANS",
            Material.GLOW_BERRIES,
            "&e荧光豆",
            "",
            "&7看起来烹饪激发了",
            "&7孢子中的荧光元素",
            "",
            LoreBuilder.hunger(0.5)
        );

        // Frying
        NETHER_CHIPS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "NETHER_CHIPS",
            Material.BREAD,
            "&e下界薯片™",
            "",
            "&7千万别吃太多",
            "",
            LoreBuilder.hunger(1.5)
        );

        FRIED_WARPED_FUNGUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "FRIED_WARPED_FUNGUS",
            Material.WARPED_FUNGUS,
            "&a诡异菌干",
            "",
            "&7嘎嘣脆!",
            "",
            LoreBuilder.hunger(1)
        );

        FRIED_CRIMSON_FUNGUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "FRIED_CRIMSON_FUNGUS",
            Material.CRIMSON_FUNGUS,
            "&4绯红菌干",
            "",
            "&7嘎嘣脆!",
            "",
            LoreBuilder.hunger(1)
        );

        SPICY_FRIED_LOTUS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "SPICY_FRIED_LOTUS",
            Material.COOKIE,
            "&c辣炒荷花",
            "",
            "&7香甜可口且伴随着辣味!",
            "",
            LoreBuilder.hunger(3.5)
        );

        // Pot
        CRIMSON_STEW = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "CRIMSON_STEW",
            Material.BEETROOT_SOUP,
            "&4绯红炖肉",
            "",
            "&7厚厚的一丛真菌漂浮在顶部",
            "&7应该可以安全食用吧?",
            "",
            LoreBuilder.hunger(5)
        );

        WARPED_STEW = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "WARPED_STEW",
            Material.SUSPICIOUS_STEW,
            "&a诡异炖肉",
            "",
            "&7厚厚的一丛真菌漂浮在顶部",
            "&7应该可以安全食用吧?",
            "",
            LoreBuilder.hunger(5)
        );

        NETHER_HOTPOT = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "NETHER_HOTPOT",
            Material.RABBIT_STEW,
            "&c下界火锅",
            "",
            "&7小心烫!",
            "",
            LoreBuilder.hunger(6)
        );

        PORK_BONE_SOUP = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "PORK_BONE_SOUP",
            Material.MUSHROOM_STEW,
            "&e猪骨汤",
            "",
            "&7味道及其鲜美!",
            "",
            LoreBuilder.hunger(8.5)
        );

        BOILED_NETHER_TUBERS = ItemUtil.formattedSlimefunItemStack(
            Theme.CUISINE,
            "BOILED_NETHER_TUBERS",
            Material.POTATO,
            "&d下界香芋",
            "",
            "&7其实味道并不甜",
            "",
            LoreBuilder.hunger(3)
        );

        // ---------- Brews ----------
        BREW_OF_FIRE_WARDING = ItemUtil.modifyPotionStack(
            ItemUtil.formattedSlimefunItemStack(
                Theme.BREW,
                "BREW_OF_FIRE_WARDING",
                Material.POTION,
                "&6抗火魔爪"
            ),
            Color.fromRGB(0xfc, 0x8d, 0x0f),
            new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 300*20, 0)
        );

        BREW_OF_FARSIGHT = ItemUtil.modifyPotionStack(
            ItemUtil.formattedSlimefunItemStack(
                Theme.BREW,
                "BREW_OF_FARSIGHT",
                Material.POTION,
                "&b夜视红牛"
            ),
            Color.fromRGB(0x0f, 0x7d, 0xfc),
            new PotionEffect(PotionEffectType.NIGHT_VISION, 300*20, 0)
        );

        BREW_OF_CELERITY = ItemUtil.modifyPotionStack(
            ItemUtil.formattedSlimefunItemStack(
                Theme.BREW,
                "BREW_OF_CELERITY",
                Material.POTION,
                "&4下界特饮"
            ),
            Color.fromRGB(0xfc, 0xf4, 0xfa),
            new PotionEffect(PotionEffectType.FAST_DIGGING, 10*20, 1),
            new PotionEffect(PotionEffectType.SPEED, 10*20, 1),
            new PotionEffect(PotionEffectType.JUMP, 10*20, 0),
            new PotionEffect(PotionEffectType.CONFUSION, 10*20, 0)
        );
       
    }
}
