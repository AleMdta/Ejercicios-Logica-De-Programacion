/*
    To Do:
        -Validate the enters
        -Create a function to get a number's factorial

*/

let number;
const paragraph = document.createElement('p');
const divFactorial = document.getElementById('factorial');

do{
    //Validations
    let numberFromPromt = prompt("Please, enter a positive integer to get its factorial.");
    if(!isNaN(numberFromPromt) && Number.isInteger(parseInt(numberFromPromt)) && numberFromPromt != "" && parseInt(numberFromPromt) >= 0){
        number = Number(numberFromPromt);
        factorialCalculation(number);
    }else{
        alert("Please, enter a positve integer.")
    }

}while(isNaN(number));

//Function to obtain factorial
function factorialCalculation(number){
    let factorial = 1;
    if(number == 0){
        factorial = factorial;
    }else{
        for(let i = 2; i <= number; i++){
            factorial = factorial * i;
        }
    }
    divFactorial.appendChild(paragraph);//Adding a paragraph to the HTML document
    paragraph.textContent = `${factorial}`;//Adding the result to the paragraph

    return console.log("Factorial of " + number + " is " + factorial);
}

