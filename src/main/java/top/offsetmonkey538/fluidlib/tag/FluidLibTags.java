package top.offsetmonkey538.fluidlib.tag;

import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

import static top.offsetmonkey538.fluidlib.FluidLib.id;

/**
 * Stores all the tags used for the mod.
 */
public final class FluidLibTags {
    private FluidLibTags() {

    }

    /**
     * Add your fluid to this tag to make concrete powder turn into concrete when touching your fluid.
     */
    public static final TagKey<Fluid> HARDENS_CONCRETE = TagKey.of(RegistryKeys.FLUID, id("hardens_concrete"));

    /**
     * Add your fluid to this tag to make coral not die while touching your fluid.
     */
    public static final TagKey<Fluid> KEEPS_CORAL_ALIVE = TagKey.of(RegistryKeys.FLUID, id("keeps_coral_alive"));

    /**
     * Add your fluid to this tag to make farmland not dry while touching your fluid.
     */
    public static final TagKey<Fluid> WATERS_FARMLAND = TagKey.of(RegistryKeys.FLUID, id("waters_farmland"));

    /**
     * Add your fluid to this tag to make respawn anchor explosions not break blocks when touching your fluid.
     */
    public static final TagKey<Fluid> DISABLES_RESPAWN_ANCHOR_EXPLOSION = TagKey.of(RegistryKeys.FLUID, id("disables_respawn_anchor_explosion"));

    /**
     * Add your fluid to this tag to make sponges absorb your fluid.
     */
    public static final TagKey<Fluid> ABSORBED_BY_SPONGE = TagKey.of(RegistryKeys.FLUID, id("absorbed_by_sponge"));

    /**
     * Add your fluid to this tag to make {@link net.minecraft.block.SpreadableBlock spreadable blocks} (grass, mycelium) not able to spread while your fluid is above them.
     */
    public static final TagKey<Fluid> DISABLES_SPREADING = TagKey.of(RegistryKeys.FLUID, id("disables_spreading"));

    /**
     * Add your fluid to this tag to make boats able work in your fluid.
     */
    public static final TagKey<Fluid> ALLOWS_BOATS = TagKey.of(RegistryKeys.FLUID, id("allows_boats"));

    /**
     * Add your fluid to this tag to make entities drown while in your fluid.
     */
    public static final TagKey<Fluid> ALLOWS_DROWNING = TagKey.of(RegistryKeys.FLUID, id("allows_drowning"));
}
