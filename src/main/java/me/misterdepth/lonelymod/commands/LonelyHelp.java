package me.misterdepth.lonelymod.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class LonelyHelp extends CommandBase {
    @Override
    public String getCommandName() {
        return "lonelymod";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {

        if(args.length == 1) {
            switch (args[0].toLowerCase()) {
                case "credits":
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    sender.addChatMessage(new ChatComponentText("§amisterdepth §f- Development"));
                    sender.addChatMessage(new ChatComponentText("§aDJtheRedstoner §f- MDK Assistance!"));
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    break;
                case "kross":
                    sender.addChatMessage(new ChatComponentText("§bPrinceKross §fis amazing, go follow him!"));
                    break;
                case "help":
                default:
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    sender.addChatMessage(new ChatComponentText("§a/lonely §f- Talk with the mod!"));
                    sender.addChatMessage(new ChatComponentText("§a/advice §f- Advice from the mod!"));
                    sender.addChatMessage(new ChatComponentText("§a/topic §f- Get a topic from the mod!"));
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    break;
            }
        } else {
            sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
            sender.addChatMessage(new ChatComponentText("§a/lonely §f- Talk with the mod!"));
            sender.addChatMessage(new ChatComponentText("§a/advice §f- Advice from the mod!"));
            sender.addChatMessage(new ChatComponentText("§a/topic §f- Get a topic from the mod!"));
            sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
        }

    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
