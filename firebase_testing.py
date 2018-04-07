from firebase import firebase

firebase = firebase.FirebaseApplication('https://statusquo-3964e.firebaseio.com/', None)

result = firebase.post('/accidents' ,{'level':'1'})
print(result)
