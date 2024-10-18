package net.maketendo.forgedreactor.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.maketendo.forgedreactor.init.ForgedReactorModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CleanArmorProtProcedure {
	@SubscribeEvent
	public static void onRightClickEntity(PlayerInteractEvent.EntityInteractSpecific event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getTarget(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.HONEYCOMB && entity instanceof ArmorStand) {
			if (event != null && event.isCancelable()) {
				event.setCanceled(true);
			} else if (event != null && event.hasResult()) {
				event.setResult(Event.Result.DENY);
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_2_IRON_ARMOR_BOOTS.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY() + 0.2, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY() + 0.2), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WAX_ON, (entity.getX()), (entity.getY() + 0.2), (entity.getZ()), 5, 0.1, 0.1, 0.1, 1);
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrCreateTag().putBoolean("Waxed", true);
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_2_IRON_ARMOR_LEGGINGS.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY() + 0.4, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY() + 0.4), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WAX_ON, (entity.getX()), (entity.getY() + 0.4), (entity.getZ()), 5, 0.1, 0.1, 0.1, 1);
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getOrCreateTag().putBoolean("Waxed", true);
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_2_IRON_ARMOR_CHESTPLATE.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY() + 0.6, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY() + 0.6), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WAX_ON, (entity.getX()), (entity.getY() + 0.6), (entity.getZ()), 5, 0.1, 0.1, 0.1, 1);
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getOrCreateTag().putBoolean("Waxed", true);
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
			}
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == ForgedReactorModItems.MK_2_IRON_ARMOR_HELMET.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY() + 0.9, entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1);
					} else {
						_level.playLocalSound((entity.getX()), (entity.getY() + 0.9), (entity.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.honeycomb.wax_on")), SoundSource.BLOCKS, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.WAX_ON, (entity.getX()), (entity.getY() + 0.9), (entity.getZ()), 5, 0.1, 0.1, 0.1, 1);
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getOrCreateTag().putBoolean("Waxed", true);
				if (event != null && event.isCancelable()) {
					event.setCanceled(true);
				} else if (event != null && event.hasResult()) {
					event.setResult(Event.Result.DENY);
				}
			}
		}
	}
}
