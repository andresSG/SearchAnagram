/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.AnagaramaFinder;
import model.WordReader;

/**
 *
 * @author Usuario
 */
public class Controller {
    private WordReader reader;

    public Controller() {
        reader = new WordReader();
    }
    
    public ArrayList<String> getAnagramas(String palabra){
        return AnagaramaFinder.getAnagramas(palabra, reader.getListaWords());
    }
}
