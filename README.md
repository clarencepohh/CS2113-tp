## Note from the owner of this repository
Hi! It's Clarence, one of the developers of the CLI-nton project, done for the module CS2113 in NUS. This is my personal clone of the working project submitted for the module, in order for better tracking of my GitHub stats (how shallow, I know).

Aside from a few comments here and there that I might add, the repository is exactly the same as the final version we submitted. Feel free to take a look around this repo, or (if you'd like), take a look at our [actual team repository](https://github.com/AY2324S2-CS2113-W13-2/tp) that has all the information on our PRs, workflows, issues raised and code reviews. 

Click [here](https://github.com/clarencepohh/tp) if you'd like to take a look at the actual fork that I used for my workflows during the project. 

The completion of this project would not be possible without my wonderful teammates:
- Aakash Ramaswamy [See Aakash's GitHub Here!](https://github.com/Aak242)
- Jonathan Kuek [See Jonathan's GitHub Here!](https://github.com/kyhjonathan)
- Nicholas Tan [See Nicholas' GitHub Here!](https://github.com/NicholasTanYY)
- Sivagnanam Maheshwaran [See Mahesh's GitHub Here!](https://github.com/Mahesh1772)

Thanks for taking the time to read this!

# Duke project template

This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

## Setting up in Intellij

Prerequisites: JDK 11 (use the exact version), update Intellij to the most recent version.

1. **Ensure Intellij JDK 11 is defined as an SDK**, as described [here](https://www.jetbrains.com/help/idea/sdk.html#set-up-jdk) -- this step is not needed if you have used JDK 11 in a previous Intellij project.
2. **Import the project _as a Gradle project_**, as described [here](https://se-education.org/guides/tutorials/intellijImportGradleProject.html).
3. **Verify the set-up**: After the importing is complete, locate the `src/main/java/seedu/duke/Duke.java` file, right-click it, and choose `Run Duke.main()`. If the setup is correct, you should see something like the below:
   ```
   > Task :compileJava
   > Task :processResources NO-SOURCE
   > Task :classes
   
   > Task :Duke.main()
   Hello from
    ____        _        
   |  _ \ _   _| | _____ 
   | | | | | | | |/ / _ \
   | |_| | |_| |   <  __/
   |____/ \__,_|_|\_\___|
   
   What is your name?
   ```
   Type some word and press enter to let the execution proceed to the end.

## Build automation using Gradle

* This project uses Gradle for build automation and dependency management. It includes a basic build script as well (i.e. the `build.gradle` file).
* If you are new to Gradle, refer to the [Gradle Tutorial at se-education.org/guides](https://se-education.org/guides/tutorials/gradle.html).

## Testing

### I/O redirection tests

* To run _I/O redirection_ tests (aka _Text UI tests_), navigate to the `text-ui-test` and run the `runtest(.bat/.sh)` script.

### JUnit tests

* A skeleton JUnit test (`src/test/java/seedu/duke/DukeTest.java`) is provided with this project template. 
* If you are new to JUnit, refer to the [JUnit Tutorial at se-education.org/guides](https://se-education.org/guides/tutorials/junit.html).

## Checkstyle

* A sample CheckStyle rule configuration is provided in this project.
* If you are new to Checkstyle, refer to the [Checkstyle Tutorial at se-education.org/guides](https://se-education.org/guides/tutorials/checkstyle.html).

## CI using GitHub Actions

The project uses [GitHub actions](https://github.com/features/actions) for CI. When you push a commit to this repo or PR against it, GitHub actions will run automatically to build and verify the code as updated by the commit/PR.

## Documentation

`/docs` folder contains a skeleton version of the project documentation.

Steps for publishing documentation to the public: 
1. If you are using this project template for an individual project, go your fork on GitHub.<br>
   If you are using this project template for a team project, go to the team fork on GitHub.
2. Click on the `settings` tab.
3. Scroll down to the `GitHub Pages` section.
4. Set the `source` as `master branch /docs folder`.
5. Optionally, use the `choose a theme` button to choose a theme for your documentation.
