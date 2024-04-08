package org.bw;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigBeanFactory;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.parser.ConfigDocumentFactory;
import net.dv8tion.jda.api.*;
import net.dv8tion.jda.api.entities.*;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import org.bw.commands.*;


import javax.security.auth.login.LoginException;

import static java.lang.Thread.sleep;
import static net.dv8tion.jda.api.interactions.commands.OptionType.*;

public class Main {
    public static JDA sharddMan;
    public static JDABuilder builder;
    private static final String TOKEN = "MTIyNTUyMTQ3ODU0ODcxNzYyOQ.GNNtAC.i8k4aiYpKQ0g2SKWe9cca8a9z36ZVozh-ZeBrA";

    public static void main(String[] args) throws LoginException, InterruptedException {
        builder = JDABuilder.createDefault(TOKEN) // JavaBot
                .addEventListeners(new get());


        builder.setActivity(Activity.playing("Intellij IDEA"))
                .setStatus(OnlineStatus.ONLINE);


        sharddMan = builder.build();

        sleep(5000);

        /*// COMANDO GET
        sharddMan.getGuildById("1225851698359042068").upsertCommand("get","Obtener datos")
                .addOption(OptionType.STRING, "command", "Dato a Obtener", true).queue();
        */

        // COMANDO HELP
        //sharddMan.getGuildById("1225851698359042068").upsertCommand("help","Commandos del JavaBot").queue();

        // COMANDO USER
        //sharddMan.getGuildById("1225851698359042068").upsertCommand("user","Perfil de usuario").queue();


    }

}