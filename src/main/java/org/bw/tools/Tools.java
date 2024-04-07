package org.bw.tools;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Tools extends ListenerAdapter {

    // CALLs
    ContentMessage contentMessage = new ContentMessage();

    // getCommandsHelp
    public MessageEmbed getCommandsHelp(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle(ContentMessage.TITLE.COMMANDS_HELP)
                .setImage(ContentMessage.EMOJI.MaestroBlackwolf)
                .setDescription(ContentMessage.MESSAGE.GET_COMMANDS_HELP)
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }
    // getPrograms
    public MessageEmbed getPrograms(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("IntelliJ IDEA & JDK")
                .setDescription(ContentMessage.MESSAGE.GET_PROGRAMS)
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }

    // getVariables
    public MessageEmbed getVariables(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("Tipos de Variables")
                .setDescription(ContentMessage.MESSAGE.GET_VARIABLE)
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }

    // getVariables
    public MessageEmbed getUser(SlashCommandInteractionEvent e){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle(e.getMember().getRoles().get(0).getName()+" "+ e.getMember().getNickname())
                .setImage(e.getMember().getEffectiveAvatarUrl())
                .setDescription(
                    "------------------------------------\n"+
                    "**Imagen:** "+e.getMember().getEffectiveAvatarUrl()+"\n"+
                    "**Rol:** "+e.getMember().getRoles().get(0).getName()+"\n"+
                    "**Nick:** "+e.getMember().getNickname()+"\n"+
                    "**Mencion:** "+e.getMember().getAsMention()+"\n"+
                    "**ID:** "+e.getMember().getId()+"\n"+
                    "**Tag:** "+e.getUser().getAsTag()+"\n"+
                    "------------------------------------"
                )
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }

}
