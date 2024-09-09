package net.sen.sens_scifi_stuff.entities;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.sens_scifi_stuff.SensScifiStuff;
import net.sen.sens_scifi_stuff.utils.ModUtils;

import java.util.function.Supplier;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(Registries.ENTITY_TYPE, ModUtils.getModId());
    private static final DeferredRegister.Items SPAWN_EGGS = DeferredRegister.createItems(ModUtils.getModId());

    public static final Supplier<EntityType<SpeederEntity>> SPEEDER_ENTITY = createEntityType("speeder_entity", SpeederEntity::new, MobCategory.MISC, 2f, 1f);

    private static <E extends Entity> Supplier<EntityType<E>> createEntityType(String name, EntityType.EntityFactory<E> factory, MobCategory category, float width, float height) {
        return ENTITIES.register(name, () -> EntityType.Builder.<E>of(factory, category).sized(width, height).build(name));
    }

//    private static <E extends Entity> Supplier<EntityType<E>> createEntityType(String name, EntityType.EntityFactory<E> factory, MobCategory category, float width, float height, int primaryColour, int secondaryColour) {
//        Supplier<EntityType<E>> entityType = ENTITIES.register(name, () -> EntityType.Builder.<E>of(factory, category).sized(width, height).build(name));
//        createSpawnEgg(entityType, primaryColour, secondaryColour);
//        return entityType;
//    }
//
//    private static <E extends Entity>  Supplier<Item> createSpawnEgg(Supplier<? extends EntityType<? extends Mob>> entityType, int primaryColour, int secondaryColour) {
//        return SPAWN_EGGS.register(ModUtils.getEntityId(entityType.get()), () -> new DeferredSpawnEggItem(entityType, secondaryColour, primaryColour, new Item.Properties()));
//    }

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
        SPAWN_EGGS.register(eventBus);
    }
}
