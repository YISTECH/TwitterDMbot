# TwitterDMbot
bot to send a twitter message to a user as many times as you want. Only works with users, not groups. Work in progress.
# Note :
- Requires selenium
- chromdriver (if you want to use google chrome)
- geckodriver,(if you want to use firefox)
- works on Ubuntu/Mac

# How to install requirements

## FireFox : 
Head over to https://github.com/mozilla/geckodriver/releases
and download the respective gecko driver for your device and unzip it . Place it in the Selenium_Setup folder within the TwitterDmBot folder

## Google Chrome :

Head over to https://chromedriver.storage.googleapis.com/index.html?path=87.0.4280.88/
and download the chrome driver for your device and unzip the zip file. Place it in the Selenium_Setup folder within the TwitterDmBot folder

# Changes you will have to make(IMPORTANT) :
- open the project in eclipse IDE, and import the twitter spam folder.
- Once open, head over to src, under src, click the package, and open the twitter.java 
- On line 17, 
		System.setProperty("webdriver.gecko.driver","/home/yistech/Selenium_Setup/geckodriver");
   Change the second part to the path of the the geckodriver. It should look something like : 
   /home/youradminame/TwitterDmbot/Selenium_Setup/geckodriver
   
 - once you have done that, make sure to export it to runnable jar file. You can do that by clicking export
 under file in Eclipse-IDE, and clicking runnable jar file. Make sure to check mark the second line./
 Save the jar file to the TwitterDmBot folder
 
 ## JAVA :
 ```
 sudo apt-get install default-jdk
 ```
 
 
 # USAGE :
 Open Terminal, and type the following commands :
 To install git : 
 ```
 sudo apt-get install git
 ```
 - it should ask you for your admin password, enter the pass.
 
 cloning : 
 ```
 cd ~
 git clone https://github.com/YISTECH/TwitterDMbot.git
 ```
 To run the bot :
 ```
 cd TwitterDmBot/
 java -jar Twitter.jar
  ```
  ### INPUT FIELDS :
username of your acc : (enter your twitter username)

password of your acc : (enter your password of the twitter acc)

to who do you want to send the message : (username of the person you want to send the message)

content of the message : (what you want to type in the message)

how many times : (number of times you want to spam the message)

#### IF you liked this bot, make sure to follow me. Want to use this code, please credit me. 
