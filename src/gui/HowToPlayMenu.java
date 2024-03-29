package gui;

import gui.MainWindow;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class HowToPlayMenu {
    private JPanel howToPlayPanel;
    private JButton backButton;
    private JLabel howTo_title;
    private  final Font font = new Font( "Calibri", 3, 50);

    public HowToPlayMenu( MainWindow mainWindow)
    {
        howToPlayPanel.setOpaque(false);
        /*
        scroll_Pane.setOpaque(false);

        howTo_title.setText("HOW TO PLAY");
        howTo_text.setText("The players in the game represent settlers establishing colonies on the island of Catan. Players build settlements, cities, and roads to connect them as they settle the island. The game board, which represents the island, is composed of hexagonal tiles (hexes) of different land types, which are laid out randomly at the beginning of each game.[4] Newer editions of the game began to depict a fixed layout in their manual, which has been proven by computer simulations to be fairly even-handed,[citation needed] and recommend this to be used by beginners. In 2016, editions of the game were released with a conventional fixed layout board in this configuration, the hexes of which cannot be rearranged.\n" +
                "Players build by spending resources (brick, lumber, wool, grain, and ore), represented by resource cards; each land type, with the exception of the unproductive desert, produces a specific resource. On each player's turn, two six-sided dice are rolled to determine which hexes produce resources. Players with a settlement adjacent to a hex containing the number just rolled receive one card of the corresponding resource; cities produce two cards of the corresponding resource. For example, if a player has one city and two settlements adjacent to a grain hex, that player would take four grain resource cards if the corresponding number was rolled.\n" +
                "There is also a robber token, initially placed on the desert; if a player rolls 7, the robber must be moved to another hex, which will no longer produce resources until the robber is moved again. That player may also steal a resource card from another player with a settlement or city adjacent to the robber's new placement. In addition, when a 7 is rolled, all players with 8 or more resource cards must discard their choice of half of their cards, rounded down. For example, If a player has 9 resource cards, and a 7 is rolled, the player must get rid of 4 cards.\n" +
                "On the player's turn, the player may spend resource cards to build roads, settlements, cities (which replace existing settlements), or development cards. Players can trade resource cards between each other; players may also trade off-island (in effect, with the non-player bank) at a ratio of four of one resource for one of any other. By building settlements adjacent to ports, players may trade with the bank at three-to-one (three of any single resource type) or two-to-one (two of a specific resource) ratios, depending on the port's location.\n" +
                "The goal of the game is to reach ten victory points. Players score one point for each settlement they own and two for each city. Various other achievements, such as establishing the longest road and the largest army (by playing the most knight cards), grant a player additional victory points.\n" +
                "Resource cards can also be spent to buy a development card. Three types of development cards include cards worth one victory point; knight cards (or soldier cards), which allow the player to move the robber as if they had rolled a 7 (but without the remove-half rule); and a third set of cards which allow the player one of three abilities when played.");
        howTo_text.setEditable(false);
        howTo_text.setOpaque(false);
        howTo_text.setBackground(Color.YELLOW);
        */
        BufferedImage img67 = null;
        try {
            img67 = ImageIO.read(new File("images/howto.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg67 = img67.getScaledInstance(700, 900,
                Image.SCALE_AREA_AVERAGING);
        ImageIcon imageIcon67 = new ImageIcon(dimg67);
        imageIcon67 = new ImageIcon(dimg67);
        howTo_title.setIcon(imageIcon67);
        howTo_title.setOpaque(false);


        backButton.setAction(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.startMainMenu();
            }
        });
        BufferedImage img68 = null;
        try {
            img68 = ImageIO.read(new File("images/back.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg68 = img68.getScaledInstance(90, 90,
                Image.SCALE_AREA_AVERAGING);
        ImageIcon imageIcon68 = new ImageIcon(dimg68);
        imageIcon68 = new ImageIcon(dimg68);
        backButton.setIcon(imageIcon68);
        backButton.setOpaque(false);
        backButton.setContentAreaFilled(false);
        backButton.setBorderPainted(false);
    }

    public JPanel getHowToPlayPanel()
    {
        return howToPlayPanel;
    }
}
