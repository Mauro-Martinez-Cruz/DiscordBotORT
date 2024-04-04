package org.bw;

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

    public static void main(String[] args) throws LoginException, InterruptedException {
        builder = JDABuilder.createDefault("MTA2MjM2NzM2ODU1NjMzMTAxOA.GgNwkU.eMiwzv2iy2CgFh1kKsWwe6L_kSXiay458sHCAM")
                .addEventListeners(new get());


        builder.setActivity(Activity.playing("Intellij IDEA"))
                .setStatus(OnlineStatus.ONLINE);


        sharddMan = builder.build();

        sleep(5000);

        /* COMANDO GET
        sharddMan.getGuildById("1225506308439015424").upsertCommand("get","Obtener datos")
                .addOption(OptionType.STRING, "command", "Dato a Obtener", true).queue();
        */
    }

}