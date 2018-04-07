# Readme for Hardware:

# Working of Raspberry Pi Device

The raspberry pi is installed within helmets. It communicates with StatusQuo app using WiFi (for the time being. It may be government installed public WiFi, mobile hotspot or JioFi portable hotspots. Eventually it'll use Bluetooth LE for less power consumption). The device, using internet, updates the Firebase database which is accessed by the app. The application further takes this change as trigger and generates a broadcast message. 

Another added funtionality we've used is RFID. RFID tags send out a fixed frequency and the reciever is governed by a Arduino. As RFIDs are issued, their number are known. Once one enters a valid RFID number, the traffic light changes accordingly to facilitate the traffic movement so as to reduce any sorts of delay due to stoppage, congestion, etc. 

# Specs and Tech Used

# Raspberry Pi

SoC: Broadcom BCM2837
CPU: 4× ARM Cortex-A53, 1.2GHz
GPU: Broadcom VideoCore IV
RAM: 1GB LPDDR2 (900 MHz)
Networking: 10/100 Ethernet, 2.4GHz 802.11n wireless
Bluetooth: Bluetooth 4.1 Classic, Bluetooth Low Energy
Storage: microSD
GPIO: 40-pin header, populated
Ports: HDMI, 3.5mm analogue audio-video jack, 4× USB 2.0, Ethernet, Camera Serial Interface (CSI), Display Serial Interface (DSI)

# Arduino

Microcontroller: ATmega328P
Operating Voltage: 5V
Input Voltage (recommended): 7-12V
Input Voltage (limit): 6-20V
Digital I/O Pins:	14 (of which 6 provide PWM output)
PWM Digital I/O Pins: 6
Analog Input Pins: 6
DC Current per I/O Pin:	20 mA
DC Current for 3.3V Pin:	50 mA
Flash Memory:	32 KB (ATmega328P) of which 0.5 KB used by bootloader
SRAM:	2 KB (ATmega328P)
EEPROM: 1 KB (ATmega328P)
Clock Speed: 16 MHz
LED_BUILTIN: 13
Length:	68.6 mm
Width:	53.4 mm
Weight:	25 g