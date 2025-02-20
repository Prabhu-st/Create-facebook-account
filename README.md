# Facebook Account Creation Automation with Java Selenium

## Overview
This project automates the process of creating a Facebook account using Selenium WebDriver with Java. It demonstrates how to interact with web elements such as input fields, buttons, and dropdowns.

## Prerequisites
Before running this automation script, ensure you have the following installed:

- **Java JDK** (Version 8 or later)
- **Eclipse/IntelliJ IDEA** (or any Java IDE)
- **Maven** (for managing dependencies)
- **Selenium WebDriver**
- **WebDriver for your browser** (ChromeDriver, GeckoDriver, etc.)
- **TestNG** (Optional for test execution)

## Installation Steps

1. **Clone the repository**
   ```sh
   git clone https://github.com/your-username/facebook-signup-automation.git
   cd facebook-signup-automation
   ```

2. **Set up Maven dependencies**
   Add the following dependencies to your `pom.xml` file:
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.8.0</version>
       </dependency>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.4.0</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
   ```

3. **Download and set up the WebDriver**
   - Download ChromeDriver from (https://chromedriver.chromium.org/downloads) and place it in your project directory.
   - Ensure the WebDriver path is correctly set in your script.

## Running the Automation Script

1. Open the project in your preferred Java IDE.
2. Ensure all dependencies are installed.
3. Run the `FacebookSignupTest.java` file using TestNG or a Java main method.
   ```sh
   mvn test
   ```

## Script Overview
The automation script performs the following actions:
- Navigates to the Facebook signup page.
- Fills in details like name, email, password, and date of birth.
- Selects gender.
- Clicks the signup button.
