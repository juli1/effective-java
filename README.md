# Effective Java

This repository contains several examples of Effective Java code.
It is taken from the book [Effective Java](https://www.amazon.com/Effective-Java-Joshua-Bloch/dp/0134685997) but also other places over the internet.

I highly recommend reading the book.



## List of good practices


 - Use factory method and not constructors: [Pizza.java](src/org/gunnm/java/effective/Pizza.java)
 - Use the Builder pattern to build object; [PizzaBuilder.java](src/org/gunnm/java/effective/PizzaBuilder.java)
 - How to define a Singleton: [Singleton.java](src/org/gunnm/java/effective/Singleton.java)
 - Class with Utils/static member: [NonInstantiableUtilsClass](src/org/gunnm/java/effective/NonInstantiableUtilsClass.java)
 - Try with resources: [TryWithResources](src/org/gunnm/java/effective/TryWithResources.java)
 - Equals method: [PersonEquality](src/org/gunnm/java/effective/PersonEquality.java)
 - Hashcode override method: good way in [PersonHashCodeGood](src/org/gunnm/java/effective/PersonHashCodeGood.java) and bad way in [PersonHashCodeBad](src/org/gunnm/java/effective/PersonHashCodeBad.java)
 - Clone method: [PersonEquality](src/org/gunnm/java/effective/PersonEquality.java)
 - Use of Generics: [GenericLinkedList](src/org/gunnm/java/effective/GenericLinkedList.java)
 - Use of Enumeration: [GenericLinkedList](src/org/gunnm/java/effective/CheeseEnum.java)
 
 
 ## Simple Good Practices
 
  - Do not use finalizers or cleaner
  - Do not rebuild String and use code such as `String s1 = "foobar"; String s2 =  new String(s);`
  - Favor composition over inheritance
  - Use immutable values as much as you can
  - Avoid abstract classes and use interfaces: at least, you can use multiple interfaces