package funciones.numeros;

public class NumberFunctions {

    public String numberBetweenTenAndTwenty (int number) {
       return number > 10 && number <20? "The number "+number+ " is between 20 and 10":"The number "+number+ " is not between 20 and 10";
    }
    public String numberIsDividedByTwoOrThree (int number) {

        return number % 2 == 0&& number % 3 == 0 ? "The number "+number+ " is divided by 2 and 3":
               number % 2 == 0 ? "The number "+number+ " is divided by 2":
               number % 3 == 0?"The number "+number+ " is divided by 3":
               "The number "+number+ " is not divided by 2 or 3";

    }

    public String isPositiveNumber(int number){
        return number > 0 ? number +" is a positive number.":
               number ==0 ? number +" is zero":
               number +" is a negative number";
    }

    public String numberIsDividedByTwoOrFive (int number) {
        return number % 2 == 0 && number % 5 == 0 ? "The number " + number + " is divided by 2 and 5" :
                number % 2 == 0 ? "The number " + number + " is divided by 2" :
                        number % 5 == 0 ? "The number " + number + " is divided by 5" :
                                "The number " + number + " is not divided by 2 or 5";

    }

    public String numberIsLessThanFiftyOrGreaterThan100 (int number) {

        return number % 2 == 0&& number % 5 == 0 ? "The number "+number+ " is divided by 2 and 5":
                number % 2 == 0 ? "The number "+number+ " is divided by 2":
                        number % 5 == 0?"The number "+number+ " is divided by 5":
                                "The number "+number+ " is not divided by 2 or 5";

    }

    public String isNegativeNumber(int number){
        return number < 0 ? number +" is a negative number.":
                number ==0 ? "is zero":
                        " is a positive number";
    }
    public boolean isPrimeNumber (int number){
        Boolean result = true;
        for (int num = 2; num < number; num++){
            if( number % num !=0 ){
                result = true;
            }else {
                System.out.println(number + " is divided by " + num + " so it is not a prime number");
                return false;
            }
        }
        System.out.println(number + " is a prime number");
        return result ;
    }
    public String isLessThan100AndPrime(int number){
        return number < 100 && isPrimeNumber(number) ?
               number + " is less than 100 and a prime number":
               number + " is not less than 100";
    }
}
