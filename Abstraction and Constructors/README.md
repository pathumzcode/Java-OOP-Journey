# 🚗 What Are Objects in Java?

Java is an **Object-Oriented Programming (OOP)** language where **objects** are the main building blocks of a program.  
An **object** is an **instance of a class**, and it contains:

- **Attributes (Properties):** Represent the **state** or **data** of the object.  
- **Methods (Functions):** Represent the **behavior** or **actions** of the object.  
---

## 🧱 Example — Car Object

A car can be represented as an object with:

| Attribute | Description |
|------------|-------------|
| `color` | The color of the car |
| `model` | The model name of the car |
| `speed` | The current speed |
| `start()` | Starts the car |
| `stop()` | Stops the car |

<!-- Add image after table, small size -->
<p>
  <img src="https://codersite.dev/assets/images/carClass.jpg" alt="Car Class Example" width="500"/>
</p>


---

## 🧩 Types of Objects in Java

### 1️⃣ User-Defined Objects  
- Created from **user-defined classes** (classes that you write).  
- **Examples:** `Car`, `Dog`, `Student`

### 2️⃣ Predefined (Library) Objects  
- Provided by **Java’s built-in libraries**.  
- **Examples:** `Scanner`, `String`, `ArrayList`

---

## 🏗️ How to Create Objects in Java

### 🧩 Step 01: Define a Class (Blueprint or Mold)
```java
public class ClassName {
    // attributes and methods go here
}

```
- Attributes are variables that belong to a class or an object.

### 🧩 Step 02: Create an Object (Dynamic Instance)
Use the `new` keyword to create an object in method:

```java
ClassName ObjectName = new ClassName();
```

### 🧩 Step 03: Create Attributes in the Class

Define variables (properties) inside the class.

```java
public class ClassName {
    AttributeType AttributeName;
}
```

### 🧩 Step 04: Initialize Object Properties

Assign values to object attributes in method:

```java
ObjectName.AttributeName ="Value"; 
```
### 📘 How to Use Objects in Java

In Java, once you have created an object, you can interact with it in two main ways: accessing its properties (attributes) and calling its methods (functions).

## 1️⃣ Access Object Properties

Use the dot operator (.) to access the attributes of an object.

```java
objectName.attributeName
```

## 2️⃣ Call Object Methods

Use the dot operator (.) to call methods defined in the class.

```java
objectName.methodName();
```
[![View](https://img.shields.io/badge/View-Attributes%20And%20Classes%20Sample%20Code-blue?style=for-the-badge&logo=java)](AttributesAndClassesSample.java)
- Output :

<img src="../Images/Attributes%20And%20Classes%20Sample%20Output.png" 
     alt="Attributes and Classes Sample Output" 
     width="300">









