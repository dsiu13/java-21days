# Day 1
- An Applet is a dynamic and interactive program that can run inside a web page displayed by a java capable browser
- To create an applet, you write it in the Java language, compile it using a Java compiler, and refer to that applet in your HTML Web pages
- To some, object-oriented programming (OOP) technique is merely a way of organizing programs, and it can be accomplished using any language. Working with a real object-oriented language and programming environment, however, enables you to take full advantage of object oriented methodology and its capabilities of creating flexible, modular programs and reusing code.

# Intro to Java programming
- A program has two main parts:
- All the program is enclosed in a class definition - here, a class called "helloworld"
- The body of the program is contained in a routine called main(). In java apps main() is the first routine that is run when the program is executed
```
class HelloWorld {
  public static void main (String args[]) {
    System.out.println( "Hello World!" );
  }
}
```
# Creating a Java Applet
- Creating applets is different from creating a simple application because java applets run and are displayed inside a Web page with other page elements and have special rules for behavior.
```
import java.awt.Graphics;

class HelloWorldApplet extends java.applet.Applet {

  public void print(Graphics g) {
    g.drawString("Hello world!", 5, 25);
  }
}

```
