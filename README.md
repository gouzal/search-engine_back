# search-engine
a search engine and collaboration plateform for students , professors and reseachers

#Contribution Guide
 use logger instead of system.out.println
 
https://stackoverflow.com/questions/31869391/what-is-the-difference-between-java-logger-and-system-out-println
 
Whatever is the logging framework (logback, log4j, commons-logging, java.util.logging, ...), a logger should be:

private: Never be accessible outside of its parent class. If another class needs to log something, it should instantiate its own logger.
static: Not dependent on an instance of a class (an object). When logging something, contextual information can of course be provided in the messages but the logger should be created at class level to prevent creating a logger along with each object.
final: Be created once and only once per class.

use CamelCase :
UpperCamelCase  for Classes and lowerCamelCase  for methodes and variables
