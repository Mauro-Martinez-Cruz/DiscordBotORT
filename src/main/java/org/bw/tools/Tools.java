package org.bw.tools;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.awt.*;

public class Tools extends ListenerAdapter {

    // VARIABLES ESTATICAS
    public static final String LUNES = "Lunes";
    public static final String MARTES = "Martes";
    public static final String MIERCOLES = "Miercoles";
    public static final String JUEVES = "Jueves";
    public static final String VIERNES = "Viernes";

    // getWeek
    public MessageEmbed getWeek(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("Semana")
                .setDescription(
                        "Dias de la semana\n" +
                                LUNES+"\n"+
                                MARTES+"\n"+
                                MIERCOLES+"\n"+
                                JUEVES+"\n"+
                                VIERNES+"\n"
                )
                .setColor(new Color(167,5,5));
        return embedBuilder.build();
    }

    // getORT
    public MessageEmbed getORT(){
        EmbedBuilder embedBuilder = new EmbedBuilder()
                .setTitle("Facultad de Ingenieria")
                .setImage("/img/ort.jpg")
                .setColor(new Color(167,5,5));
        return embedBuilder.build();
    }

}
