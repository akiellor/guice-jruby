Guice+JRuby Example
===================

This is a POC for using Guice to inject Ruby objects.

* Make a ruby object implement a Java interface:
    http://kenai.com/projects/jruby/pages/CallingJavaFromJRuby#Implementing_Java_Interfaces_in_JRuby

* Bind the interface to a guice Provider that can instantiate the Ruby object:
    https://github.com/akiellor/guice-jruby/blob/master/src/main/java/jrubyguice/CalculatorModule.java
