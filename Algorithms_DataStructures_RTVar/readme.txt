Algorithms and Datastructures

This is an application prototype demonstrating how given algorithms works.

Currently implemented algorithms using the datatype array are two
sorting algorithms BubbleSort and QuickSort, and LinearSearch as
searching algorithm.

Supported datatypes are Integer, Double and String (-Lists).
Input-lists are generated with random data.

Results (and algorithm flow) are printed to the default console.


Implementation of variation is done by runtime variables.

The program has to be invoked as follows
java Main activeFeature1 activeFeature2 ...
possible features are
Comments, Double, String, Integer, BubbleSort, QuickSort, LinearSearch
invalid features are ignored
for printing result the following grammar rule should be followed (order of features is irrelevant)
java Main Comments? ( Double | String | Integer )+ ( BubbleSort | QuickSort | LinearSearch )+
e.g:
# allCurrentlyImplemented (Array, Sort, Search are activated by dependency)
java Main BubbleSort QuickSort LinearSearch Integer String Double Comments

# DoubleAll (all algorithms, but only on datatype double
java Main BubbleSort QuickSort LinearSearch Double Comments

# IntegerAll
java Main BubbleSort QuickSort LinearSearch Integer Comments

# IntegerSort
java Main BubbleSort QuickSort Integer

# StringSearchExtended (LinearSearch on String array with comments)
java Main LinearSearch String Comments