package net.tearpelato.falldrop_backport.mixin;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.tearpelato.falldrop_backport.block.custom.ShelfMushroomBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EntityMixin {
	@Shadow private Level level;
	@Shadow public abstract BlockPos getBlockPosBelowThatAffectsMyMovement();
	@Shadow public double fallDistance;

	@Inject(
	  method = "restituteMovementAfterCollisions",
	  at = @At(
	    value = "INVOKE",
	    target = "Lnet/minecraft/world/entity/Entity;gameEvent(Lnet/minecraft/core/Holder;)V"
	  )
	)
	public void restituteMovementAfterCollisions(
	  BlockState effectState, boolean xCollision, boolean zCollision, Vec3 movement, CallbackInfo ci
	) {
		if (effectState.getBlock() instanceof ShelfMushroomBlock) {
			((ShelfMushroomBlock) effectState.getBlock()).bounceOn(
			  this.level, effectState, this.getBlockPosBelowThatAffectsMyMovement(), (Entity) (Object) this,
			  this.fallDistance
			);
		}
	}
}
