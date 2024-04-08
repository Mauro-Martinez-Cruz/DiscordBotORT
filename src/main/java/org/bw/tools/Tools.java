package org.bw.tools;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bw.Model.Usuario;

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
    public MessageEmbed getUser(Usuario u){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("Usuario "+ u.getNick())
                .setDescription(
                    ContentMessage.TXT_TOOLS.RECTANGULOS +"\n\n"+
                    "**Mencion:** "+ u.getMencion() +"\n"+
                    "**Tag:** "+ u.getTag() +"\n"+
                    "**Rol:** "+ u.getRol() +"\n"+
                    "**Nivel:** "+ u.getNivel() +"\n"+
                    "**Tareas entregadas:** "+ u.getTareasEntregadas() +"\n\n"+
                    ContentMessage.TXT_TOOLS.RECTANGULOS
                )
                .setImage(u.getImagenUrl())
                .setColor(new Color(227, 79, 0));
        return embedBuilder.build();
    }

}
