import RPi.GPIO as GPIO
from time import sleep
import datetime
from firebase import firebase

import urllib2, urllib, httplib
import json
import os 
from functools import partial

GPIO.setmode(GPIO.BCM)
GPIO.cleanup()
GPIO.setwarnings(False)

# Buttons
GPIO.setup(18, GPIO.IN, pull_up_down=GPIO.PUD_UP)

firebase = firebase.FirebaseApplication('https://statusquo-3964e.firebaseio.com/')

while True:
    input_state = GPIO.input(18)
    if input_state == False:
        user_id = "FID"
        result = firebase.post('/accidents/' , user_id)
	







