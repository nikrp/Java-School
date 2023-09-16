
# Java-School
This is a collection of my friend and I's Java work from our 7th period Java elective.
##  Project Tree
```
├───.vscode
├───bin
│   ├───directories
│   │   ├───WorksheetFiveDir
│   │   ├───WorksheetFourDir
│   │   ├───WorksheetOneDir
│   │   ├───WorksheetSixDir
│   │   ├───WorksheetThreeDir
│   │   └───WorksheetTwoDir
│   └───projects
│       └───UnitOneProjectDir
├───lib
└───src
    ├───directories
    │   ├───WorksheetFiveDir
    │   ├───WorksheetFourDir
    │   ├───WorksheetOneDir
    │   ├───WorksheetSixDir
    │   ├───WorksheetThreeDir
    │   └───WorksheetTwoDir
    └───projects
```

Java-School is the main folder and these are the subfolders inside:

- .vscode
    - Contains `settings.json` for VSCode/Cursor to work with java.
    - Output directories and more.
    - Specified through `"java.project.sourcePaths": ["src"]`, `"java.project.outputPath": "bin"`, and `"java.project.referencedLibraries": ["lib/**/*.jar"]`
- bin
    - The output folder for all the source files.
    - Contains the `.class` files.
- src
    - All of the `.java` files go into this folder.
    - This is technically the main folder of the project.
    - Others are still important as they are output files and other paths Java needs.
    - `/directories` is for all my worksheets that I do. This is called from `src/App.java`.
    - `/projects` is for all my final unit projects. This is called from `src/Projects.java`.
## Usage
> Different components from Java are used in these projects but the most significant in the Scanner class.

The Scanner class is imported from the `java.util` class. We use it as something to pick projects and directories to choose from. The user enters a number of the directory they want (Worksheet 1, Worksheet 2, Worksheet 3, etc.) and then enters the project number (usually 1-3). Here is an example of that usage in the console.

``` console
Enter the directory number and 0 to terminate: 1

Your are in "Worksheet One: Printing"
Enter a project number: 1





         "Nikhil Pellakru"
Enter a project number: 2
NAME    GRADE
John    82
Paul    91
George  98
Ringo   79
Enter a project number: 3



              *

              *

              *

              *

              *

       * * * * * * * *
Enter a project number: 0
Enter the directory number and 0 to terminate: 0
Exiting...
```

Entering 0 in the project and directory selection means exiting. Some of the projects actually need Scanner for the project so some other inputs might appear. Blank lines are usually not a mistake. It's part of the assignment.
## Authors

- [@nikrp](https://github.com/nikrp)
- [@Repulsor23](https://github.com/Repulsor23)
