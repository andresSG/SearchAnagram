package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Andres sg
 * ref word reader: https://blog.openalfa.com/como-leer-un-fichero-de-texto-linea-a-linea-en-java
 */
public class WordReader {
    private ArrayList<String> listaWords = new ArrayList();
    private File diccionario = new File(".\\dictionary\\wordlist.txt");

    public WordReader() {
        
    try {
        FileInputStream fis = new FileInputStream(diccionario);
        InputStreamReader isr = new InputStreamReader(fis,"utf8");
        BufferedReader br = new BufferedReader(isr);

        String linea;
        while((linea = br.readLine()) != null){
            listaWords.add(linea);
        }

        fis.close();
    }
    catch(Exception e) {
      System.out.println("Excepcion leyendo fichero "+ diccionario.getName() + ": " + e);
    }
}

    public ArrayList<String> getListaWords() {
        return listaWords;
    }

    public File getDiccionario() {
        return diccionario;
    }

    public void setDiccionario(String diccionario) {
        this.diccionario = new File(diccionario);
    }    
    
}
