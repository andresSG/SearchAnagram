package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Andres sg
 * ref esAnagrama: https://es.stackoverflow.com/questions/41519/identificar-una-anagrama
 */
public class AnagaramaFinder {
    
    //pre-listado por longitud de la palabra
    public static ArrayList<String> getListaWordsPre(int longit, ArrayList<String> listaWords) {
        ArrayList<String> pre_Words = new ArrayList();
        
        for (String word : listaWords) {
            if (word.length() == longit){
                pre_Words.add(word);
            }
        }
        return pre_Words;
    }
    
    public static ArrayList<String> getAnagramas(String word, ArrayList<String> listaWords){
        ArrayList<String> listaPre = AnagaramaFinder.getListaWordsPre(word.length(), listaWords);
        ArrayList<String> anagramas = new ArrayList<>();
        
        for (String wordCheck : listaPre) {
            if(esAnagrama(word, wordCheck)){
                anagramas.add(wordCheck);
            }
        }
        
        return anagramas;
    }
    
    public static boolean esAnagrama(String s1, String s2) {

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String(array1).equals(new String(array2));
    }
}
