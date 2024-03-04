import java.awt.*;
import java.awt.event.*;

public class App {
  public static void main(String[] args) throws Exception {
    Frame frame = new Frame();
    FlowLayout layout = new FlowLayout(FlowLayout.LEFT);

    Label mouseLabel = new Label("Deag: ");
    Label keyLabel = new Label("Key: ");

    Button okButton = new Button("Okay");
    Button cancelButton = new Button("Cancel");

    frame.setLayout(layout);

    frame.add(mouseLabel);
    frame.add(keyLabel);
    frame.add(okButton);
    frame.add(cancelButton);

    frame.setSize(800, 600);
    frame.setVisible(true);

    frame.addMouseMotionListener(new MouseMotionAdapter() {
      public void mouseMoved(MouseEvent e) {
        super.mouseMoved(e);
        frame.setTitle("Mouse X: " + e.getX() + ", Mouse Y: " + e.getY());
      }

      @Override
      public void mouseDragged(MouseEvent e) {
        super.mouseDragged(e);
        mouseLabel.setText("Drag: " + e.getX() + ", " + e.getY() + " ");
      }
    });

    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        frame.dispose();
      }
    });

    okButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        frame.setTitle("Okay Button Clicked");
      }
    });

    cancelButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        frame.setTitle("Cancel Button Clicked");
      }
    });

    frame.addKeyListener(new KeyListener() {
      @Override
      public void keyTyped(KeyEvent e) {
        keyLabel.setText("Key: " + e.getKeyChar() + " ");
      }

      @Override
      public void keyPressed(KeyEvent e) {

      }

      @Override
      public void keyReleased(KeyEvent e) {

      }
    });
  }
}
