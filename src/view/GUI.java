package quoridor.view;

import quoridor.control.*;
import javax.swing.*;
import java.awt.*;
import quoridor.model.*;

/**
 * GUI class. Creates the JFrame of the application and manages the display of the JPanels.
 */
public class GUI extends JFrame {
  private JPanel header;
  private JButton menuButton;
  private JButton quitButton;

  private MenuPanel menuPanel;
  private LoadSavePanel loadSavePanel;
  private ModePanel modePanel;
  private GamePanel gamePanel;
  private QuitPanel quitPanel;
  private WinnerPanel winnerPanel;
  private QuoridorSettings settings;

  private final Color backColor = new Color(108,128,154);


  private final String PATH ="../img";

  /**
   * GUI constructor
   * @param settings QuoridorSettings parameter, it allows to use the model package
   */
  public GUI(QuoridorSettings settings){
    this.settings = settings;

    getContentPane().setLayout(new BorderLayout());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("QUORIDOR");
    this.header = new JPanel();
    this.header.setLayout(new BorderLayout());
    this.header.setBackground(new Color(10,34,57));


    ImageIcon imageIcon = new ImageIcon(this.PATH+"/menu.png"); // load the image to a imageIcon
    Image image = imageIcon.getImage(); // transform it
    Image newimg = image.getScaledInstance(75, 75,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
    imageIcon = new ImageIcon(newimg);
    this.menuButton = new JButton(imageIcon);
    this.menuButton.addActionListener(new MenuButtonListener(this));
    this.menuButton.setBackground(new Color(255, 255, 255));
    //this.menuButton.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    this.menuButton.setFont(new Font("Arial", Font.PLAIN, 30));
    this.menuButton.setFocusPainted(false);


    this.header.add(menuButton, BorderLayout.EAST);
    this.add(this.header, BorderLayout.NORTH);




    this.setMenuPanel(new MenuPanel(this));
    //this.add(new WinnerPanel(this));
    //this.add(new LoadSavePanel(this));



    this.setSize(1300, 1000);
    //this.setResizable(false);




    this.setVisible(true);


  }

  /**
   * Set the menuPanel. Add the MenuPanel to the JFrame and set the menuPanel attribute.
   * @param m the new menuPanel to display
   */
  public void setMenuPanel(MenuPanel m){
    this.menuPanel = m;
    this.add(m);
  }

  /**
   * Set the LoadSavePanel. Add the LoadSavePanel to the JFrame and set the LoadSavePanel attribute.
   * @param l the new LoadSavePanel to display
   */
  public void setLoadSavePanel(LoadSavePanel l){
    this.loadSavePanel = l;
    this.add(l);
  }

  /**
   * Set the ModePanel. Add the ModePanel to the JFrame and set the ModePanel attribute.
   * @param m the new ModePanel to display
   */
  public void setModePanel(ModePanel m){
    this.modePanel = m;
    this.add(m);
  }

  /**
   * Set the GamePanel. Add the GamePanel to the JFrame and set the GamePanel attribute.
   * @param g the new GamePanel to display
   */
  public void setGamePanel(GamePanel g){
    this.gamePanel = g;
    this.add(g);
  }

  /**
   * Set the QuitPanel. Add the QuitPanel to the JFrame and set the QuitPanel attribute.
   * @param q the new QuitPanel to display
   */
  public void setQuitPanel(QuitPanel q){
    this.quitPanel = q;
    this.add(q);
  }

  /**
   * Set the WinnerPanel. Add the WinnerPanel to the JFrame and set the WinnerPanel attribute.
   * @param w the new WinnerPanel to display
   */
  public void setWinnerPanel(WinnerPanel w){
    this.winnerPanel = w;
    this.add(w);
  }




  /**
   * get the background color
   * @return the background color
   */
  public Color getbackColor() {
    return this.backColor;
  }

  /**
   * remove the MenuPanel of the JFrame and set the attibute at null
   */
  public void removeMenuPanel(){
    this.remove(this.menuPanel);
    this.menuPanel = null;
  }

  /**
   * remove the MenuPanel of the JFrame and set the attibute at null
   */
  public void removeLoadSavePanel(){
    this.remove(this.loadSavePanel);
    this.loadSavePanel = null;
  }

  /**
   * remove the ModePanel of the JFrame and set the attibute at null
   */
  public void removeModePanel(){
    this.remove(this.modePanel);
    this.modePanel = null;
  }

  /**
   * remove the GamePanel of the JFrame and set the attibute at null
   */
  public void removeGamePanel(){
    this.remove(this.gamePanel);
    this.gamePanel = null;
  }

  /**
   * remove the QuitPanel of the JFrame and set the attibute at null
   */
  public void removeQuitPanel(){
    this.remove(this.quitPanel);
    this.quitPanel = null;
  }
  /**
   * remove the WinnerPanel of the JFrame and set the attibute at null
   */
  public void removeWinnerPanel(){
    this.remove(this.winnerPanel);
    this.winnerPanel = null;
  }



  /**
   * get the Header of the JFrame
   * @return Header of the JFrame
   */
  public JPanel getHeader(){
    return this.header;
  }

  /**
   * get the MenuPanel of the JFrame
   * @return MenuPanel of the JFrame
   */
  public MenuPanel getMenuPanel(){
    return this.menuPanel;
  }

  /**
   * get the LoadSavePanel of the JFrame
   * @return LoadSavePanel of the JFrame
   */
  public LoadSavePanel getloadSavePanel(){
    return this.loadSavePanel;
  }

  /**
   * get the ModePanel of the JFrame
   * @return ModePanel of the JFrame
   */
  public ModePanel getModePanel(){
    return this.modePanel;
  }

  /**
   * get the GamePanel of the JFrame
   * @return GamePanel of the JFrame
   */
  public GamePanel getGamePanel(){
    return this.gamePanel;
  }

  /**
   * get the QuitPanel of the JFrame
   * @return QuitPanel of the JFrame
   */
  public QuitPanel getQuitPanel(){
    return this.quitPanel;
  }

  /**
   * get the WinnerPanel of the JFrame
   * @return WinnerPanel of the JFrame
   */
  public WinnerPanel getWinnerPanel(){
    return this.winnerPanel;
  }


  /**
   * get the MenuButton of the Header
   * @return MenuButton of the Header
   */
  public JButton getMenuButton(){
    return this.menuButton;
  }


  /**
   * get the settings of the JFrame
   * @return settings of the JFrame
   */
  public QuoridorSettings getSettings(){
    return this.settings;
  }





}
