package org.bw.tools;

public class ContentMessage {
    // VARIABLES PRIVADAS
    public static final String JDK = "https://www.oracle.com/java/technologies/downloads/";
    public static final String IntelliJ = "https://www.jetbrains.com/es-es/idea/download/download-thanks.html?platform=windows&code=IIC";

    // MESAJES PUBLICOS
    public static class MESSAGE{

        public static final String GET_COMMANDS_HELP =
            "**/get getPrograms** Para ver los programas a instalar\n"+
            "**/get getVariables** Para ver los tipos de variables que hay en java\n" +
            ""
        ;

        public static final String GET_PROGRAMS =
            "**IntelliJ IDEA:** " +
                    IntelliJ+"\n" +
                    "**JDK:** " +
                    JDK
        ;

        public static final String GET_VARIABLE =
            "**byte:** como su propio nombre denota, emplea un solo byte (8 bits) de almacenamiento. Esto permite almacenar valores en el rango [-128, 127].\n\n" +
                    "**short:** usa el doble de almacenamiento que el anterior, lo cual hace posible representar cualquier valor en el rango [-32.768, 32.767].\n\n" +
                    "**int:** emplea 4 bytes de almacenamiento y es el tipo de dato entero más empleado. El rango de valores que puede representar va de -231 a 231-1.\n\n"+
                    "**long:** es el tipo entero de mayor tamaño, 8 bytes (64 bits), con un rango de valores desde -263 a 263-1.\n\n"+
                    "**float:** conocido como tipo de precisión simple, emplea un total de 32 bits. Con este tipo de datos es posible representar números en el rango de 1.4x10-45 a 3.4028235x1038.\n\n"+
                    "**double:** sigue un esquema de almacenamiento similar al anterior, pero usando 64 bits en lugar de 32. Esto le permite representar valores en el rango de 4.9x10-324 a 1.7976931348623157x10308.\n\n"+
                    "**boolean:** tiene la finalidad de facilitar el trabajo con valores \"verdadero/falso\" (booleanos), resultantes por regla general de evaluar expresiones. Los dos valores posibles de este tipo son true y false.\n\n"+
                    "**char:** se utiliza para almacenar caracteres individuales (letras, para entendernos). En realidad está considerado también un tipo numérico, si bien su representación habitual es la del carácter cuyo código almacena. Utiliza 16 bits y se usa la codificación UTF-16 de Unicode.\n\n"+
                    "Aunque las cadenas de caracteres no son un tipo simple en Java, sino una instancia de la clase **String**, el lenguaje otorga un tratamiento bastante especial a este tipo de dato, lo cual provoca que, en ocasiones, nos parezca estar trabajando con un tipo primitivo.\n"
        ;


    }

    public static class EMOJI{
        public static final String MaestroBlackwolf = "https://cdn.discordapp.com/emojis/1039626460022980721.webp?size=48&quality=lossless&name=Blackwolf";

    }

    public static class TITLE{
        public static final String COMMANDS_HELP = "**𝖢𝗈𝗆𝖺𝗇𝖽𝗈𝗌 𝖽𝖾𝗅 𝖩𝖺𝗏𝖺𝖡𝗈𝗍**";
    }


}
