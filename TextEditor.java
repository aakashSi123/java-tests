import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class TextEditor extends JFrame {

  // Text area for the main content
  private JTextArea textArea;

  // File menu items
  private JMenuItem newItem, openItem, saveItem, saveAsItem, exitItem;

  // File chooser for open and save dialogs
  private JFileChooser fileChooser;

  // Current file being edited
  private File currentFile;

  public TextEditor() {
    super("Text Editor");

    // Set up the text area
    textArea = new JTextArea();
    textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
    add(new JScrollPane(textArea), BorderLayout.CENTER);

    // Set up the file menu
    JMenu fileMenu = new JMenu("File");
    newItem = fileMenu.add("New");
    openItem = fileMenu.add("Open");
    saveItem = fileMenu.add("Save");
    saveAsItem = fileMenu.add("Save As...");
    fileMenu.addSeparator();
    exitItem = fileMenu.add("Exit");

    // Set up the menu bar
    JMenuBar menuBar = new JMenuBar();
    menuBar.add(fileMenu);
    setJMenuBar(menuBar);

    // Set up the file chooser
    fileChooser = new JFileChooser();

    // Add listeners for the menu items
    newItem.addActionListener(new NewListener());
    openItem.addActionListener(new OpenListener());
    saveItem.addActionListener(new SaveListener());
    saveAsItem.addActionListener(new SaveAsListener());
    exitItem.addActionListener(new ExitListener());

    // Set up the frame
    setSize(600, 400);
    setLocationRelativeTo(null); // Center the frame
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  // Inner class for the "New" action
  class NewListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      // Clear the text area
      textArea.setText("");
      currentFile = null;
    }
  }

  // Inner class for the "Open" action
  class OpenListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      // Show the open dialog
      int result = fileChooser.showOpenDialog(TextEditor.this);

      // If the user selected a file, open it
      if (result == JFileChooser.APPROVE_OPTION) {
        currentFile = fileChooser.getSelectedFile();
        try {
          textArea.setText(readFile(currentFile));
        } catch (IOException e) {
          JOptionPane.showMessageDialog(TextEditor.this,
              "Error reading file: " + e.getMessage(),
              "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
  }

  // Inner class for the "Save"
  // Inner class for the "Save" action
  class SaveListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      if (currentFile == null) {
        // If no file is open, show the save-as dialog
        int result = fileChooser.showSaveDialog(TextEditor.this);
        if (result == JFileChooser.APPROVE_OPTION) {
          currentFile = fileChooser.getSelectedFile();
        } else {
          return;
        }
      }
      try {
        writeFile(currentFile, textArea.getText());
      } catch (IOException e) {
        JOptionPane.showMessageDialog(TextEditor.this,
            "Error writing file: " + e.getMessage(),
            "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
  }

  // Inner class for the "Save As..." action
  class SaveAsListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      // Show the save-as dialog
      int result = fileChooser.showSaveDialog(TextEditor.this);
      if (result == JFileChooser.APPROVE_OPTION) {
        currentFile = fileChooser.getSelectedFile();
        try {
          writeFile(currentFile, textArea.getText());
        } catch (IOException e) {
          JOptionPane.showMessageDialog(TextEditor.this,
              "Error writing file: " + e.getMessage(),
              "Error", JOptionPane.ERROR_MESSAGE);
        }
      }
    }
  }

  // Inner class for the "Exit" action
  class ExitListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.exit(0);
    }
  }

  // Helper method for reading a file
  private String readFile(File file) throws IOException {
    StringBuilder sb = new StringBuilder();
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line;
    while ((line = reader.readLine()) != null) {
      sb.append(line).append("\n");
    }
    reader.close();
    return sb.toString();
  }

  // Helper method for writing a file
  private void writeFile(File file, String text) throws IOException {
    PrintWriter writer = new PrintWriter(new FileWriter(file));
    writer.print(text);
    writer.close();
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        new TextEditor().setVisible(true);
      }
    });
  }
}
