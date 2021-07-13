package me.ctidy.minecraft.mod.forge.demo;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(CtidyDemo.MODID)
public class CtidyDemo {

    public static final String MODID = "ctidydemo";
    public static final Logger LOGGER = LogManager.getLogger();

    public CtidyDemo() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM PRE-INIT");
    }

//    private void clientSetup(final FMLClientSetupEvent event) {
//        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().options);
//    }

//    private void enqueueIMC(final InterModEnqueueEvent event) {
//        InterModComms.sendTo(MODID, "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
//    }

//    private void processIMC(final InterModProcessEvent event) {
//        LOGGER.info("Got IMC {}", event.getIMCStream().
//                map(m->m.getMessageSupplier().get()).
//                collect(Collectors.toList()));
//    }

}
