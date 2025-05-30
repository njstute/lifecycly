Maven organizes its build process into lifecycles, which consist of phases, and each phase is made up of goals.

Maven Lifecycles
Maven has three built-in lifecycles:
- Default – Handles project deployment.
- Clean – Cleans the project and removes files from previous builds.
- Site – Generates project documentation.

Maven Phases
Each lifecycle consists of multiple phases. The default lifecycle, for example, includes:
- validate – Ensures the project is correct.
- compile – Compiles the source code.
- test – Runs unit tests.
- package – Packages the compiled code (e.g., into a JAR or WAR).
- verify – Runs checks on the package.
- install – Installs the package into the local repository.
- deploy – Copies the package to a remote repository.
When you run a phase (e.g., mvn package), Maven executes all preceding phases in order.

Maven Goals
Goals are tasks bound to phases. Some examples:
- compiler:compile → Bound to the compile phase.
- surefire:test → Bound to the test phase.
- install:install → Bound to the install phase.
- jar:jar → Bound to the package phase.
You can run a specific goal using mvn <plugin>:<goal>, which executes only that goal.
For a deeper dive, check out this guide or this tutorial. Let me know if you need more details! 🚀

mvn dependency:copy-dependencies -DoutputDirectory=lib/ -DincludeScope=runtime

mvn clean dependency:copy-dependencies -DincludeScope=runtime

mvn clean compile test