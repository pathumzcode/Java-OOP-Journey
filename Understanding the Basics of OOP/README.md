# <span style="color:lightgreen;">Procedural vs Object-Oriented Programming</span>

## <span style="color:lightblue;">🧮 What is Procedural Programming?</span>

- **<span style="color:green;">Procedural Programming</span>** is a programming paradigm based on the concept of **procedures** or **functions**.  
- Code is organized as a **sequence of instructions** that execute step by step.  
- Focuses on **functions** to perform operations on shared data.  
- Uses a **top-down approach** for designing programs.  

---

## <span style="color:lightblue;">🧱 What is Object-Oriented Programming (OOP)?</span>

- **<span style="color:green;">Object-Oriented Programming (OOP)</span>** is a method of implementation in which programs are organized as a **collection of objects** that cooperate to solve a problem.  
- Allows developers to solve **complex problems more easily**.  
- A **complex system** is developed using **smaller subsystems**.  
- These subsystems are **independent units** containing their own data and functions.  
- These independent units can be **reused** to solve many different problems.  

---

## <span style="color:lightyellow;">☕ Comparison: Procedural Programming vs Object-Oriented Programming in Java</span>

| No. | Feature | 🧮 Procedural Programming (Example: C) | ☕ Object-Oriented Programming (Java) |
|:---:|:---------|:----------------------------------------|:--------------------------------------|
| 1 | **Program Structure** | Divided into **functions** that operate on data. | Divided into **classes** and **objects** containing data and methods. |
| 2 | **Approach** | Uses a **top-down** approach. | Uses a **bottom-up** approach. |
| 3 | **Focus** | Focuses on **how** to perform a task (logic and sequence). | Focuses on **who** performs the task (object behavior). |
| 4 | **Data Handling** | Data is **global** and shared between functions. | Data is **encapsulated** within classes using **access modifiers** (`private`, `public`, `protected`). |
| 5 | **Security** | Less secure; any function can access or modify data. | More secure through **encapsulation** and **data hiding**. |
| 6 | **Reusability** | Code reuse through function calls only. | High reusability through **inheritance** and **polymorphism**. |
| 7 | **Extensibility** | Hard to extend; requires changing multiple functions. | Easy to extend by adding new **classes** or overriding methods. |
| 8 | **Maintenance** | Complex and harder to maintain for large projects. | Easier to maintain using **modular class design**. |
| 9 | **Real-World Modeling** | Doesn’t model real-world entities directly. | Models real-world entities using **objects and classes**. |
| 10 | **Examples** | C, Pascal | **Java**, C++, Python |

---

## <span style="color:lightblue;">⚙️ How to Develop an Object-Oriented Program (Java)</span>

Developing an Object-Oriented (OO) program involves designing software around **objects** — entities that combine **data (attributes)** and **behavior (methods)**.  
A simple way to understand this is with the **house blueprint analogy**: a **class** is the blueprint, and **objects** are the houses built from it.

---

### <span style="color:teal;">🧩 Step 1: Identify the Objects Needed</span>
- Determine **what entities** are required for the program.  
- Example analogy: Decide **what types of houses** you want to build.  
- In a system, objects could include `Student`, `Course`, `Teacher`, etc.

---

### <span style="color:teal;">🏷️ Step 2: Group Objects According to Their Characteristics</span>
- Group similar objects that share properties and behavior into **classes**.  
- Analogy: Houses with similar features (number of rooms, floors) belong to the same **house plan**.

---

### <span style="color:teal;">🧱 Step 3: Create Blocks (Objects) from Moulds (Classes)</span>
- **Class:** Serves as a **blueprint** for objects.  
- **Object:** A specific instance of a class.  
- Analogy: From one house plan, you can build many houses. Each house is an independent object but follows the same blueprint.

---

### <span style="color:teal;">🏗️ Step 4: Assemble the Blocks (Objects)</span>
- Once objects are created, they can **interact and work together** to solve problems.  
- Analogy: You can build multiple houses from the same blueprint, each with unique features. Objects interact through their behaviors (methods) in the program.

---

### <span style="color:darkorange;">📌 Summary of Steps</span>

