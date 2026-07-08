I like this idea because it turns the project into a **learning journal**, not just a code repository.

From today onwards, after every meaningful session, I'll provide a **Learning Summary** in the same format. It will cover:

* Automation Framework
* Selenium/Cucumber
* Java Concepts
* Enterprise Perspective
* Interview Notes

---

# 📘 Automation Framework Learning Summary (Till Date)

**Project:** ParaBank Automation Framework

**Learning Phase:** Framework Foundation + Login Module Planning

---

# Module 1 - Automation Framework Fundamentals

## What is an Automation Framework?

### Concept

An automation framework is a predefined structure that provides reusable components, coding standards, project organization, and execution mechanisms for writing automated tests.

### Why do we need it?

Without a framework:

* Code becomes duplicated.
* Tests are difficult to maintain.
* Scaling automation becomes difficult.

A framework provides:

* Reusability
* Maintainability
* Scalability
* Standardization

### Enterprise Usage

Every organization builds or adopts an automation framework to ensure all automation engineers follow the same standards.

### Interview Answer

> An automation framework is a reusable architecture that standardizes test automation by separating configuration, test logic, utilities, reporting, and execution. It improves maintainability, scalability, and collaboration among QA engineers.

---

# Module 2 - Maven

### Concept

Maven is a Build Automation Tool.

### Why do we use Maven?

It manages:

* Dependencies
* Build Lifecycle
* Plugins
* Test Execution

### Enterprise Usage

Almost every Java automation project uses Maven.

### Commands Learned

```bash
mvn clean

mvn test

mvn clean test
```

### Interview Question

Why Maven instead of manually adding JAR files?

Answer:

Because Maven automatically downloads dependencies, resolves versions, and provides a standardized build process.

---

# Module 3 - Git

## Purpose

Version Control.

### Commands Learned

```bash
git status

git branch

git checkout

git checkout -b

git add .

git commit

git push

git pull

git merge
```

### Branching Strategy

```text
main

↓

develop

↓

feature/*
```

### Enterprise Learning

Never develop directly on `main` or `develop`.

Always use Feature Branches.

---

# Module 4 - Selenium

## Purpose

Browser Automation.

### What Selenium Does

* Opens browser
* Finds elements
* Performs actions
* Reads information
* Validates results

---

# Module 5 - TestNG

### Purpose

Test Execution Framework.

### Responsibilities

* Execute tests
* Group tests
* Prioritize tests
* Assertions
* Reports

### Important Learning

TestNG **does not automate browsers**.

Selenium automates.

TestNG manages execution.

---

# Module 6 - Cucumber BDD

## Purpose

Bridge between Business and Automation.

### Feature File

A Feature File describes system behaviour in plain English using Gherkin syntax.

Example:

```gherkin
Feature: Login

Scenario: Successful Login

Given User launches ParaBank

When User enters valid credentials

Then User should login successfully
```

### Why Feature Files?

Business Analysts, Product Owners, QA Engineers, and Developers can all understand the scenarios without reading Java code.

### Keywords

#### Feature

High-level business functionality.

Example:

```
Feature: Login
```

---

#### Scenario

One business flow.

```
Scenario: Successful Login
```

---

#### Background

Common preconditions shared by multiple scenarios.

Example:

```gherkin
Background:

Given User launches application
```

Instead of repeating the same step in every scenario.

---

#### Given

Represents the **precondition**.

Example:

```
Given User is on Login Page
```

---

#### When

Represents the **action**.

Example:

```
When User enters username
```

---

#### Then

Represents the **validation**.

Example:

```
Then User should login successfully
```

---

#### And

Used for additional actions or validations.

---

# Module 7 - Page Object Model (POM)

## Purpose

Separate Selenium code from test logic.

Instead of writing Selenium code inside tests:

```java
driver.findElement(...)
```

We move it to:

```java
LoginPage
```

Test becomes:

```java
loginPage.login(...)
```

### Benefits

* Reusability
* Maintainability
* Cleaner Tests

