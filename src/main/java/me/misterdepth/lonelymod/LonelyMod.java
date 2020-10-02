package me.misterdepth.lonelymod;

import me.misterdepth.lonelymod.commands.LonelyAdvice;
import me.misterdepth.lonelymod.commands.LonelyHelp;
import me.misterdepth.lonelymod.commands.LonelyTalk;
import me.misterdepth.lonelymod.commands.LonelyTopic;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
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
        ClientCommandHandler.instance.registerCommand(new LonelyHelp());
        ClientCommandHandler.instance.registerCommand(new LonelyAdvice());
        ClientCommandHandler.instance.registerCommand(new LonelyTalk());
        ClientCommandHandler.instance.registerCommand(new LonelyTopic());
    }
}
