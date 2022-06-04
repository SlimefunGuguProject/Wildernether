package me.schntgaispock.wildernether.slimefun;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.schntgaispock.wildernether.slimefun.util.Theme;
import org.bukkit.Material;

public class WildernetherStacks {

    public static final CustomItemStack GUIDE_WILDERNETHER, GUIDE_MATERIALS, GUIDE_PLANTS, GUIDE_CUISINE, 
        GUIDE_TOOLS, GUIDE_MACHINES;
    
    public static final CustomItemStack RECIPE_BREAK_NETHER_PLANTS;


    public static final SlimefunItemStack CRIMSON_FRAME, WARPED_FRAME, SOUL_STONE;

    public static final SlimefunItemStack BLACKSTONE_SCYTHE, SOUL_SCYTHE, NETHER_COMPOSTER;

    public static final SlimefunItemStack WARPED_CACTUS, BLAZESPROUT, NETHER_TUBERS, CRYSTAL_MUSHROOM,
        SHROOMLIGHT_SPORES, CRIMSON_DREADLOCKS, WARPED_ROSE, TWISTED_BEAN_SPROUT, RED_SPIDER_LILY, WARPED_LOTUS;
    public static final SlimefunItemStack GARDEN_OF_THE_LOST_SOUL, TULIP_OF_PARTINGS, BLOOM_OF_UNHEARD_CRIES,
    BLOSSOM_OF_SOLITUDE, LAMENT_OF_THE_DAMNED;

