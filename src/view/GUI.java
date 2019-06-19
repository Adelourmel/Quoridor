package quoridor.view;

import quoridor.control.*;
import javax.swing.*;
import java.awt.*;
import quoridor.model.*;

public class GUI extends JFrame {
  private JPanel header;
  private JButton menuButton;
  private JButton quitButton;

  private MenuPanel menuPanel;
  private LoadSavePanel loadSavePanel;
  private ModePanel modePanel;
  private GamePanel gamePanel;
  private QuitPanel quitPanel;
  private QuoridorSettings settings;





  public GUI(QuoridorSettings settings){
    this.settings = settings;

    getContentPane().setLayout(new BorderLayout());
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setTitle("QUORIDOR");
    this.header = new JPanel();
    this.header.setLayout(new BorderLayout());
    this.header.setBackground(new Color(10,34,57));


    this.quitButton = new JButton("QUITTER");
    this.quitButton.addActionListener(new MenuButtonListener(this));
    this.quitButton.setBackground(new Color(255, 255, 255));
    this.quitButton.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    this.quitButton.setFont(new Font("Arial", Font.PLAIN, 30));
    this.quitButton.setFocusPainted(false);
    this.header.add(this.quitButton, BorderLayout.WEST);

    this.menuButton = new JButton("MENU");
    this.menuButton.addActionListener(new MenuButtonListener(this));
    this.menuButton.setBackground(new Color(255, 255, 255));
    this.menuButton.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    this.menuButton.setFont(new Font("Arial", Font.PLAIN, 30));
    this.menuButton.setFocusPainted(false);


    this.header.add(menuButton, BorderLayout.EAST);
    this.add(this.header, BorderLayout.NORTH);




    this.setMenuPanel(new MenuPanel(this));
    //this.add(new QuitPanel(this));
    //this.add(new LoadSavePanel(this));



    this.setSize(1300, 1000);
    //this.setResizable(false);




    this.setVisible(true);


  }

  public void setMenuPanel(MenuPanel m){
    this.menuPanel = m;
    this.add(m);
  }

  public void setLoadSavePanel(LoadSavePanel l){
    this.loadSavePanel = l;
    this.add(l);
  }

  public void setModePanel(ModePanel m){
    this.modePanel = m;
    this.add(m);
  }

  public void setGamePanel(GamePanel g){
    this.gamePanel = g;
    this.add(g);
  }

  public void setQuitPanel(QuitPanel q){
    this.quitPanel = q;
    this.add(q);
  }



  public void removeMenuPanel(){
    this.remove(this.menuPanel);
    this.menuPanel = null;
  }

  public void removeLoadSavePanel(){
    this.remove(this.loadSavePanel);
    this.loadSavePanel = null;
  }


  public void removeModePanel(){
    this.remove(this.modePanel);
    this.modePanel = null;
  }

  public void removeGamePanel(){
    this.remove(this.gamePanel);
    this.gamePanel = null;
  }

  public void removeQuitPanel(){
    this.remove(this.quitPanel);
    this.quitPanel = null;
  }



  public JPanel getHeader(){
    return this.header;
  }

  public MenuPanel getMenuPanel(){
    return this.menuPanel;
  }

  public LoadSavePanel getloadSavePanel(){
    return this.loadSavePanel;
  }

  public ModePanel getModePanel(){
    return this.modePanel;
  }

  public GamePanel getGamePanel(){
    return this.gamePanel;
  }

  public QuitPanel getQuitPanel(){
    return this.quitPanel;
  }



  public JButton getMenuButton(){
    return this.menuButton;
  }

  public JButton getQuitButton(){
    return this.quitButton;
  }

  public QuoridorSettings getSettings(){
    return this.settings;
  }





}
