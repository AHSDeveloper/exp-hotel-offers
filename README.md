Hotel Offers Web Application
=============================

In the following the details about Hotel Offers Web Application, developed by Ali Hassonah

What's inside?
--------------

A web application built usig Java programming language, Maven is a software project management.


Steps to install local
----------------------
1.	Install Java JDK.
2. 	Install Maven.
3. 	Install any IDE such as NetBeans, Eclipse  (prefered Netbeans because the application built using it).
4. 	Install Tomcat (7 or later is prefered).
5.	Download (Clone) project from 'https://github.com/AHSDeveloper/exp-hotel-offers'
6.	From command line (cmd.exe) navigate to the project folder and run this command 'mvn package' so maven will create folder 'target' under the project folder.
7. 	Or open the project with the IDE and Build the application with dependancies (dependancies found in the pom.xml)
8.	To deploy the application chose one of the following:
	
	a. from command line (cmd.exe)
		-	go to project location and run the follwing command	'java $JAVA_OPTS -jar target/dependency/webapp-runner.jar --port $PORT target/*.war'
			which will start webapp runner which will launch the war file.
	
	b. From the IDE run tomcat and deploy the application on it.
	
	c. From Tomcat folder:
		-	Edit config\folder\tomcat-users.xml to create user with username and password and assign 'manager-gui' role to it.
		-	On Windows go to System Properties -> Environment Variable -> Create variable 'JAVA_HOME' and it's value is the path of jdk in your system -> OK.
		-	Go to bin folder and run startup.bat
		-	open browser and navigate to localhost:[port number found in config\folder\server.xml under connector fpr protocol HTTP]/manager
		-	Enter username and password you created in the tomcat-users.xml
		-	Deploy the war file which located in the folder project under folder 'target'
		