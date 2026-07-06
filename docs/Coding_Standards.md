# Coding Standards & Development Rules

## Project Name

ParaBank_Automation

---

# Purpose

This project is designed as an Enterprise QA Automation Framework to simulate the architecture, workflow, and development practices followed in professional software organizations.

The objective is not only to automate ParaBank but also to create a framework that demonstrates practical experience in:

- Selenium WebDriver
- TestNG
- Cucumber BDD
- Rest Assured
- API Testing
- Database Validation
- Playwright
- Jenkins
- Git & GitHub
- CI/CD
- Enterprise Framework Design

---

# Rule 1 – Git Workflow (Locked)

Development must never happen directly on **main** or **develop**.

Workflow:

develop
│
└── feature/<feature-name>
        │
        ├── Development
        ├── Testing
        ├── Commit
        ├── Push
        └── Pull Request
                │
                ▼
             develop

Release:

develop
│
▼
main

---

# Rule 2 – One Feature = One Branch (Locked)

Every new feature must have its own branch.

Examples:

feature/framework-setup

feature/testng-setup

feature/selenium-setup

feature/restassured-setup

feature/login-module

feature/reporting

No branch should contain multiple unrelated features.

---

# Rule 3 – Commit Standards (Locked)

Every commit should represent one logical change.

Examples:

feat: integrate TestNG

feat: integrate Selenium

feat: implement DriverFactory

feat: create LoginPage

fix: resolve login synchronization issue

docs: update framework architecture

Avoid commit messages like:

Final Changes

Updated Code

Misc Fixes

Testing

---

# Rule 4 – Every Feature Must Build (Locked)

Before every commit execute:

mvn clean test

No feature should be committed if the project does not build successfully.

---

# Rule 5 – Every Feature Must Be Verified (Locked)

Every implementation must be verified before committing.

Examples:

TestNG → Execute TestNG test

Selenium → Execute browser test

API → Execute API test

Database → Execute SQL validation

Reports → Generate report

No unverified code should be committed.

---

# Rule 6 – Documentation First (Locked)

Every major architectural decision must be documented.

Documentation is stored under:

docs/

Examples:

Framework Architecture

Branching Strategy

Coding Standards

Learning Notes

Project Roadmap

---

# Rule 7 – Enterprise Naming Convention (Locked)

Packages

com.harshad.parabank

Classes

DriverFactory

ConfigReader

LoginPage

TransferFundsPage

RegisterPage

Avoid abbreviations.

Incorrect:

DrvMgr

CfgUtil

PgObj

---

# Rule 8 – Single Responsibility Principle (Locked)

Every class should have one responsibility.

Example:

DriverFactory

Only creates browser instances.

ConfigReader

Only reads configuration.

LoginPage

Only handles Login Page actions.

No utility class should perform multiple unrelated responsibilities.

---

# Rule 9 – Incremental Development (Locked)

Every implementation follows:

Understand

↓

Implement

↓

Verify

↓

Commit

↓

Push

↓

Merge

No large code dumps.

---

# Rule 10 – Enterprise First (Locked)

Whenever multiple implementation approaches exist:

Tutorial Approach

Enterprise Approach

Always prefer the Enterprise Approach unless unnecessary complexity is introduced.

---

# Rule 11 – Automation Project Structure (Locked)

This repository represents an Automation Framework.

Therefore:

All automation Java code will be maintained under:

src/test/java

This includes:

Base Classes

Page Objects

Utilities

API Clients

Database Utilities

Listeners

Runners

Hooks

Step Definitions

Smoke Tests

Regression Tests

UI Tests

API Tests

Database Tests

Shared configuration files may remain under:

src/main/resources

---

# Rule 12 – Branch Completion Criteria (Locked)

A feature branch is complete only when:

✓ Code completed

✓ Code reviewed

✓ mvn clean test successful

✓ Feature verified

✓ Commit completed

✓ Branch pushed

✓ Pull Request created

✓ Merged into develop

---

# Rule 13 – Professional Folder Structure (Locked)

The project structure should remain clean and modular.

No duplicate utilities.

No duplicate page objects.

No duplicate API clients.

Every package should have a single purpose.

---

# Rule 14 – Learning Objective (Locked)

The objective is not simply to complete automation.

Every implementation should be understandable and explainable during technical interviews.

Every design decision should answer:

"Why is this implemented this way?"

If the reasoning cannot be explained clearly, the implementation should be reconsidered.

---

# Rule 15 – Framework Philosophy (Locked)

This project should resemble an Enterprise Automation Framework rather than a tutorial project.

Priority order:

1. Maintainability

2. Readability

3. Reusability

4. Scalability

5. Simplicity

---

# Rule 16 – Definition of Done (Locked)

Every completed feature must satisfy:

✓ Code Compiles

✓ Tests Pass

✓ No Build Errors

✓ Git History Updated

✓ Documentation Updated (if applicable)

✓ Feature Ready for Merge

Only then is the feature considered complete.

---

These rules are considered permanent for the lifetime of this project unless there is a strong architectural reason to revise them.