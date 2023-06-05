package game;

import com.formdev.flatlaf.FlatIntelliJLaf;
import controller.Controller;
import javax.swing.UIManager;
import model.SavePlayer;
import view.About;
import view.AboutGame;
import view.GameOver;
import view.MainGame;
import view.MainMenu;
import view.Review;
import view.ScoreScreen;
import view.SelectOptionMenu;

public class Game {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            MainMenu mainMenu = new MainMenu();
            MainGame mainGame = new MainGame();
            GameOver gameOver = new GameOver();
            AboutGame aboutGame = new AboutGame();
            Review review = new Review();
            ScoreScreen score = new ScoreScreen();
            SelectOptionMenu sMenu = new SelectOptionMenu();
            SavePlayer savePlayer = new SavePlayer();
            Controller controller = new Controller(mainMenu, sMenu, mainGame, gameOver, aboutGame, score, savePlayer, review);
            mainMenu.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
