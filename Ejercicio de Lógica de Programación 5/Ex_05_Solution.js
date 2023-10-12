let number;
let aNumbersWrong = [];
alert("Let's play a game, I have a secret.");
validation();
function validation(){
    do{
        let numberFromPromt = prompt("Please, enter a number between 1 and 100");
        if(!isNaN(numberFromPromt) && Number.isInteger(parseInt(numberFromPromt)) && parseInt(numberFromPromt) != "" && parseInt(numberFromPromt) > 0 && parseInt(numberFromPromt) <= 100){
            number = Number(numberFromPromt);
            secretNumber(number); 
        }else{
            alert("Please, enter a positive integer between 1 and 100.");
        }
    
    }while(isNaN(number));
}


function secretNumber(number){
    if(number != 26){
        alert("¡Ups! That's not my secret, please try again.");
        aNumbersWrong.push(number);
        validation();
    }else{
        alert("Now you know my secret. My favorite number is 26. (:");
        console.log("Numbers you thought were my secret: " + aNumbersWrong);
    }
}