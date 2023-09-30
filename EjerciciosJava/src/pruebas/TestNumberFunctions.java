package pruebas;
import funciones.numeros.*;

public class TestNumberFunctions {
    public static void main(String[] args) {
        NumberFunctions functionToNumbers = new NumberFunctions();

        System.out.println("1. numberBetweenTenAndTwenty");
        System.out.println(functionToNumbers.numberBetweenTenAndTwenty(5) );
        System.out.println(functionToNumbers.numberBetweenTenAndTwenty(15) );
        System.out.println(functionToNumbers.numberBetweenTenAndTwenty(25) );
        System.out.println("2. numberIsDividedByTwoOrThree");
        System.out.println(functionToNumbers.numberIsDividedByTwoOrThree(4) );
        System.out.println(functionToNumbers.numberIsDividedByTwoOrThree(5) );
        System.out.println(functionToNumbers.numberIsDividedByTwoOrThree(9) );
        System.out.println(functionToNumbers.numberIsDividedByTwoOrThree(36) );
        System.out.println("3. isPositiveNumber");
        System.out.println(functionToNumbers.isPositiveNumber(4) );
        System.out.println(functionToNumbers.isPositiveNumber(0) );
        System.out.println(functionToNumbers.isPositiveNumber(-5) );
        System.out.println("4. numberIsDividedByTwoOrFive ");
        System.out.println(functionToNumbers.numberIsDividedByTwoOrFive(4));
        System.out.println(functionToNumbers.numberIsDividedByTwoOrFive(10));
        System.out.println(functionToNumbers.numberIsDividedByTwoOrFive(25));
        System.out.println("5. isLessThan100AndPrime ");
        System.out.println(functionToNumbers.isLessThan100AndPrime(55));
        System.out.println(functionToNumbers.isLessThan100AndPrime(7));
        System.out.println(functionToNumbers.isLessThan100AndPrime(101));



    }

}
