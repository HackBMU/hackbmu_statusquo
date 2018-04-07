# Status Quo

Status Quo is an application based on an Android, where Android Model uses API v21 and above. A Google Firebase serves as the NoSQL database entity model.
The Firebase is a realtime database that keeps looking for any change in the existing model to take decisions accordingly. It’s secure using its own authentication and sends notification using the Status Quo app.

# Working

When the request is raised our algorithm checks for all registered users and notifies selected users using a push notification: - 
1.	The Helmet enabled with a raspberry Pi directly updates the Firebase to raise a request
2.	Data of accident prone areas are collected and surveyed to mark on maps.  
3.	In case the battery dies, anyone with our app can anonymously raise a request from his/her location so as the ambulance reaches there.
4.	Authorized vehicles have a RFID tag and the receiver is placed on traffic lights controlled by an Arduino, so one can regulate traffic to minimise delay.
5.	For near future, technologies like Beacons, GSM, etc. can be used.

# Technologies 

StatusQuo uses these technologies:
1.	Java 
2.	XML
3.	NodeJS
4.	Firebase


