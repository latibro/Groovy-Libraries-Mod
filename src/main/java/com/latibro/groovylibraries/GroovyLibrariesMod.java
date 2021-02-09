package com.latibro.groovylibraries;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = GroovyLibrariesMod.MODID, name = GroovyLibrariesMod.NAME, version = GroovyLibrariesMod.VERSION)
public class GroovyLibrariesMod {
    
    public static final String MODID = "groovy-libraries";
    public static final String NAME = "Groovy Libraries";
    public static final String VERSION = "3.0.7";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

}
