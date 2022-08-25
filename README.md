# CalculatorWithCucumberFrameWork
## Here is the project structure
![image](https://user-images.githubusercontent.com/100432135/186494560-e4da8385-ad32-4fe0-af99-bafac96ba2ac.png)

## Explanations
I have designed the framework with POM Architecture in CucumberFrameWork.First of all I created four packages under Java directory such as pages,runners,stepdefinitions
,utilities.And then created one resources directory ,one configuration.properties file
## pages
Under pages package , CalculationPage which is involved pagefactory and locators of the website These are used to invoke from stepdefinitions 
![image](https://user-images.githubusercontent.com/100432135/186495889-159b4670-4cdb-401a-a2ec-f053e4aece55.png)
## runners
Under runners package , TestRunner class which is used to run all tests by using "mvn clean verify" command by pressing ctrl+enter in the terminal
![image](https://user-images.githubusercontent.com/100432135/186496990-149751b0-1e3d-4c63-b893-a84900faf7f1.png)
### See How to used terminal



https://user-images.githubusercontent.com/100432135/186603704-7eb7b1e8-3078-4d1e-9888-73e20c3dfcc7.mp4



## stepdefinitions
Under stepdefinitions,There are CalculatorStepDefinitions and Hooks classes.
### CalculatorStepDefinitions
This class consists of methods which are tested step by step

![image](https://user-images.githubusercontent.com/100432135/186497916-e5d44cf0-0f28-4f7c-8072-36d2ab2c05e2.png)
### Hooks
This class is used for taking screenshots automaticaly when test is failed
![image](https://user-images.githubusercontent.com/100432135/186498389-ff2565d2-d561-4d9f-aa72-48d789217d05.png)
## utilities
Under utilities package;ConfigurationReader,Driver and ReusableMethods
### ConfigurationReader
This class is used for reading the infos in configuration.properties file
![image](https://user-images.githubusercontent.com/100432135/186498983-c8166262-a0c3-4f27-94ca-0ac31198e0ba.png)
### Driver
This class is used for getting browsers in short way by using ConfigurationReader
![image](https://user-images.githubusercontent.com/100432135/186499721-13e1e993-e1a5-4a74-b6e7-5641175a6212.png)
### ReusableMethods
This class is used for invoking reusable methods in a shortway
![image](https://user-images.githubusercontent.com/100432135/186500128-5986cb5d-ca7a-41e7-bdca-0c1d250d0aae.png)
## resources
This class have a features directory under it.The features directory have cucumber files in it.These files have steps of tests 
![image](https://user-images.githubusercontent.com/100432135/186500742-fdfb7ed3-a53b-45c7-9d63-2a2dc33b2419.png)
## target
This directory have some kinds of reports which are shown in the picture below.These reports are automatically created after running of TestRunner class

![image](https://user-images.githubusercontent.com/100432135/186501494-571331ac-9a13-426f-9e1e-14869e20b551.png)

When you open the reports you are gonna see smart cucumber pages as shown in the video


https://user-images.githubusercontent.com/100432135/186604917-6232ebc3-5f0f-4cf0-8226-923ff0968750.mp4



## configuration.properties
This file is used by ConfigurationReader for invoking key values of browsers,passwords or other infos

![image](https://user-images.githubusercontent.com/100432135/186503459-5fcf3603-f5c9-4826-b9e2-ae9dbddde343.png)

