# High and Low Coupling Example in Java

## Description
* Both High (bad) and Low (good) Coupling is reviewed in this example and exercise.
* The goal is always to minimize Coupling:
  * We want to maximize cohesion and minimize coupling
* Classes frequently need to be modified:
  * Classes should be written in a way that changing one class is not likely to break other parts of the code
  * Design your classes so that they can handle change
* Both the High and Low Coupling examples are based around the `EmailSender` class.
* Start with High Coupling example
  * Look at "High Coupling (bad) Example" and "Run the High Coupling (bad) Example Program" sections below
* Move on to Low Coupling example
  * Look at "Low Coupling (good) Example" and "Run the Low Coupling (good) Example Program" section below

## High Coupling (bad) Example
* You are not required to do any work, but encouraged to run the code and look at the implementation.
* Can you identify the problem(s)?
* Hint: 
  * Look at `Client1.java`, `Client2.java`, `Client3.java`, `Client4.java`
  * What do you see in common among these classes?
  * How can it be improved?
  * Each class calls series of public methods found in `EmailSender` in a specific order to send an email:
    * Validating each part of the input
    * Preparing an Email object
    * Sending the email
  * Leads to very high coupling between the clients and `EmailSender`
* Start with `HighCoupling/HighCoupling.java` file.

### Run the High Coupling (bad) Example Program
To execute high coupling example program from command line, please run the following commands:

```
cd HighCoupling
javac HighCoupling.java
java HighCoupling
```

## Low Coupling (good) Example
* Low Coupling example fixes the problem was presented earlier. 
* It uses a single method `sendEmail()` as its interface and does everything internally:
  * Validates input
  * Prepares an Email object
  * Sends the email
* This dramatically reduces the redundant code found in the clients.
* Please fill in the `____________________`  blanks to make the program run successfully to follow Low Coupling.
* Check each file for blanks.
* Enter filled in blanks into Google Doc Exercise.
* Start with `LowCoupling/LowCoupling.java` file.

### Run the Low Coupling (good) Example Program
To execute low coupling example program from command line, please run the following commands:

```
cd LowCoupling
javac LowCoupling.java
java LowCoupling
```

## Expected Output
Upon executing either of the program, you should see identical output for both as follows:

```
Validating Address...
Validating Recepient...
Validating Header...
Validating Body...
Sending Email: Subject: Important Update 1
Email: "Subject: Important Update 1" was sent successfully!
Validating Address...
Validating Recepient...
Validating Header...
Validating Body...
Sending Email: Subject: Important Update 2
Email: "Subject: Important Update 2" was sent successfully!
Validating Address...
Validating Recepient...
Validating Header...
Validating Body...
Sending Email: Subject: Important Update 3
Email: "Subject: Important Update 3" was sent successfully!
Validating Address...
Validating Recepient...
Validating Header...
Validating Body...
Sending Email: Subject: Important Update 4
Email: "Subject: Important Update 4" was sent successfully!
```