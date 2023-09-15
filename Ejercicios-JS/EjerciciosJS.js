"use strict"
/**1 Calcular el área de un triángulo.*/
let base =3;
let height = 4;
const getAreaTriangle = (height, base) => `Area of a Triangle is: ${.5*base*height}`;

//test
console.log(getAreaTriangle(height,base));
console.log('*************');
/*2 Convertir grados Celsius a Fahrenheit.*/
const convertCelsiusToFahrenheit = (celsius ) => `${celsius} ºC equals to  ${(celsius * (9/5))+32}ºF`;

console.log(convertCelsiusToFahrenheit(20));
console.log('*************');
/*3 Encontrar el máximo de dos números.*/

/*4 Calcular el factorial de un número.*/
let number = 6;
const factorialNumber = (number) =>(number>0)? (number*factorialNumber(number - 1 )):1;
//test
console.log(`El factorial de ${number} es ${factorialNumber(number)}`);
console.log('*************');
/*5 Verificar si un número es primo.*/
const isPrime = (number) => {
    // (number %2 != 0  number ) 
    for(let i =3; i<= number; i++){
        for(let j=i-1; j>=2; j-- ){
            if(i%j != 0 && number %2 != 0){
                continue;
            }else{ 
                return `${number} no es primo`;
            }
        }
        return `${number} es primo`;
    }
}
  console.log(isPrime(10));
  console.log(isPrime(179));
  console.log(isPrime(978));
  console.log('*************');
/*6 Revertir una cadena de texto.*/
let stringTxt = "Australia's capital city is Canberra."
const stringReverse = (txt) => (txt.split("")).reverse().join("");
//test
console.log(stringTxt);
console.log(stringReverse(stringTxt));
console.log('*************');
/*7 Calcular la suma de los primeros N números naturales.*/
let nNumber =10;
const sumNaturalNumber = (nNumber) =>{
    let sum = 0;
    for (let index = 0; index < nNumber; index++) {
        sum += index;
        
    }
    return sum;
}
//TEST
console.log(`suma de los primeros N números naturales`);
console.log(sumNaturalNumber(nNumber));
console.log(sumNaturalNumber(100));
console.log('*************');
/*8 Encontrar el elemento más grande en un arreglo.*/
const arrayOfNumbers = [8,25,9,18,19,2,7]
const selectBiggerNumber = (arr = []) => arr.sort((a,b)=> a-b)[arr.length -1];
//test 
console.log(selectBiggerNumber(arrayOfNumbers));
console.log('*************');
/*9 Verificar si una palabra es un palíndromo.*/
const wordPalindrome = (w="")  => {
    let word = w.toLowerCase();

    return (word.split("")).reverse().join("") === word ? `${w} is palindrome`:`${w} is not palindrome`;
}
console.log(wordPalindrome("sun"));
console.log(wordPalindrome("radar"));
console.log(wordPalindrome("Level"));

console.log('*************');
/*10 Generar un número aleatorio en un rango dado.*/
const randomNumber = () =>(Math.random()*100).toFixed(0);

//test 
console.log('Random numbers');
console.log(randomNumber());
console.log(randomNumber());
console.log(randomNumber());
