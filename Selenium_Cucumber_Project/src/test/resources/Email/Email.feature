Feature: Email feature 
This feature includes scenario that would sign in and send the email.

Scenario: Sign in
Given the tester is on the sign in page
When tester clicks on sign in link   
And the tester enters firstname as "Aditi"
And the tester enters lastname as "Kadu"
And the tester inputs email address as "adt16aug@gmail.com"
And the tester enters username as "adikelearn16"
And the tester inputs password as "adi1234"
And the tester re-enters  password as "adi1234"
And the tester clicks on Register button
And the tester should see the message as Dear ADITI KADU
And the tester clicks on dropdown menu in top right corner
And the tester clicks on inbox link
And the tester clicks on Compose icon
And the tester enters "naveen naveen (naveen)" in sent to field
And the tester enters the subject field as "Hi For Testing"
And the tester enters the message
And the tester clicks on send message button
Then the tester can see the acknowledgement of message send








