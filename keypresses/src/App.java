import java.awt.*;
import java.awt.event.*;

public class App {
  public static void main(String[] args) {
    Label centerLabel;
    Frame frame = new Frame();

    centerLabel = new Label("Press a key");
    centerLabel.setAlignment(Label.CENTER);
    frame.add(centerLabel);

    frame.addKeyListener(new KeyListener() {
      public void keyPressed(KeyEvent e) {
        char keyChar = e.getKeyChar();
        centerLabel.setText("Key Pressed: " + keyChar);
      }

      public void keyTyped(KeyEvent e) {
        // Not used in this example
      }

      public void keyReleased(KeyEvent e) {
        // Not used in this example
      }
    });

    frame.setSize(300, 200);
    frame.setVisible(true);
  }
}