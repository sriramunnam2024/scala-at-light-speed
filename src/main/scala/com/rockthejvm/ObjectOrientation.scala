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

  trait philosopher {
    def ?!(thought: String): Unit // valid method name
  }

  // single-class inheritance, multi-trait "mixing"
  class Crocodile extends Animal with Carnivore {
    override def eat(animal: Animal): Unit = println("I am eating you, Animal!")
  }

  val aCroc = new Crocodile
  aCroc.eat(aDog)
  aCroc eat aDog // infix notation = object method argument, only available for methods with ONE argument

}
