package com.example;

public class EquipeDesenvolvedores implements Equipe{
    private static EquipeDesenvolvedores instance = new EquipeDesenvolvedores();

    private EquipeDesenvolvedores() {}

    public static EquipeDesenvolvedores getInstance(){
        return instance;
    }

    public String receiveDuvida(String msg){
        return "Estamos trabalhando nisso: " + msg;
    }

    public String receiveElogio(String msg){
        return "Agradecemos pelo elogio: " + msg;
    }
}