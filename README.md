# Examples-gradle-dependency-configurations #
Here we will discuss four major configurations which include:
### implementation ### 
### api            ### 
### compileOnly    ###     
### runtimeOnly    ### 



This [Blog Post](https://medium.com/@gauraw.negi/how-gradle-dependency-configurations-work-underhood-e934906752e5) will help to to understand about the working of all above dependency configurations.


# The advantage of choosing the right configuration:
1. Cleaner classpaths(via right use of configurations,a module will only knows about the required modules hence it will leads to simpler and cleaner classpath)
2. Faster compilation due to cleaner classpath
3. Less recompilation (if code change happens in runtime classpath for a module then this module don’t need to recompile)
4. Smaller build size (if we will use compileOnly*)
5. Avoid accidental use of the library which we are not using explicitly
6. Dynamic behaviour of a library (runtimeOnly*)


This project is container of four different independent andorid projects, one for each configuration(implementation-api-compileOnly-runtimeOnly)

Primary Goal of this project to get undersanding of gradle dependency configurations.

This project is source code for below post, I have explained everything in details as required and try to make it easy to understand as well.
# https://medium.com/@gauraw.negi/how-gradle-dependency-configurations-work-underhood-e934906752e5


