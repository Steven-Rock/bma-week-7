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
            
            
Program Output:            
All tasks = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Mon Oct 15 12:51:10 EDT 2012, Note()=ANote [name=Project1 at Work, note=Need to create materlialized views in DB, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=d1db4d97-e4f0-4d19-84f7-dcb5764a76dd, dirty=true], isDirty()=true, getGuid()=d1db4d97-e4f0-4d19-84f7-dcb5764a76dd, getName()=Project1 at Work, getNote()=Need to create materlialized views in DB, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=1501195377]
All tasks = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Thu Oct 25 12:51:10 EDT 2012, Note()=ANote [name=Project1 at Home, note=Put up new door knob, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=f7d379f8-2c22-4679-9ccd-e7ead09c1fb0, dirty=true], isDirty()=true, getGuid()=f7d379f8-2c22-4679-9ccd-e7ead09c1fb0, getName()=Project1 at Home, getNote()=Put up new door knob, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=-968100264]
All tasks = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Fri Oct 26 12:51:10 EDT 2012, Note()=ANote [name=Hobbies, note=learn guitar, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=5b4204bc-1b6f-493f-8956-57477be1cba1, dirty=true], isDirty()=true, getGuid()=5b4204bc-1b6f-493f-8956-57477be1cba1, getName()=Hobbies, getNote()=learn guitar, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=-1735377258]
All tasks = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Wed Jul 18 12:51:10 EDT 2012, Note()=ANote [name=Hobbies, note=Hiking, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=8cef5181-c45f-4de6-99c7-6d1238971d32, dirty=true], isDirty()=true, getGuid()=8cef5181-c45f-4de6-99c7-6d1238971d32, getName()=Hobbies, getNote()=Hiking, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=686663798]
Filtering tasks
Filtered Task = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Thu Oct 25 12:51:10 EDT 2012, Note()=ANote [name=Project1 at Home, note=Put up new door knob, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=f7d379f8-2c22-4679-9ccd-e7ead09c1fb0, dirty=true], isDirty()=true, getGuid()=f7d379f8-2c22-4679-9ccd-e7ead09c1fb0, getName()=Project1 at Home, getNote()=Put up new door knob, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=-968100264]
Filtered Task = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Fri Oct 26 12:51:10 EDT 2012, Note()=ANote [name=Hobbies, note=learn guitar, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=5b4204bc-1b6f-493f-8956-57477be1cba1, dirty=true], isDirty()=true, getGuid()=5b4204bc-1b6f-493f-8956-57477be1cba1, getName()=Hobbies, getNote()=learn guitar, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=-1735377258]
Filtering tasks
Filtered Task = ATask [completed=false, completedDate=Sat Oct 20 12:51:10 EDT 2012, dueDate=Mon Oct 15 12:51:10 EDT 2012, Note()=ANote [name=Project1 at Work, note=Need to create materlialized views in DB, lastModifiedDate=Sat Oct 20 12:51:10 EDT 2012, createDate=Sat Oct 20 12:51:10 EDT 2012, guid=d1db4d97-e4f0-4d19-84f7-dcb5764a76dd, dirty=true], isDirty()=true, getGuid()=d1db4d97-e4f0-4d19-84f7-dcb5764a76dd, getName()=Project1 at Work, getNote()=Need to create materlialized views in DB, getLastModifiedDate()=Sat Oct 20 12:51:10 EDT 2012, getCreateDate()=Sat Oct 20 12:51:10 EDT 2012, getClass()=class com.swr.tidynotes.note.Task, hashCode()=1501195377]
    