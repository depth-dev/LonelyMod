package me.misterdepth.lonelymod.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class LonelyTopic extends CommandBase {
    @Override
    public String getCommandName() {
        return "topic";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        String[] topics = new String[]{
                "§b[LonelyMod] §fWhat's your favourite game other than Minecraft?",
                "§b[LonelyMod] §fAnything special coming up?",
                "§b[LonelyMod] §fWhat's your favourite color?",
                "§b[LonelyMod] §fWhat languages do you speak?",
                "§b[LonelyMod] §fDo you code? If so, in what language?",
                "§b[LonelyMod] §fAre you in the Room Where It Happens?", //Hamilton Reference go brrrr
                "§b[LonelyMod] §fDo you like cheese?",
                "§b[LonelyMod] §fWhat's your favourite weather?"
        };
        int thechosen = (int) Math.floor(Math.random()*topics.length);
        Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
        sender.addChatMessage(new ChatComponentText(topics[thechosen]));
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
