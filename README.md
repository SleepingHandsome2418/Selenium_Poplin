# Selenium Java Project

This project demonstrates how to use Selenium WebDriver with Java to automate web application testing. The instructions
below guide you through setting up the project, installing necessary tools, and running tests.

---

## Prerequisites

Before you begin, make sure you have the following software installed:

1. **IntelliJ IDEA**  
   Download and install IntelliJ IDEA from [here](https://www.jetbrains.com/idea/).

2. **Java Development Kit (JDK)**  
   Download and install the JDK
   from [Oracle's official site](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use a JDK
   distribution like [OpenJDK](https://adoptopenjdk.net/).  
   After installation, ensure the JDK is added to your system's environment variables. Set the `JAVA_HOME` environment
   variable, for example:
    - Windows: `set JAVA_HOME=C:\Program Files\Java\jdk-11.0.8`
    - Linux/Mac: `export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64`

3. **Maven**  
   Maven is required to build and manage dependencies.  
   Download and install Maven from [here](https://maven.apache.org/download.cgi). After installation, set the
   `MAVEN_HOME` environment variable:
    - Windows: `set MAVEN_HOME=C:\Program Files\Apache\maven`
    - Linux/Mac: `export MAVEN_HOME=/opt/maven`

4. **Git**  
   Ensure you have Git installed for version control. Download it from [here](https://git-scm.com/).

5. **ChromeDriver**  
   Selenium requires a browser driver to interact with the browser. If you're using Google Chrome, you'll need the
   correct version of ChromeDriver.
    - Find the correct ChromeDriver for your version of Chrome
      from [here](https://sites.google.com/chromium.org/driver/).
    - Once downloaded, place the `chromedriver.exe` file in a directory of your choice, and update the path in your
      project code.

## Setup

#### 1. Clone this repository to your local machine using:

```bash
git clone https://github.com/SleepingHandsome2418/Selenium_Poplin.git
```

#### 2. Open the project in IntelliJ IDEA:
   - Launch IntelliJ IDEA, go to File > Open and select your project folder.


#### 3. Install Dependencies
- Maven will automatically download the necessary dependencies when you build the project. Make sure Maven is set up properly.

## Running Tests

#### 1. Run Maven Clean and Install

To clean and install the project dependencies, run the following Maven commands:
- Open the terminal in IntelliJ or a separate command line.
- Navigate to the root directory of your project.
- Run the following command:

```bash
mvn clean install
```

This command will:

- Clean the project (removes compiled files).
- Install the project dependencies (downloads required libraries).

#### 2. Running Tests with @UItest Tag

- Navigate to src/test/java and open the TestRunner class.
- Modify the tags attribute in the @CucumberOptions annotation to specify the tag you want to run. In this case, the tag
  is @UItest.
- Run TestRunner class using IntelliJ

#### 3. Test Results and Reports

After running the tests, a test report will be generated in the following location:

```bash
target/Report/TestResults.html
```

This report will provide a detailed summary of the test execution, including pass/fail statuses and additional test run
information. The plugin option in the @CucumberOptions annotation is configured as follows:


