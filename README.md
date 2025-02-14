<p align="center">
  <a href="" rel="noopener">
 <img src="https://i.imgur.com/AZ2iWek.png](https://swimlane.com/wp-content/uploads/2021-04-Common-API-Authentication-blog.png" alt="Project logo"></a>
</p>
<h3 align="center">Rent A CAR API</h3>

<div align="center">

[![Status](https://img.shields.io/badge/status-active-success.svg)]()
[![GitHub Issues](https://img.shields.io/github/issues/Loureiro32/JavaSpringBoot.svg)](https://github.com/Loureiro32/JavaSpringBoot/issues)
[![GitHub Pull Requests](https://img.shields.io/github/issues-pr/Loureiro32/JavaSpringBoot.svg)](https://github.com/Loureiro32/JavaSpringBoot/pulls)

</div>

---

<p align="center"> A Spring Boot API for managing products with MongoDB integration.
    <br> 
</p>

## 📝 Table of Contents

- [About](#about)
- [Getting Started](#getting_started)
- [Dependencies / Limitations](#limitations)
- [Build with](#tech_stack)
- [Authors](#authors)
- [Acknowledgments](#acknowledgments)

## 🧐 About <a name = "about"></a>

This project is a RESTful API built with Java and Spring Boot, designed to manage product data. It implements CRUD
operations for products and leverages MongoDB for data persistence. The API follows best practices for Spring Boot
development and provides a scalable foundation for building enterprise applications.

## ⛓️ Dependencies / Limitations <a name = "limitations"></a>

- Spring Web(Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded
  container.)
- MySQL Driver(MySQL JDBC driver.)
- Sping Data JPA(Persist date in SQL stores with Java Persistence API using Spring Data and Hibernate.).

## 🏁 Getting Started <aname = "getting_started"></a>

These instructions will get you a copy of the project up and running on your local machine for development and testing
purposes.
Prerequisites

Java 17 or higher
Maven
Mysql or other Sql you prefer
Your favorite IDE (IntelliJ IDEA, Eclipse, etc.)

Installing

1.Clone the repository

- Copygit clone https://github.com/Loureiro32/JavaSpringBoot.git

2.Navigate to the project directory

- Copycd JavaSpringBoot

3.Build the project

- Copymvn clean install

4.Run the application

- Copymvn spring-boot:run

The server will start on the default port 8080.

## 📡 API Endpoints <aname="api_endpoints"></a>

Some Examples Endpoints already exists in this API

- [GET api/v1/account]: Get all Accounts
- [GET /api/v1/account/{id}]: Get a specific Account
- [POST api/v1/account]: Create a new Account
- [PUT api/v1/account/{id}]: Update an existing Account
- [DELETE api/v1/account/{id}]: Delete a Account

## ⛏️ Built With <a name = "tech_stack"></a>

- [Java](https://www.mongodb.com/) - Programming Language
- [Spring Boot](https://expressjs.com/) - Server Framework
- [Mysql](https://vuejs.org/) - Database
- [Maven](https://nodejs.org/en/) - Dependency Management

## ✍️ Authors <a name = "authors"></a>

- [@Loureiro32](https://github.com/Loureiro32) - Development and maintenance

See also the list of [contributors](https://github.com/kylelobo/The-Documentation-Compendium/contributors)
who participated in this project.

## 🎉 Acknowledgments <a name = "acknowledgments"></a>

- Inspired by best practices in RESTful API design
