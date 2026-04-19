# Spring Core & Dependency Injection (IoC)

## Description
This repository contains console-based Java applications demonstrating the core principles of the Spring Framework, specifically Inversion of Control (IoC) and Dependency Injection using XML configuration files.

## Concepts Demonstrated
* **Inversion of Control (IoC):** Object creation and lifecycle managed by the Spring Container.
* **XML Bean Configuration:** Defining beans and injecting literal values using `<property>` and `<constructor-arg>`.
* **Autowiring:** Using the `@Autowired` annotation to automatically resolve object dependencies.
* **Polymorphism in Spring:** Injecting different child classes (e.g., `Espresso`, `Latte`, `Hamd`, `Naat`) into generic parent references (`Coffee`, `Kalam`).

## Features
* **Coffee Shop Simulation:** Instantiates different coffee types with predefined prices and sizes using Setter Injection.
* **Media Player Simulation:** Instantiates audio tracks (Hamd/Naat) using Constructor Injection and Autowiring.

## Setup & Configuration
1. Ensure Maven is installed.
2. The `pom.xml` handles the required `spring-core`, `spring-context`, and `spring-beans` dependencies.

## How to Run
Simply execute `CoffeeShopApp.java` or `Mp3App.java` as standard Java applications. Spring will read the `coffee-beans.xml` and `mp3-beans.xml` files from the classpath and output the injected data to the console.
