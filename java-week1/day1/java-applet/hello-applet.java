import java.awt.Graphics;

class HelloWorldApplet extends java.applet.Applet {

  public void print(Graphics g) {
    g.drawString("Hello world!", 5, 25);
  }
}
