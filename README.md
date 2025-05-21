# NeoForge Template

This project provides a Gradle project template that can compile mods for NeoForge. This project does not require any third party libraries or dependencies.

## Getting Started

### IntelliJ IDEA
This guide will show how to import the NeoForge Template into IntelliJ IDEA. The setup process is roughly equivalent to setting up the MDK.

1. Clone or download this repository to your computer.
2. Configure the project by editing the `gradle.properties` file.
3. Configure the `build.yml` and `publish.yml` files with the proper name and link.
4. Configure the mod id in the `build.gradle` file in the mods block.
5. Open the template's root folder as a new project in IDEA. This is the folder that contains this README file and the gradlew executable.
6. If your default JVM/JDK is not Java 21 you will encounter an error when opening the project. This error is fixed by going to `File > Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM` and changing the value to a valid Java 21 JVM. You will also need to set the Project SDK to Java 21. This can be done by going to `File > Project Structure > Project SDK`. Once both have been set, open the Gradle tab in IDEA and click the refresh button to reload the project.
7. Configure the packages and classes in the `src` folder to match your mod.
8. Open your Run/Debug Configurations. Under the Application category there should now be options to run NeoForge projects. Select one of the client options and try to run it.
9. Assuming you were able to run the game in step 7 your workspace should now be set up.