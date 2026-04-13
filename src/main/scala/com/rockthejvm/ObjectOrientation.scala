package com.rockthejvm

object ObjectOrientation extends App{

  // class and instance
  class Animal {
    // define fields
    val age: Int = 0
    def eat()= println("I amm eating")
  }

  val an_Animal = new Animal

  // inheritance
  class Dog(val name: String) extends Animal
  val aDog = new Dog("Lassie")

  // constructor arguments are NOT fields: need to put a val before the constructor argument
  aDog.name

  // subtype polymorphism
  val a_Declared_Animal: Animal = new Dog("Hachi")
  a_Declared_Animal.eat() // the most derived method will be called at runtime

  // abstract class
  abstract class WalkingAnimal {
    val haslegs = true
    def walk(): Unit
  }

  // "interface" = ultimate abstract type
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

}