    static {
        GUIDE_WILDERNETHER = new CustomItemStack(
            Material.WARPED_ROOTS,
            Theme.CRIMSON.getColor() + "Wildernether"
        );

        GUIDE_MATERIALS = new CustomItemStack(
            Material.MAGMA_CREAM,
            Theme.LORE.getColor() + "Wildernether Materials"
        );

        GUIDE_TOOLS = new CustomItemStack(
            Material.NETHERITE_HOE,
            Theme.LORE.getColor() + "Wildernether Tools"
        );

        GUIDE_PLANTS = new CustomItemStack(
            Material.CRIMSON_FUNGUS,
            Theme.LORE.getColor() + "Nether Plants"
        );
        
        GUIDE_CUISINE = new CustomItemStack(
            Material.COOKED_PORKCHOP,
            Theme.LORE.getColor() + "Nether Cuisine"
        );

        GUIDE_MACHINES = new CustomItemStack(
            Material.CRIMSON_HYPHAE,
            Theme.LORE.getColor() + "Wildernether Machines"
        );

        RECIPE_BREAK_NETHER_PLANTS = new CustomItemStack(
            Material.NETHER_SPROUTS,
            Theme.LORE.getColor() + "Break Nether Plants",
            "",
            Theme.LORE.getColor() + "Wildernether plants are obtained by harvesting",
            Theme.LORE.getColor() + "(breaking) plants in the nether with a hoe or",
            Theme.LORE.getColor() + "scythe. The available plants are Nether Sprouts,",
            Theme.LORE.getColor() + "Warped Roots, Warped Fungus, Twisting Vines,",
            Theme.LORE.getColor() + "Crimson Root, Crimson Fungus, Weeping Vines,",
            Theme.LORE.getColor() + "and Shroomlight"
        );


        CRIMSON_FRAME = new SlimefunItemStack(
            "CRIMSON_FRAME",
            Material.CRIMSON_FENCE_GATE,
            Theme.CRIMSON.getColor() + "Crimson Frame",
            "",
            Theme.LORE.getColor() + "A sturdy frame made from the stem of",
            Theme.LORE.getColor() + "a large Crimson Fungus"
        );

        WARPED_FRAME = new SlimefunItemStack(
            "WARPED_FRAME",
            Material.WARPED_FENCE_GATE,
            Theme.WARPED.getColor() + "Warped Frame",
            "",
            Theme.LORE.getColor() + "A sturdy frame made from the stem of",
            Theme.LORE.getColor() + "a large Warped Fungus"
        );

        SOUL_STONE = new SlimefunItemStack(
            "SOUL_STONE",
            Material.LODESTONE,
            Theme.SOUL.getColor() + "Soul Stone",
            "",
            Theme.LORE.getColor() + "You can hear strange whisperings coming",
            Theme.LORE.getColor() + "from deep within"
        );
        
        BLACKSTONE_SCYTHE = new SlimefunItemStack(
            "BLACKSTONE_SCYTHE",
            Material.STONE_HOE,
            "&fBlackstone Scythe",
            "",
            Theme.LORE.getColor() + "Its extra-sharp blade makes it perfect",
            Theme.LORE.getColor() + "for cutting the tough plants that grow",
            Theme.LORE.getColor() + "in the nether"
        );
        
        SOUL_SCYTHE = new SlimefunItemStack(
            "SOUL_SCYTHE",
            Material.GOLDEN_HOE,
            Theme.SOUL.getColor() + "Soul Scythe",
            "",
            Theme.LORE.getColor() + "Its blade quivers with soft whispers.",
            Theme.LORE.getColor() + "If you use this to harvest plants in the",
            Theme.LORE.getColor() + "nether, you might discover plants with",
            Theme.LORE.getColor() + "secrets to tell!"
        );

        NETHER_COMPOSTER = new SlimefunItemStack(
            "NETHER_COMPOSTER",
            Material.COMPOSTER,
            Theme.CRIMSON.getColor() + "Nether Composter",
            "",
            Theme.LORE.getColor() + "Crafted with the wood of the underworld,",
            Theme.LORE.getColor() + "it is suitable for breaking down even",
            Theme.LORE.getColor() + "the hardiest of plants"
        );

        WARPED_CACTUS = new SlimefunItemStack(
            "WARPED_CACTUS",
            Material.CACTUS,
            Theme.WARPED.getColor() + "Warped Cactus",
            "",
            Theme.LORE.getColor() + "A tiny, twisted cactus growing from the",
            Theme.LORE.getColor() + "hypha of a warped fungus. Be careful not",
            Theme.LORE.getColor() + "to step on it!"
        );

        BLAZESPROUT = new SlimefunItemStack(
            "BLAZESPROUT",
            Material.RED_DYE,
            Theme.CRIMSON.getColor() + "Blazesprout",
            "",
            Theme.LORE.getColor() + "The hypha of a crimson fungus has",
            Theme.LORE.getColor() + "absorbed some powder from a blaze,",
            Theme.LORE.getColor() + "leading to the formation of a fiery",
            Theme.LORE.getColor() + "blister."
        );

        NETHER_TUBERS = new SlimefunItemStack(
            "NETHER_COMPOSTER",
            Material.POTATO,
            Theme.WARPED.getColor() + "Nether Tubers",
            "",
            Theme.LORE.getColor() + "It's just a potato."
        );

        CRYSTAL_MUSHROOM = new SlimefunItemStack(
            "CRYSTAL_MUSHROOM",
            Material.RED_MUSHROOM,
            Theme.CRIMSON.getColor() + "Crystal Mushroom",
            "",
            Theme.LORE.getColor() + "An excess of quartz in its surroundings",
            Theme.LORE.getColor() + "has given rise to this strange mushroom,",
            Theme.LORE.getColor() + "growing crystals of quartz in its cap"
        );

        SHROOMLIGHT_SPORES = new SlimefunItemStack(
            "SHROOMLIGHT_SPORES",
            Material.PUMPKIN_SEEDS,
            Theme.CRIMSON.getColor() + "Shroomlight Spores",
            "",
            Theme.LORE.getColor() + "These spores don't appear to glow, unlike",
            Theme.LORE.getColor() + "the bulbs that they dropped from."
        );

        CRIMSON_DREADLOCKS = new SlimefunItemStack(
            "CRIMSON_DREADLOCKS",
            Material.WEEPING_VINES,
            Theme.CRIMSON.getColor() + "Crimson Dreadlocks",
            "",
            Theme.LORE.getColor() + "Each one of these vines is as thick as",
            Theme.LORE.getColor() + "your arm..."
        );

        WARPED_ROSE = new SlimefunItemStack(
            "WARPED_ROSE",
            Material.WITHER_ROSE,
            Theme.WARPED.getColor() + "Warped Rose",
            "",
            Theme.LORE.getColor() + "This rose's thorns are bigger than its",
            Theme.LORE.getColor() + "leaves"
        );

        TWISTED_BEAN_SPROUT = new SlimefunItemStack(
            "TWISTED_BEAN_SPROUT",
            Material.TWISTING_VINES,
            Theme.WARPED.getColor() + "Twisted Bean Sprout",
            "",
            Theme.LORE.getColor() + "Each one of these vines is as thick as",
            Theme.LORE.getColor() + "your arm..."
        );

        RED_SPIDER_LILY = new SlimefunItemStack(
            "RED_SPIDER_LILY",
            Material.POPPY,
            Theme.CRIMSON.getColor() + "Red Spider Lily",
            "",
            Theme.LORE.getColor() + "Its curling petals seem to be grabbing",
            Theme.LORE.getColor() + "at you"
        );

        WARPED_LOTUS = new SlimefunItemStack(
            "WARPED_LOTUS",
            Material.SPORE_BLOSSOM,
            Theme.WARPED.getColor() + "Warped Lotus",
            "",
            Theme.LORE.getColor() + "Don't they normally grow on water?"
        );

        GARDEN_OF_THE_LOST_SOUL = new SlimefunItemStack(
            "GARDEN_OF_THE_LOST_SOUL",
            Material.GRASS,
            Theme.SOUL.getColor() + "Garden of the Lost Soul",
            "&7Chapter 1",
            "",
            Theme.LORE.getColor() + "The only thing in this blazing land",
            Theme.LORE.getColor() + "for the adventurer trapped in hell.",
            Theme.LORE.getColor() + "He cultivated this garden with the",
            Theme.LORE.getColor() + "flora of a peaceful world, in a futile",
            Theme.LORE.getColor() + "escapist dream"
        );

        TULIP_OF_PARTINGS = new SlimefunItemStack(
            "TULIP_OF_PARTINGS",
            Material.WHITE_TULIP,
            Theme.SOUL.getColor() + "Tulip of Partings",
            "&7Chapter 2",
            "",
            Theme.LORE.getColor() + "As the winds of the wastes scattered and",
            Theme.LORE.getColor() + "warped his oasis, the adventurer was left",
            Theme.LORE.getColor() + "with a single tulip, the only reminder of",
            Theme.LORE.getColor() + "the world from which he came, and the",
            Theme.LORE.getColor() + "home of his past"
        );

        BLOOM_OF_UNHEARD_CRIES = new SlimefunItemStack(
            "BLOOM_OF_UNHEARD_CRIES",
            Material.FLOWERING_AZALEA,
            Theme.SOUL.getColor() + "Bloom of Unheard Cries",
            "&7Chapter 3",
            "",
            Theme.LORE.getColor() + "The lost soul cried out into the crimson",
            Theme.LORE.getColor() + "cavern, with no response. Fearing his",
            Theme.LORE.getColor() + "final days were nearing, the adventurer",
            Theme.LORE.getColor() + "set out to find something to bring him",
            Theme.LORE.getColor() + "home. Alas, his shouts reached nothing",
            Theme.LORE.getColor() + "but the domineering netherrack sky, and",
            Theme.LORE.getColor() + "the sand dragging down his feet"
        );

        BLOSSOM_OF_SOLITUDE = new SlimefunItemStack(
            "BLOSSOM_OF_SOLITUDE",
            Material.CRIMSON_FUNGUS,
            Theme.SOUL.getColor() + "Blossom of Solitude",
            "&7Chapter 4",
            "",
            Theme.LORE.getColor() + "After days of walking, the adventurer",
            Theme.LORE.getColor() + "could move no longer. He collapsed on the",
            Theme.LORE.getColor() + "brown sand, crimson blood flowing from",
            Theme.LORE.getColor() + "festering wounds. No more did he feel the",
            Theme.LORE.getColor() + "itch of a stinging scrape, nor the aching",
            Theme.LORE.getColor() + "of an empty stomach. Just the certainty",
            Theme.LORE.getColor() + "and loneliness of his final moment"
        );

        LAMENT_OF_THE_DAMNED = new SlimefunItemStack(
            "LAMENT_OF_THE_DAMNED",
            Material.WEEPING_VINES,
            Theme.SOUL.getColor() + "Lament of the Damned",
            "&7Chapter 5",
            "",
            Theme.LORE.getColor() + "Once fiery brimstone, this land became",
            Theme.LORE.getColor() + "overgrown with the twisted forms of flora",
            Theme.LORE.getColor() + "carried on the wind, mutated by time.",
            Theme.LORE.getColor() + "However, no more could the adventurer be",
            Theme.LORE.getColor() + "soothed, for his soul was damned to this",
            Theme.LORE.getColor() + "strange land for the rest of eternity"
        );
    }
}