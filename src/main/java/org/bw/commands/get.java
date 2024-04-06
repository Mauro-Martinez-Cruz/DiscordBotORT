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

            // getPrograms
            if(e.getOption("command").getAsString().equals("getPrograms")) {
                e.replyEmbeds(tools.getPrograms()).queue();
                System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /get getProgrmas");
            }
            // getVariables
            if(e.getOption("command").getAsString().equals("getVariables")){
                e.replyEmbeds(tools.getVariables()).queue();
                System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /get getVariables");
            }


        }
    }

}
