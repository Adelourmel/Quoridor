package quoridor.view;
//import controller.*;
import quoridor.model.QuoridorSettings;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class LoadSavePanel extends JPanel {

  private final String PATH ="../img";

  private GUI state;

  private JLabel logoLabel;
  private JLabel descriptionLabel;
  private JList<String> savesList;
  private JScrollPane scrollPane;


  public  LoadSavePanel(GUI state){

    this.state = state;
    this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    this.setBackground(new Color(108,128,154));



    ImageIcon imageIcon = new ImageIcon(this.PATH+"/logoQuoridor.png");
    Image image = imageIcon.getImage();
    Image newimg = image.getScaledInstance(800, 500,  java.awt.Image.SCALE_SMOOTH);
    imageIcon = new ImageIcon(newimg);
    this.logoLabel = new JLabel(imageIcon);
    this.logoLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.logoLabel);



    this.descriptionLabel = new JLabel("Charger une partie :");
    this.descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 60));
    this.descriptionLabel.setAlignmentX(CENTER_ALIGNMENT);
    this.add(this.descriptionLabel);
    this.add(new SpacePanel());


    ArrayList<String> saves = this.state.getSettings().listFile();
    String[] savesArray = new String[saves.size()];
    savesArray = saves.toArray(savesArray);
    this.savesList = new JList<String>(saves.toArray(savesArray));

    this.savesList.setFont(new Font("Arial", Font.PLAIN, 30));
    this.savesList.setSelectionBackground(new Color(219,173,106));
    this.savesList.setAlignmentX(CENTER_ALIGNMENT);


    this.scrollPane = new JScrollPane(savesList);
    this.scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    this.scrollPane.setPreferredSize(new Dimension(500,50));
    this.add(this.scrollPane);
    this.scrollPane.setAlignmentX(CENTER_ALIGNMENT);
    this.savesList.setBackground(new Color(230,238,214));
    this.add(new SpacePanel());









  }



}
