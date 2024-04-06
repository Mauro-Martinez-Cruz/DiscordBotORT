package org.bw.tools;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Tools extends ListenerAdapter {

    // CALLs
    ContentMessage contentMessage = new ContentMessage();

    // getPrograms
    public MessageEmbed getPrograms(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("IntelliJ IDEA & JDK")
                .setDescription(contentMessage.MSG_GET_PROGRAMS)
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }

    // getVariables
    public MessageEmbed getVariables(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("Tipos de Variables")
                .setDescription(contentMessage.MSG_GET_VARIABLE)
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }

}
