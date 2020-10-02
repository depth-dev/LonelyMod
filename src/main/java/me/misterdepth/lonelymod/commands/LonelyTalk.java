package me.misterdepth.lonelymod.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class LonelyTalk extends CommandBase {
    @Override
    public String getCommandName() {
        return "lonely";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        String[] messages = new String[]{
                "§b[LonelyMod] §fHi! How are you?",
                "§b[LonelyMod] §fIt's really nice to smile. Try it out!",
                "§b[LonelyMod] §fYou and me should hang out more often!",
                "§b[LonelyMod] §fI love pizza. What's your favourite food?",
                "§b[LonelyMod] §fDo you speak any other languages? I understand Java!",
                "§b[LonelyMod] §fDo you play on Hypixel?",
                "§b[LonelyMod] §fI love §cM§6i§en§ae§bc§3r§9a§df§5t§f!",
                "§b[LonelyMod] §fI was created by misterdepth!",
                "§b[LonelyMod] §fDebuggings is a Pepega.",
                "§b[LonelyMod] §fI have 99 diamonds, fight me!"

        };
        int chosenMessage = (int) Math.floor(Math.random()*messages.length);

        Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
        sender.addChatMessage(new ChatComponentText(messages[chosenMessage]));
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
