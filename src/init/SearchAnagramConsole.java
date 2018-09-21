package init;

import controller.Controller;
import java.util.ArrayList;

/**
 * @author Usuario
 */
public class SearchAnagramConsole {
    
    public static void main(String []arg){
        Controller c = new Controller();
        String palabra = "";
        
        if(arg.length >= 1){
            palabra = arg[0];
        }else{
            palabra = "palabra";
        }
        
        ArrayList<String> anagramas = c.getAnagramas(palabra);
        for (String anagrama : anagramas) {
            System.out.println(anagrama);
        }
    }
}