---

# Module 8 - ConfigReader

### Purpose

Read project configuration from:

```
config.properties
```

Example:

```properties
browser=chrome

url=https://...

username=...

password=...
```

### Benefit

Avoid hardcoding values.

---

# Module 9 - DriverFactory

### Purpose

Central place to create browser instances.

Instead of:

```java
new ChromeDriver();
```

everywhere,

we call:

```java
DriverFactory.getDriver();
```

---

# Module 10 - Smoke Test

### Purpose

Verify that the framework works.

Current Smoke Flow:

```
Launch Browser

↓

Navigate to URL

↓

Verify Page Title

↓

Close Browser
```

---

# Module 11 - Java Concepts Used

## Class

```java
public class LoginPage
```

Represents a blueprint.

---

## Object

```java
LoginPage loginPage
```

Instance of a class.

---

## Constructor

```java
public LoginPage(WebDriver driver)
```

Used to initialize the Page Object.

---

## Encapsulation

```java
private WebDriver driver;
```

Data hiding.

---

## Method

```java
login()
```

Represents a reusable action.

---

## Method Invocation

```java
loginPage.login();
```

Calling a method.

---

## this Keyword

```java
this.driver = driver;
```

Refers to the current object's instance variable.

---

# Module 12 - Enterprise Architecture

Current Architecture:

```text
Feature File

↓

Step Definition

↓

Page Object

↓

DriverFactory

↓

Selenium
```

---

# Module 13 - Enterprise Git Workflow

```text
develop

↓

feature/login-module

↓

Development

↓

Testing

↓

Commit

↓

Push

↓

Merge

↓

develop
```

---

# Module 14 - Enterprise QA Workflow

Current Process:

```text
Requirement

↓

Business Rules

↓

Feature File

↓

Step Definition

↓

Page Object

↓

Automation

↓

Execution

↓

Bug Fix

↓

Commit

↓

Merge
```

---

## 🎯 Final Learning

The most important thing we've learned so far is **how an enterprise automation framework is layered**.

```text
Feature File (Business Layer)
        │
        ▼
Step Definition (BDD Layer)
        │
        ▼
Page Object (UI Interaction Layer)
        │
        ▼
Framework Components
        ├── DriverFactory
        ├── ConfigReader
        ├── Base Classes
        └── Utilities
        │
        ▼
Selenium WebDriver
        │
        ▼
Browser
```

This diagram is worth remembering because it answers one of the most common interview questions:

> **"Can you explain the architecture of the automation framework you built?"**

By the end of this project, you'll be able to walk an interviewer through each layer, explain its responsibility, the Java concepts used, and why that design makes the framework maintainable and scalable. That ability is often more valuable than simply writing Selenium code.
        ---------------------------------------------------------------------

July 07, 2026.

Automation Concept
A Feature File is executable business documentation.
Background is for common preconditions shared by multiple scenarios.
Given → When → Then maps to Precondition → Action → Validation.
Enterprise Usage
Business teams review Feature Files.
Automation engineers implement the corresponding Step Definitions.
Feature Files become living documentation because they are executed as part of the test suite.
Interview Question

Q: What is the difference between a Feature File and a TestNG test?

Answer:

A Feature File describes the expected business behavior in Gherkin and is readable by technical and non-technical stakeholders.
A TestNG test is Java code that manages test execution, grouping, prioritization, assertions, and reporting.
In our framework, Cucumber defines the behavior, while TestNG provides the execution engine and reporting.

Maven Dependency

A dependency tells Maven to download an external library from a repository and add it to your project's classpath.

In this step, we're using XML to declare dependencies, not introducing any new Java language concepts.

Interview Question

Q: Why do we use cucumber-testng if we're writing Feature Files?

Answer:

Cucumber defines the test scenarios using Gherkin, but it still needs a test execution engine. In our framework, we use TestNG as the execution engine because it provides test execution management, grouping, reporting, and integrates well with Maven. Cucumber and TestNG complement each other rather than replacing one another.

