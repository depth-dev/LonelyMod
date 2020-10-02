package me.misterdepth.lonelymod.commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class LonelyAdvice extends CommandBase {


    @Override
    public String getCommandName() {
        return "advice";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return null;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        String[] adviceMessages = new String[]{
                "§b[LonelyMod] §fDo what your heart desires!",
                "§b[LonelyMod] §fI believe you will make the right choice.",
                "§b[LonelyMod] §fDon't be controlled by other people. Do what you want and only what you want.",
                "§b[LonelyMod] §fDon't let yourself be influenced by others' actions. Do what you want!",
                "§b[LonelyMod] §fI know you will do what's right for you. Believe in yourself!",
                "§b[LonelyMod] §fYou aren't going to do anything wrong. Believe in yourself more than you are!"
        };
        int chosenAdvice = (int) Math.floor(Math.random()*adviceMessages.length);
        Minecraft.getMinecraft().thePlayer.playSound("random.orb", 1, 1);
        sender.addChatMessage(new ChatComponentText(adviceMessages[chosenAdvice]));
    }

    @Override
    public int getRequiredPermissionLevel() {
        return -1;
    }
}
