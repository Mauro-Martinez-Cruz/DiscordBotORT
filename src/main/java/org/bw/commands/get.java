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

            // getCommandsHelp
            if(e.getOption("command").getAsString().equals("getCommandsHelp")){
                e.replyEmbeds(tools.getCommandsHelp()).queue();
                System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /get getCommandsHelp");
            }
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
            // getUser
            if(e.getOption("command").getAsString().equals("getUser")){
                e.replyEmbeds(tools.getUser(e)).queue();
                System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /get getUser");
            }


        }

        System.out.println(
                "------------------------------------\n"+
                "Imagen: "+e.getMember().getEffectiveAvatarUrl()+"\n"+
                "Rol: "+e.getMember().getRoles().get(0).getName()+"\n"+
                "Nick: "+e.getMember().getNickname()+"\n"+
                "Mencion: "+e.getMember().getAsMention()+"\n"+
                "ID: "+e.getMember().getId()+"\n"+
                "Tag: "+e.getUser().getAsTag()+"\n"+
                "------------------------------------"
        );

        if(e.getName().equals("help")){
            e.replyEmbeds(tools.getCommandsHelp()).queue();
            System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /help");
        }
    }

}
