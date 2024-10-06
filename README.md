# Store-Manager-Project
My project for Unit 2 APCSA 
# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here.

![UML Diagram for my project](nameOfImageFileHere.png)

## Description

Write a description of your project here. Include what your store you made, and why you chose this topic. In your description, include as many vocab words from our class to explain how you represented the item/service from your store. If you have user input, explain how the user will interact with your store such as which questions are prompted to the user, what response is your program expecting, and how that is use to output information for your store in the console.

My project made crystal items with different types of them such as jewelry, statues, and just generally selling crystals like rose quartz (pink), tigers eye(orange), and citrine(yellow). 
Eahc item gets represented by a class such as Crystal.java, Jewelry.java, Statue.java, and StoreRunner.java. Each had an attribute of color, price, and type of material or item. As an exmple the Jewelry extends the Crystal which adds a description of material. The statue class includes artists name, and description of personlization. In the toString where I overloaded and overrided, i ensured that each item in my shop is described in small details such as the type of jewery such as a necklace wether they wanted gold or silver and the color depended on the crytsal that they wanted implemented into the jewlery piece. The color for statue and the crystal was depended on the type of crystal chosen. 
