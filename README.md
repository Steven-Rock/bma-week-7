bma-week-7
==========

    Read Chapter 9 "Exception Handling" in Java: A Beginner's Guide
    Assignment
        Create a github repository to hold homework named bma-week-7 containing a class, Assignment, in the default package
        Take your Task hierachy from week 6 and place into one or more packages
            Create a base package for your application
                Including a unique prefix is optional (com.crossfireconsulting for example)
                The application prefix should be present.  Tasklist, todolist, todo, whatever...
            Its time we move to one class per file, so make each file live in its own class (anonymous and inner classes are obviously exceptions)
        
        Implement a package called TaskFilter off of the application root package that will filter tasks 
            Implement the TaskFilter interface.  The most simple interface I can think of would be "public Task[] filter(Task[] tasks);"
            Implement at least one class that implements TaskFilter 
                hint: you can bring in as much or as little data and behavior as long as you implement the public interface
                hint: remember this involves by reference semantics.  You don't want to destroy the original collection of tasks
        
        In Assignment.java
            Create a collection of Task objects representative of your hierarchy
            Create a collection of TaskFilter objects
                Include at least one concrete class from 3.2 above
                Include at least one anonymous class that is defined on the spot
            Filter the collection of Task objects and print the resulting collection of Task objects