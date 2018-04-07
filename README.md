# Status Quo

Status Quo is an application based on an Android, our application uses API v21 and above. We are using Firebase which is a RealTime database which serves as the NoSQL database entity model.
The Firebase keeps looking for any change in the existing model to take decisions accordingly. It’s secure using its own authentication and sends notification using the Status Quo app.

[HardWare ReadMe.](https://github.com/HackBMU/hackbmu_statusquo/blob/master/Hardware.MD)

## Working

When the request is raised our algorithm checks for all registered users and notifies selected users using a push notification :- 
1.	The Helmet enabled with a Raspberry Pi 3 directly updates the Firebase to raise a request using Python v3 and are sending JSON object.
2.	Data of accident prone areas are collected and surveyed to mark on maps.  
3.	In case the battery dies, anyone with our app can anonymously raise a request from his/her location so that the ambulance reaches there.
4.	Authorized vehicles have a RFID tag and the receiver is placed on traffic lights controlled by an Arduino, so one can regulate traffic to minimise delay.
5.	For near future, technologies like Beacons, GSM, etc. can be used.

## Technologies 

StatusQuo uses these technologies:
1.	Java and Kotlin
2.	XML
3.	NodeJS 
4.	Firebase - Cloud Messaging, Realtime Database, Authentication, Storage.
5.  Python 3.6
6.  Firebase Rest API in Python.
7.  Raspberry Pi 3 GPIO.
8.  RF-ID tags and recievers.
9.  Arduino UNO R3.
10. JSON web tokens.
11. Google Text To Speech.
12. Python libraries like idna, chardet, urlib3, etc.

## Goals

1.  Reduce the number of on road deaths.
2.  Quick and independent response.
3.  Reduce time delays due to traffic flow.
4.  Extending the scope of a mere helmet.

## Future Scope

With internet connection becoming an essestial comodity, we feel that it must be used to maximum extent and if it is possible to save lives with it, nothing can be a more valued technology.

With integrating new technology into existing systems we do not overburden the present infrastructure. Thus, our product can be easily trickled down to even the lowest strata. 

1.  We will use **Zigbee wireless communication** for sending the details of the accidents to all the authorised sites. 
2.  We will use **AD-HOC technology** for better transmission in the areas where there is low internet connectivity.
3.  We will integrate **Bluetooth Low Energy** technology with the mobile.
4.  We will use **i-SIMs** for cheaper network connections.  

