package net.tearpelato.falldrop_backport.init;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityDataRegistry;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.world.item.DyeColor;
import net.tearpelato.falldrop_backport.Constants;

public class ModEntityDataSerializer {


    public static final EntityDataSerializer<DyeColor> DYE_COLOR =
            EntityDataSerializer.forValueType(DyeColor.STREAM_CODEC);



    public static void init() {
        FabricEntityDataRegistry.register(Constants.vanilla("dye_color"),DYE_COLOR);
        Constants.LOGGER.info("Registering Mod Entity Datas for " + Constants.MOD_ID);
    }


}
