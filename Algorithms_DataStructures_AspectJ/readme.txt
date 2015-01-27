Got some problems with AspectJ:
===============================
* naming conventions source classes <=> aspects
* currently not outputting anything -> was wrong names for class prefixes

* (most) advices are mapped properly

* I can't give advices with generics, but use the super class Object
* I suppose that's why algorithms don't sort properly
* Aspect Code doesn't call any function from Sort.
