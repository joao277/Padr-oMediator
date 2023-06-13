package com.example;

public class Usuario {
    public String sendDuvidaEquipe(String msg){
        return Suporte.getInstance().receiveDuvidaEquipe(msg);
    }

    public String sendElogioEquipe(String msg){
        return Suporte.getInstance().receiveElogioEquipe(msg);
    }
}