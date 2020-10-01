package me.misterdepth.lonelymod.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class LonelyCommand extends CommandBase {
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
        int chosenMessage = (int) Math.floor(Math.random()*10+1);

        if(args.length == 1) {
            switch (args[0].toLowerCase()) {

                case "help":
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    sender.addChatMessage(new ChatComponentText("§a/lonelymod §f- Talk with the mod!"));
                    sender.addChatMessage(new ChatComponentText("§a/lonelymod credits §f- Credits!"));
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    break;
                case "credits":
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    sender.addChatMessage(new ChatComponentText("§amisterdepth §f- Development"));
                    sender.addChatMessage(new ChatComponentText("§aDJtheRedstoner §f- MDK Assistance!"));
                    sender.addChatMessage(new ChatComponentText("§b§m-----------------------------------"));
                    break;
                case "kross":
                    sender.addChatMessage(new ChatComponentText("§bPrinceKross §fis amazing, go follow him!"));
                    break;
                default:

                    switch (chosenMessage) {
                        case 1:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fHi! How are you?"));
                            break;
                        case 2:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fIt's really nice to smile. Try it out!"));
                            break;
                        case 3:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fYou and me should hang out more often!"));
                            break;
                        case 4:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI love pizza. What's your favourite food?"));
                            break;
                        case 5:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fDo you speak any other languages? I understand Java!"));
                            break;
                        case 6:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fDo you play on Hypixel?"));
                            break;
                        case 7:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI love §cM§6i§en§ae§bc§3r§9a§df§5t§f!"));
                            break;
                        case 8:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI was created by misterdepth!"));
                            break;
                        case 9:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fDebuggings is a Pepega."));
                            break;
                        case 10:
                            Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                            sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI have 99 diamonds, fight me!"));
                            break;

                    }
                    break;
            }
        } else {
            switch (chosenMessage) {
                case 1:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fHi! How are you?"));
                    break;
                case 2:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fIt's really nice to smile. Try it out!"));
                    break;
                case 3:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fYou and me should hang out more often!"));
                    break;
                case 4:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI love pizza. What's your favourite food?"));
                    break;
                case 5:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fDo you speak any other languages? I understand Java!"));
                    break;
                case 6:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fDo you play on Hypixel?"));
                    break;
                case 7:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI love §cM§6i§en§ae§bc§3r§9a§df§5t§f!"));
                    break;
                case 8:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI was created by misterdepth!"));
                    break;
                case 9:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fDebuggings is a Pepega."));
                    break;
                case 10:
                    Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
                    sender.addChatMessage(new ChatComponentText("§b[LonelyMod] §fI have 99 diamonds, fight me!"));
                    break;

            }
        }

    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
