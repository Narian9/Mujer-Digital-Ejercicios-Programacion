package pruebas;
import funciones.strings.*;

public class TestStringFunctions {
    public static void main(String[] args) {
        StringsFunctions stringsFunction = new StringsFunctions();

        System.out.println("5. Method: thisHaveAOrB");
        System.out.println(stringsFunction.thisHaveAOrB(" It can work with different databases"));
        System.out.println(stringsFunction.thisHaveAOrB(" gives information to the framework of how to convert"));
        System.out.println(stringsFunction.thisHaveAOrB(" It can work with different databases"));

    }
}
