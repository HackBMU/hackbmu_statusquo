# Readme for Hardware:

## Working of Raspberry Pi Device

The raspberry pi is installed within helmets. It communicates with StatusQuo app using WiFi (for the time being. It may be government installed public WiFi, mobile hotspot or JioFi portable hotspots. Eventually it'll use Bluetooth LE for less power consumption). The device, using internet, updates the Firebase database which is accessed by the app. The application further takes this change as trigger and generates a broadcast message. 

Another added funtionality we've used is RFID. RFID tags send out a fixed frequency and the reciever is governed by a Arduino. As RFIDs are issued, their number are known. Once one enters a valid RFID number, the traffic light changes accordingly to facilitate the traffic movement so as to reduce any sorts of delay due to stoppage, congestion, etc. 

## Specs and Tech Used

### Raspberry Pi

1.  SoC: Broadcom BCM2837
2.  CPU: 4× ARM Cortex-A53, 1.2GHz
3.  GPU: Broadcom VideoCore IV
4.  RAM: 1GB LPDDR2 (900 MHz)
5.  Networking: 10/100 Ethernet, 2.4GHz 802.11n wireless
6.  Bluetooth: Bluetooth 4.1 Classic, Bluetooth Low Energy
7.  Storage: microSD
8.  GPIO: 40-pin header, populated
9.  Ports: HDMI, 3.5mm analogue audio-video jack, 4× USB 2.0, Ethernet, Camera Serial Interface (CSI), Display Serial Interface (DSI)

### Arduino

1. Microcontroller: ATmega328P
2. Operating Voltage: 5V
3. Input Voltage (recommended): 7-12V
4. Input Voltage (limit): 6-20V
5. Digital I/O Pins:	14 (of which 6 provide PWM output)
6. PWM Digital I/O Pins: 6
7. Analog Input Pins: 6
8. DC Current per I/O Pin:	20 mA
9. DC Current for 3.3V Pin:	50 mA
10. Flash Memory:	32 KB (ATmega328P) of which 0.5 KB used by bootloader
11. SRAM:	2 KB (ATmega328P)
12. EEPROM: 1 KB (ATmega328P)
13. Clock Speed: 16 MHz
14. LED_BUILTIN: 13
15. Length:	68.6 mm
16. Width:	53.4 mm
17. Weight:	25 g

### Python Interface

The Raspberry Pi communicates with the firebase using python. The python communicates with the python using REST API of firebase which uses modules and libraries such as idna, chardet, urlib3 etc. 

The python communicates with the raspberry pi gpio pins using its RPIO API which uses various modules such as GPIO and various functions such as GPIO.setmode(), GPIO.cleanup(), GPIO.input() ,GPIO.setWarnings().