| Step | Description | Analogy |
|------|-------------|---------|
| 1️⃣ | Identify objects needed | Decide what houses you want |
| 2️⃣ | Group objects by characteristics | Group houses with similar features |
| 3️⃣ | Create objects from classes | Build houses from a blueprint |
| 4️⃣ | Assemble and interact objects | Houses exist and interact independently |

---

## <span style="color:lightblue;">🏠 Classes and Objects in Java</span>

| Concept       | Explanation                                                                                  | Analogy / Example |
|---------------|----------------------------------------------------------------------------------------------|-----------------|
| **Class**     | A blueprint or template for creating objects. Defines the **structure** (attributes) and **behavior** (methods) for all objects of that class. | `Dog` class defines attributes like `Name`, `Colour`, `Height` and methods like `getColour()` and `getName()`. |
| **Object**    | A specific instance of a class. Each object has its own **state** and can use the **behavior** defined by its class. | `Dog dog1 = new Dog("Tommy", "Brown", 35in)` is an object; `dog2 = new Dog("Bella", "Black", 21in)` is another object. Each dog has its own name, colour, and height. |
| **Reusability** | You can create **as many objects as you want** from a single class.                       | From the `Dog` class, you can create multiple dogs (`dog1`, `dog2`, `dog3`), each with its own attributes but sharing the same structure and behavior. |

The image below illustrates the **Dog class and its objects** in Java:

![Class and Object Example](https://media.geeksforgeeks.org/wp-content/uploads/20250805190315437489/Class_Object_example.webp)


---

## <span style="color:lightblue;">🕹️ Four Main Object Oriented Programming Concepts of Java</span>

### <span style="color:salmon;">1️⃣ Restricted Access</span>
- **Definition:** Limiting access to certain data or methods so that they cannot be modified directly from outside the object.  
- **Analogy:** In a video game, a player's **health points (HP)** cannot be changed directly by other characters; only certain game actions (like taking damage or healing) can modify it.  
- **Purpose:** Protects the integrity of the object’s data.

---

### <span style="color:salmon;">2️⃣ Information Hiding</span>
- **Definition:** Hiding the internal details of how an object works, exposing only what is necessary.  
- **Analogy:** Players know the **score**, but they don’t need to know how the game calculates damage or experience points internally.  
- **Purpose:** Simplifies interaction with the object and reduces dependency on internal details.

---

### <span style="color:salmon;">3️⃣ Public Functions (Methods)</span>
- **Definition:** Functions or methods that are accessible from outside the object to interact with it safely.  
- **Analogy:** In a video game, **attack()** or **heal()** methods allow characters to interact with other objects without directly modifying their internal stats.  
- **Purpose:** Provides a controlled interface to the object’s functionality.

---

### <span style="color:salmon;">4️⃣ Encapsulation</span>
- **Definition:** Combining **data (attributes)** and **methods** within an object and controlling access to data using **getters** and **setters**.  
- **Analogy:**  
  - A video game character has a **private inventory**.  
  - Other objects cannot access the inventory directly.  
  - The character provides a **getter method** like `getInventory()` to safely retrieve a list of items.  
- **Purpose:** Ensures data integrity while allowing controlled access to important information.

![Encapsulation](https://miro.medium.com/v2/resize:fit:1100/format:webp/0*UrJgGAitiB3YNPwj.png)


---

## <span style="color:lightyellow;">Differentiate Between Private and Public Access Modifiers in Java</span>

| Access Modifier | Description | Analogy / Example |
|-----------------|------------|-----------------|
| **Private** | Accessible **only within the class**. Protects data from outside access. | Player HP in a video game; other characters cannot modify it directly. |
| **Public** | Accessible **from anywhere** in the program. | attack() method in a video game; any object can call it to interact with another character. |

**Key Point:** Private ensures **restricted access** and **data security**, while public allows controlled interaction via **methods**.

## 📚 References

1. [GeeksforGeeks](https://www.geeksforgeeks.org/)  
2. [Medium](https://medium.com/@udaypatil318/encapsulation-in-java-da8d1c3c9caa)
3. Lecture Slides of SLIIT

