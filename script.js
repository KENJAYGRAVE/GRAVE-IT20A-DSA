class Animal{
    constructor(name){
        this.name = name;

    }
}
var animal = new Animal("dog");
var eat = new Animal("eating");
var sleep = new Animal("sleeping");
var play = new Animal("playing");
var breed = new Animal("mamal");

console.log(animal.name + " is " + breed.name);
console.log(animal.name + " is " + eat.name);
console.log(animal.name + " is " + sleep.name);
console.log(animal.name + " is " + play.name);

document.getElementById("text").innerHTML= animal.name + " is " + breed.name + "<br>" +
animal.name + " is " + eat.name + "<br>"+
animal.name + " is " + play.name + "<br>"+
animal.name + " is " + sleep.name;