# Low Coupling Example

## Example Overview

Both the High and Low Coupling examples are based around the EmailSender class. In the High Coupling example, clients (Client1, Client2, Client3, and Client4) must call a series of public methods found in EmailSender in a specific order if they are to successfully send an email. These steps including validating each part of the input, preparing an Email object, and finally sending the email. This quickly leads to very high coupling between the clients and EmailSender.

In order to fix this issue, the Low Coupling example presents a single method as its interface. The sendEmail method validates input, prepares an Email object, and sends the email, all internally. This dramatically reduces the redundant code found in the clients.

## Exercise - Potential Solutions

The Exercise for this example consists of two simple free response questions.

1. The Low Coupling example succeeds in reducing coupling by the methods described above. That is, it reduces its complicated interface to a single, logical method, reducing redundant code.

2. The Low Coupling example may have some drawbacks. Namely, clients of EmailSender may not be able to determine which element of the input is invalid in the case of an error. However, a client using the High Coupling EmailSender could potentially deal with invalid input more easily, as they could determine which piece of input was invalid, **before** calling sendEmail.