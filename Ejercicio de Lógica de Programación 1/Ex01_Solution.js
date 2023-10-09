/*
    To Do:
        -Get 3 numbers by promt and save them.
        -Compare numbre by number using a conditional 

*/

let firstNumber = parseInt(prompt("Give me a number: "));
let secondNumber = parseInt(prompt("Give me an other number: "));;
let thirdNumber = parseInt(prompt("Give me an other number: "));;

if((firstNumber < secondNumber) && (secondNumber < thirdNumber)) {
    console.log("Numbers sorted from highest to lowest: ",thirdNumber, ", ", secondNumber, ", ", firstNumber);
    console.log("Numbers sorted from lowest to highest: ", firstNumber, ", ", secondNumber, ", ", thirdNumber);
}else{
    if(firstNumber >= secondNumber){
        if(firstNumber >= thirdNumber){
            if(secondNumber >= thirdNumber){
                console.log("Numbers sorted from highest to lowest: ", firstNumber, ", ", secondNumber, ", ", thirdNumber);
                console.log("Numbers sorted from lowest to highest: ",thirdNumber, ", ", secondNumber, ", ", firstNumber);
            }else{
                console.log("Numbers sorted from highest to lowest: ", firstNumber, ", ", thirdNumber, ", ", secondNumber);
                console.log("Numbers sorted from lowest to highest: ",secondNumber, ", ", thirdNumber, ", ", firstNumber);     
            }
        }else{
            console.log("Numbers sorted from highest to lowest: ", thirdNumber, ", ", firstNumber, ", ", secondNumber);
            console.log("Numbers sorted from lowest to highest: ", secondNumber, ", ", firstNumber, ", ", thirdNumber); 
        }
    }else{
        if(secondNumber >= thirdNumber){
            if(thirdNumber >= firstNumber){
                console.log("Numbers sorted from highest to lowest: ", secondNumber, ", ", thirdNumber, ", ", firstNumber);
                console.log("Numbers sorted from lowest to highest: ", firstNumber, ", ", thirdNumber, ", ", secondNumber); 
            }else{
                console.log("Numbers sorted from highest to lowest: ", secondNumber, ", ", firstNumber, ", ", thirdNumber);
                console.log("Numbers sorted from lowest to highest: ", thirdNumber, ", ", firstNumber, ", ", secondNumber); 
            }
        }
    }
}


