# Coupling Example

* TODO: Convert Example to Exercise

## Description
This example consists of two versions of the same program - focused around a theoretical email sending service. Each version consists of an EmailSender class (representing a complex library), a Main class (that runs the example), and 4 clients which use the EmailSender.

The email sender completes several tasks: validating the sender, recepient, header, and body, followed by preparing and finally sending the email itself. 

The first version of this program is one with High Coupling. Each of those steps is "implemented" in a separate public method, each of which must be called by every client. This, as expected, leads to excessive code redundancy, and would require any changes to be applied to each of the clients.

The second version of this program has Low Coupling. That is, it has a single public facing method which all of the clients call. The same code that in the prior version each client would have to implement is instead implemented internally in this single method. This change would allow for modifications to be made to only a single location, and greatly reduces code redundancy.

## Ways to convert to exercise

* Fill-in-the-blank: Delete a few pieces of code (such as the use of header and body validation methods) in both versions. Students, when filling these in, will quickly see that the High Coupling version requires writing the same code in every client. The Low Coupling version will only require the code to be filled in once!

* Make a change: Instructions would tell students to make a single change (for example, removing the need to validate the From address) in both examples. They will quickly see the redundant code changes necessary to change anything in the High Coupling version, as compared to the single change needed for the Low Coupling version.
