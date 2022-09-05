# Live Coding Session

This is the initial setup for a starting point for a live coding session.
Import this repo into IntelliJ or Eclipse and be prepared to wait for the Teams Call.
Make sure you are able to share screen so that we can see how you code.

## Business Requirements

We have the need to implement a leasing application to be able to administrate leasing contracts.

### Models

#### Leasing Contract

A leasing contract consists of the following properties:

* Contract Number
* Monthly Rate

#### Customer

A leasing contract is connected to one customer and a customer could have several leasing contracts.

A customer consists of the following properties:

* First name
* Last name
* Birthdate

#### Vehicle

A leasing contract is connected to one specific vehicle and a vehicle could only be connected to one contract at a time.

A vehicle consists of the following properties:

* Brand
* Model
* Model year
* Vehicle identification number when the vehicle is produced. During creation of contract it could be empty.
* Price

## Frontend Client Requirements

There is planned to implement a frontend which is using the backend over REST API. The planned frontend looks like as
follows.

### Contract Overview

![Contract Overview](/home/w9704/projects/private/live-coding/readme-assets/leasing-contract-wireframe.png)

There is planned to show a contract overview with some columns:

* Contract No
* Summary of the Customer
* Summary of the Vehicle
    * Brand
    * Model
    * In braces: Model year
* VIN if available or “-“ if empty
* Monthly Rate
* Vehicle Price
* Link to the Contract Details

### Customer Details

![Customer Details](/home/w9704/projects/private/live-coding/readme-assets/leasing-contract-wireframe-customer.png)

Edit mask to create/edit a customer.

### Vehicle

![Vehicle Details](/home/w9704/projects/private/live-coding/readme-assets/leasing-contract-wireframe-vehicle-details.png)

Edit mask to create/edit a vehicle.

### Leasing Contract

![](/home/w9704/projects/private/live-coding/readme-assets/leasing-contract-wireframe-contract.png)

Edit mask to create/edit a leasing contract.

## Task

* Implement a REST service backend to fulfil the business requirements derived from the planned frontend (see
  wireframes).
* The data should be persisted into a database.
* Model the entities for persistence.
* Write unit test if appropriate.

## Technical Constraints

The following technologies should be used:

* Java 11
* Spring Boot >= 2.5
* MySQL/MariaDB Database (locally dockerized)
* Gradle
* Flyway database migration to create the initial schema
* OpenAPI specification to generate server/client. 