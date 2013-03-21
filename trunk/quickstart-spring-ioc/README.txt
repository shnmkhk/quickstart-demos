This is to demonstrate Spring IOC (Inversion of Control) - Included with both Constructor and Setter Injection mechanisms in a tiny java application.

Here you go !!!

Step 1: Get dependent jars to your local repo

	Run mvn dependency:resolve command to get the required spring and junit dependencies	

Step 2: Make the application to be eclipse compatible (Required only if you wish to run it from Eclipse IDE) 

	Run mvn eclipse:eclipse command to make this app eclipse compatible.

Step 3: Execute the application

	Run mvn clean compile exec:java -Dexec.mainClass=org.rabbit.spring.demos.Main