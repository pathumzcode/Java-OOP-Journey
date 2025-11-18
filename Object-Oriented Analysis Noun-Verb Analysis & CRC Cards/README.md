# 🎯 Object-Oriented Analysis: Noun-Verb Analysis & CRC Cards

> A comprehensive guide to identifying classes, responsibilities, and relationships in object-oriented system design

---

## 📖 Table of Contents

- [Introduction to SDLC in OOP Context](#-introduction-to-sdlc-in-oop-context)
- [What is Object-Oriented Analysis?](#-what-is-object-oriented-analysis)
- [Noun-Verb Analysis Technique](#-noun-verb-analysis-technique)
- [CRC Cards Method](#-crc-cards-method)
- [Types of Analysis Classes](#-types-of-analysis-classes)
- [Summary](#-summary)
- [References](#-references)

---

## 🔄 Introduction to SDLC in OOP Context

The **Software Development Life Cycle (SDLC)** in object-oriented programming follows a structured approach to building software systems.

### The 7 Phases of SDLC

| Phase | Description | Key Activities |
|-------|-------------|----------------|
| 1️⃣ **Requirements Gathering** | Understanding what needs to be built | Use Case Diagrams, User Stories, Use Case Scenarios |
| 2️⃣ **Object-Oriented Analysis** | Identifying classes, objects, and relationships | Noun-Verb Analysis, CRC Cards |
| 3️⃣ **Design** | Creating the system architecture | Class Diagrams, Sequence Diagrams, State Diagrams |
| 4️⃣ **Implementation** | Writing code in OOP languages | Java, C++, Python coding |
| 5️⃣ **Testing** | Verifying system functionality | Unit Tests, Integration Tests |
| 6️⃣ **Deployment** | Releasing the system | Configuration, Infrastructure Setup |
| 7️⃣ **Maintenance** | Updates and bug fixes | System modifications, enhancements |

### Why Object-Oriented Analysis Matters

✅ Helps identify the core components of a system  
✅ Defines clear responsibilities for each class  
✅ Establishes relationships between objects  
✅ Creates a solid foundation for design and implementation  

---

## 🔍 What is Object-Oriented Analysis?

**Object-Oriented Analysis (OOA)** is the process of examining a problem domain to identify classes, objects, and their relationships before designing and implementing a solution.

### Two Main Techniques

| Technique | Purpose | Output |
|-----------|---------|--------|
| **Noun-Verb Analysis** | Identify classes and their responsibilities | List of candidate classes and methods |
| **CRC Cards** | Define class responsibilities and collaborations | Structured documentation of class behavior |

---

## 📝 Noun-Verb Analysis Technique

Noun-Verb Analysis is a systematic approach to identifying potential classes and their responsibilities by examining the textual description of system requirements.

### The Process
```
Requirements Text → Identify Nouns → Apply Elimination Rules → Identify Classes
                   ↓
                Identify Verbs → Map to Classes → Define Responsibilities
```

### Step-by-Step Approach

#### 🔹 Step 1: Identify Nouns

Extract all nouns and noun phrases from the requirements document. These become **candidate classes**.

#### 🔹 Step 2: Apply Elimination Rules

Not all nouns become classes. Apply these **5 elimination rules**:

| Rule | Description | Example |
|------|-------------|---------|
| 1️⃣ **Redundant** | Multiple nouns referring to the same concept | "Member" and "User" → Keep one |
| 2️⃣ **Event/Operation** | Actions rather than entities | "Search book" → This is a method |
| 3️⃣ **Outside Scope** | External to the system | "Library building" → Not part of software |
| 4️⃣ **Meta-language** | Words describing language itself | "People using system" → Use "Member" instead |
| 5️⃣ **Attribute** | Property of a class, not a class itself | "ISBN" → Attribute of Book |

#### 🔹 Step 3: Identify Verbs

Verbs connected to nouns reveal **responsibilities** (methods) of each class.

---

## 🃏 CRC Cards Method

**CRC Cards** (Class-Responsibility-Collaboration) are a powerful tool for understanding and documenting class behavior in object-oriented systems.

### What is a CRC Card?

A CRC card is a **4 × 6 inch index card** divided into three sections:
```
┌─────────────────────────────────────┐
│         CLASS NAME                  │
├──────────────────┬──────────────────┤
│  Responsibilities│  Collaborators   │
│                  │                  │
│  - Task 1        │  - Class A       │
│  - Task 2        │  - Class B       │
│  - Task 3        │                  │
│                  │                  │
└──────────────────┴──────────────────┘
```

### CRC Card Components

| Section | Description | Example |
|---------|-------------|---------|
| **Class** | Name of the class | `Book`, `Member`, `Order` |
| **Responsibilities** | Actions the class performs | `borrow()`, `validate()`, `calculate()` |
| **Collaborators** | Other classes it interacts with | `Member` collaborates with `Book` |

### Purpose of CRC Cards

✅ **Define class responsibilities** - What each class should do  
✅ **Identify collaborations** - How classes work together  
✅ **Facilitate team discussion** - Physical cards enable group analysis  
✅ **Bridge analysis and design** - Connect requirements to implementation  

---

## 🏗️ Types of Analysis Classes

In Object-Oriented Analysis, classes are categorized into three main types based on their role in the system.

### Class Categories

| Type | Purpose | Examples | Key Characteristics |
|------|---------|----------|---------------------|
| **Entity Classes** | Store core data | `Book`, `Customer`, `Product` | Represent real-world entities |
| **Boundary Classes** | Handle external interactions | `LoginForm`, `PaymentGateway` | Interface with users/systems |
| **Control Classes** | Manage business logic | `OrderProcessor`, `InventoryManager` | Coordinate workflows |

---

### 1️⃣ Entity Classes

**Definition:** Classes that represent core data or information the system manages.

**Key Characteristics:**
- Represent real-world entities
- Store persistent data
- Have attributes that describe the entity
- Typically survive throughout the system lifecycle

**Library System Examples:**
- `Book` - stores book information
- `Member` - stores member details

**E-Commerce System Examples:**
- `Product` - stores product catalog
- `Customer` - stores customer profiles
- `Order` - stores order information

---

### 2️⃣ Boundary Classes

**Definition:** Classes that act as interfaces between the system and external entities (users, other systems, devices).

**Key Characteristics:**
- Handle input/output operations
- Manage user interface components
- Connect to external systems
- Act as the system's communication layer

**Library System Examples:**
- `LoginForm` - handles user authentication UI
- `PrintReport` - generates printed output

**E-Commerce System Examples:**
- `ShoppingCartPage` - displays cart interface
- `PaymentGateway` - connects to payment processor
- `ShippingNotification` - sends tracking emails

---

### 3️⃣ Control Classes

**Definition:** Classes that manage the flow of activity and coordinate interactions between other classes.

**Key Characteristics:**
- Implement business rules and logic
- Coordinate class interactions
- Control transaction flow
- Don't store persistent data themselves
- Manage use case execution

**Library System Examples:**
- `ReservationHandler` - manages book reservations
- `OverdueNoticeGenerator` - handles late return notifications

**E-Commerce System Examples:**
- `InventoryManager` - tracks stock levels
- `OrderProcessor` - coordinates order workflow
- `PaymentVerifier` - validates payment transactions

---

## 📊 Summary

### Key Takeaways

| Concept | Purpose | Benefit |
|---------|---------|---------|
| **Noun-Verb Analysis** | Identify classes and methods | Systematic class discovery |
| **5 Elimination Rules** | Filter candidate classes | Focus on core entities |
| **CRC Cards** | Document responsibilities | Clear class definitions |
| **Entity Classes** | Store system data | Core business objects |
| **Boundary Classes** | Handle interactions | Clean system interfaces |
| **Control Classes** | Manage workflows | Organized business logic |

### The OOA Process
```
Requirements → Noun-Verb Analysis → CRC Cards → Class Categories → Design
```

### Why Use These Techniques?

✅ **Systematic approach** - Structured method for identifying classes  
✅ **Clear documentation** - CRC cards provide easy-to-understand class definitions  
✅ **Better organization** - Class categories help organize system architecture  
✅ **Team collaboration** - Physical cards enable effective group discussions  
✅ **Foundation for design** - Smooth transition from analysis to design phase  

---

## 📚 References

1. SLIIT - SE1020 Object-Oriented Programming Lecture Slides
2. [Martin Fowler - UML Distilled](https://martinfowler.com/)
3. [CRC Cards - Ward Cunningham](http://c2.com/doc/oopsla89/paper.html)
4. Object-Oriented Analysis and Design with Applications - Grady Booch

---

<p align="center">
  <strong>Master OOA to build better software! 🚀</strong><br>
  <em>Understanding the problem domain is the first step to elegant solutions</em>
</p>
