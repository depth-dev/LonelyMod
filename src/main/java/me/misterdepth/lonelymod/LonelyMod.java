package me.misterdepth.lonelymod;

import me.misterdepth.lonelymod.commands.LonelyCommand;
import net.minecraft.init.Blocks;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "lonelymod", version = "1.0", acceptedMinecraftVersions = "[1.8.9]", clientSideOnly = true)
public class LonelyMod
{
    public static final String MODID = "lonelymod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ClientCommandHandler.instance.registerCommand(new LonelyCommand());
    }
}
