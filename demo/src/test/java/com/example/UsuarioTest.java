package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class UsuarioTest {

    @Test
    void DeveEnviarDuvidaEquipe(){
        Jogador player = new Jogador();
        assertEquals("Vamos analisar sua duvida. \n" +
                "Resposta: Estamos trabalhando nisso: Como consigo meus itens de volta?", player.sendDuvidaEquipe("Como consigo meus itens de volta?"));
    }

    @Test
    void DeveEnviarElogioEquipe(){
        Jogador player = new Jogador();
        assertEquals("Muito obrigado! \n" +
                "Resposta: Agradecemos pelo elogio: Bom jogo!", player.sendElogioEquipe("Bom jogo!"));
    }
}