package org.bw.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bw.Model.Usuario;
import org.bw.database.UsuarioDao;
import org.bw.tools.Tools;

import java.awt.*;

public class get extends ListenerAdapter {

    // CALL
    Tools tools = new Tools();

    // RECEPTOR DEL COMANDO
    public void onSlashCommandInteraction(SlashCommandInteractionEvent e){

        // USER DATA (START)
        String id = e.getMember().getId();
        String imagenURL = e.getMember().getEffectiveAvatarUrl();
        String rol = e.getMember().getRoles().get(0).getName();
        String nick = e.getMember().getNickname();
        String mencion = e.getMember().getAsMention();
        String tag = e.getUser().getAsTag();

        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario = new UsuarioDao().encontrar(usuario);
        if(usuario.getTag() == null){
            usuario.setTag(tag);
            usuario.setMencion(mencion);
            usuario.setNick(nick);
            usuario.setRol(rol);
            usuario.setImagenUrl(imagenURL);
            usuario.setNivel(1);
            usuario.setTareasEntregadas(0);
            usuario.setPromedio(0);
            int inster = new UsuarioDao().insertar(usuario);
            System.out.println("insertar: " + inster);
        }else{
            usuario.setTag(tag);
            usuario.setMencion(mencion);
            usuario.setNick(nick);
            usuario.setRol(rol);
            usuario.setImagenUrl(imagenURL);
            int update = new UsuarioDao().actualizar(usuario);
            System.out.println("update: " + update);
        }
        // USER DATA (CLOUSE)

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
                e.replyEmbeds(tools.getUser(usuario)).queue();
                System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /get getUser");
            }
        }

        if(e.getName().equals("user")){
            e.replyEmbeds(tools.getUser(usuario)).queue();
            System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /get getUser");
        }

        if(e.getName().equals("help")){
            e.replyEmbeds(tools.getCommandsHelp()).queue();
            System.out.println("["+e.getUser().getAsMention()+"]["+e.getUser().getAsTag()+"]["+e.getTextChannel().getName()+"]: /help");
        }
    }

}
