package com.example;

public class Suporte {
    private static Suporte instance = new Suporte();

    private Suporte() {}

    public static Suporte getInstance(){
        return instance;
    }

    public String receiveDuvidaEquipe(String msg){
        return "Vamos analisar sua duvida. \n" +
                "Resposta: " + EquipeDesenvolvedores.getInstance().receiveDuvida(msg);
    }

    public String receiveElogioEquipe(String msg){
        return "Muito obrigado! \n" +
                "Resposta: " + EquipeDesenvolvedores.getInstance().receiveElogio(msg);
    }
}