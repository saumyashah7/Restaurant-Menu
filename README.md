## **Restaurant-Menu** ##

Restarurant menu is a simple web application developed to demonstrate the architecture of a Model-View-Controller(MVC) design pattern in JAVA. Model has the schema for the menu class and all the getter and setter methods for the same. Controller handles the flow of control from one jsp page to another. Java Server Pages(JSP) provides the view to the webapplication.

### **Installation** ###

It is recommended that the project is run on eclipse which can be downloaded from https://www.eclipse.org/downloads/ . Also the project is developed and ran on windows 64 bit machine so it is recommnded to use simillar machine to avoid configuration conflicts.

1. #### Clone the project directory: ####
```
git clone https://github.com/saumyashah7/Restaurant-Menu.git
```

2. #### Import the project in eclipse by starting eclipse and then clicking: ####
*File Menu -> Import... -> General -> Existing Projects into Workspace -> [Enter Path of the downloaded repository in "Select root directory"] -> Finish.*

3. #### Once project is imported, add JRE and servlet jar if they are missing in libraries. Ensure that jdk-13.0.1 is installed before that ####
*Right click on the project name(Restaurant) in Package Explorer -> Build Path -> Configure Build Path -> Libraries -> Add Library... -> JRE System Library -> Next -> Workspace default JRE(or the jdk of your choice) -> Finish -> Add External JARs... -> [Path of servelet .jar file from the downloaded repository of this project under the folder name javax.servlet.jar] -> Open -> Apply and close*

4. #### Move apache folder from the downloaded repository to the different directory before buiilding the project. ####

5. #### Clean and Build project ####
* Project Menu -> Clean... -> Check "Restaurant" -> Clean*
* Right click on Project name in Package Explorer -> Build Project*

### **Run Project** ###

Once project is built without errors, run the project using Apache Tomcat server which is recently moved from project repository.

*Right click on menuselection.jsp under WebContent -> Run As -> Run on Server -> Manually define a new server -> Tomcat v8.5 Server -> Next -> [Path of Apache folder for "Tomcat installation directory"] -> Finish*

If there are no errors, access the page in you browser using: http://localhost:8080/Restaurant/menuselection.jsp
