
let number;
do{
    //Validations
    let numberFromPromt = prompt("Please, enter a positive integer to get its Fibonacci.");
    if(!isNaN(numberFromPromt) && Number.isInteger(parseInt(numberFromPromt)) && numberFromPromt != "" && parseInt(numberFromPromt) >= 0){
        number = Number(numberFromPromt);
        fibonacciCalculation(number);
    }else{
        alert("Please, enter a positve integer.")
    }

}while(isNaN(number));

function fibonacciCalculation(number){
    let aFibonacci = [];
    aFibonacci[0] = 0;
    aFibonacci[1] = 1;
    for(let i = 2; i < number; i++){
        aFibonacci[i] = aFibonacci[i-1] + aFibonacci[i-2];
    }
    return console.log(aFibonacci);
}
