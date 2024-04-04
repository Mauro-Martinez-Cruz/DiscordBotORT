package org.bw.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bw.tools.Tools;

import java.awt.*;

public class get extends ListenerAdapter {

    // CALL
    Tools tools = new Tools();

    // RECEPTOR DEL COMANDO
    public void onSlashCommandInteraction(SlashCommandInteractionEvent e){
        if(e.getName().equals("get")){

            // getWeek
            if(e.getOption("command").getAsString().equals("getWeek"))
                e.replyEmbeds(tools.getWeek()).queue();
            // getORT
            if(e.getOption("command").getAsString().equals("getORT"))
                e.replyEmbeds(tools.getORT()).queue();

        }
    }

}
