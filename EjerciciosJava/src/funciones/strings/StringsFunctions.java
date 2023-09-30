package funciones.strings;

public class StringsFunctions {


    public String thisHaveAOrB (String phrase){
        phrase = phrase.toLowerCase();
        return phrase.contains("a") && phrase.contains("b")? "This phrase contains the letters a and b":
                "This phrase does not contain both letters a and b";
    }
}
