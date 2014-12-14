Algorithms and Datastructures
=============================

This is an application prototype demonstrating how given algorithms work.

Currently implemented algorithms using the datatype array are two
sorting algorithms BubbleSort and QuickSort, and LinearSearch as
searching algorithm.

Results (and detailed algorithm flow) are printed to the default console.

The package plugins (allplugins) contains some implemented plugins which
can be loaded into the application.

Plugins which shall not be loaded have to be removed from the plugins directory,
for this purpose allplugins serves as a backup folder and contains all plugins.

There are some example "configuration" batch-files in bin/ which empty and
refill the plugins directory. (so please don't save other .class files which
are not intended to be deleted!)

The framework application then is run via run.bat 