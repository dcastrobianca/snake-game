package br.com.dcastrobianca.snakegame.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Game {
    public boolean gameRunning = true;
    
    public SnakeMoves readKeyboar(){
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        SnakeMoves sm = null;
        try {
            String command = br.readLine();
            
            for (SnakeMoves move : SnakeMoves.values()) {
                if(command.toUpperCase().equals(move.toString())){
                    sm = move;
                    break;
                }
            }
            
        } catch (IOException e) {
            System.out.println("invalid command");
        }

        return sm;
    }
}
