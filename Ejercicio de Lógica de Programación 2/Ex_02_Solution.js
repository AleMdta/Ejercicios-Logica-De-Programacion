/*
    To Do:
        -Get celsius temperature  (°F) = (Temperature in degrees Celsius (°C) * 9/5) + 32;
        -Create 2 functions to convert


*/

let celsius;

//Validar entradas
do{
    let degrees = prompt("Enter the degrees celsius to convert: ");
    if(!isNaN(degrees) && degrees != ""){
        celsius = Number(degrees);
        conversionCelsiusFahrenheit(celsius);
        conversionCelsiusKelvin(celsius);
    }else{
        alert("Please enter a number.")
    }

}while(isNaN(celsius));


function conversionCelsiusFahrenheit(celsius){
    fahrenheit = (celsius * (9/5)) + 32;
    return console.log(celsius + "°Celsius is " + fahrenheit.toFixed(2) + "°Fahrenheit.");
}

function conversionCelsiusKelvin(celsius){
    kelvin = celsius + 273.15;
    return console.log(celsius + "° Celsius is " + kelvin + "°Kelvin.");
}
