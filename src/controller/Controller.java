package controller;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import model.Category;
import model.Match;
import model.Player;
import model.SavePlayer;
import view.About;
import view.AboutGame;
import view.GameOver;
import view.MainGame;
import view.MainMenu;
import view.Review;
import view.ScoreScreen;
import view.SelectOptionMenu;

public class Controller implements ActionListener, MouseListener {
    int miliseconds = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    int days = 0;
    private Timer timer;
    private MainMenu mainMenu;
    private SelectOptionMenu sMenu;
    private MainGame mainGame;
    private GameOver gameOver;
    private AboutGame about;
    private Review review;
    private ScoreScreen scoreScreen;
    private SavePlayer savePlayer;
    private Clip clip;
    private long clipTime;
    Category ct = new Category();
    Match match = new Match();
    private String word;
    Player player = new Player();
    private int badGuessesCount;
    private int score = 0;
    private int s = 1, l;
    private JButton button;
    private int counter = 0;

    public Controller(MainMenu mainMenu, SelectOptionMenu sMenu, MainGame mainGame, GameOver gameOver, AboutGame about, ScoreScreen scoreSc, SavePlayer savePlayer, Review review) {
        this.mainMenu = mainMenu;
        this.sMenu = sMenu;
        this.mainGame = mainGame;
        this.gameOver = gameOver;
        this.review = review;
        this.about = about;
        this.scoreScreen = scoreSc;
        this.savePlayer = savePlayer;
        this.review.btnSound.addActionListener(this);
        this.mainMenu.btnStopSound.addActionListener(this);
        this.gameOver.btnReturn.addActionListener(this);
        this.mainMenu.btnSoundPlay.addActionListener(this);
        this.mainMenu.btnStartGame.addActionListener(this);
        this.mainMenu.btnScore.addActionListener(this);
        this.mainMenu.btnSettings.addActionListener(this);
        this.mainMenu.btnExit.addActionListener(this);
        this.mainMenu.btnScore.addMouseListener(this);
        this.mainMenu.btnSettings.addMouseListener(this);
        this.about.btnReturn.addMouseListener(this);
        this.about.btnReturn.addActionListener(this);
        this.mainMenu.btnExit.addMouseListener(this);
        this.mainMenu.btnInfoD.addMouseListener(this);
        this.mainMenu.btnInfoD.addActionListener(this);
        this.sMenu.btnHouseFCat.addActionListener(this);
        this.sMenu.btnHouseFCat.addMouseListener(this);
        this.sMenu.btnClothesCat.addActionListener(this);
        this.sMenu.btnClothesCat.addMouseListener(this);
        this.sMenu.btnColoursCat.addActionListener(this);
        this.sMenu.btnColoursCat.addMouseListener(this);
        this.sMenu.btnFamCat.addActionListener(this);
        this.sMenu.btnFamCat.addMouseListener(this);
        this.sMenu.btnFoodCat.addActionListener(this);
        this.sMenu.btnFoodCat.addMouseListener(this);
        this.sMenu.btnHBodyCat.addActionListener(this);
        this.sMenu.btnHBodyCat.addMouseListener(this);
        this.sMenu.btnAnimalsCat.addActionListener(this);
        this.sMenu.btnAnimalsCat.addMouseListener(this);
        this.sMenu.btnMusicalInstruments.addActionListener(this);
        this.sMenu.btnMusicalInstruments.addMouseListener(this);
        this.sMenu.btnNumberCat.addActionListener(this);
        this.sMenu.btnNumberCat.addMouseListener(this);
        this.sMenu.btnCountries.addActionListener(this);
        this.sMenu.btnCountries.addMouseListener(this);
        this.sMenu.btnSeasonsYearsCat.addActionListener(this);
        this.sMenu.btnSeasonsYearsCat.addMouseListener(this);
        this.sMenu.btnToyCat.addMouseListener(this);
        this.sMenu.btnToyCat.addActionListener(this);
        this.scoreScreen.btnReturn.addActionListener(this);
        this.scoreScreen.btnReturn.addMouseListener(this);
        this.scoreScreen.btnSaveName.addMouseListener(this);
        this.scoreScreen.btnSaveName.addActionListener(this);
        this.mainGame.btnReturnMainMenu.addActionListener(this);
        this.review.btnArrowRight.addActionListener(this);
        this.review.btnArrowLeft.addActionListener(this);
        this.review.btnReturn.addActionListener(this);
        this.sMenu.btnReturn.addActionListener(this);
        this.mainGame.btnA.addActionListener(this);
        this.mainGame.btnB.addActionListener(this);
        this.mainGame.btnC.addActionListener(this);
        this.mainGame.btnD.addActionListener(this);
        this.mainGame.btnE.addActionListener(this);
        this.mainGame.btnF.addActionListener(this);
        this.mainGame.btnG.addActionListener(this);
        this.mainGame.btnH.addActionListener(this);
        this.mainGame.btnI.addActionListener(this);
        this.mainGame.btnJ.addActionListener(this);
        this.mainGame.btnK.addActionListener(this);
        this.mainGame.btnL.addActionListener(this);
        this.mainGame.btnM.addActionListener(this);
        this.mainGame.btnN.addActionListener(this);
        this.mainGame.btnO.addActionListener(this);
        this.mainGame.btnP.addActionListener(this);
        this.mainGame.btnQ.addActionListener(this);
        this.mainGame.btnR.addActionListener(this);
        this.mainGame.btnS.addActionListener(this);
        this.mainGame.btnT.addActionListener(this);
        this.mainGame.btnU.addActionListener(this);
        this.mainGame.btnV.addActionListener(this);
        this.mainGame.btnW.addActionListener(this);
        this.mainGame.btnX.addActionListener(this);
        this.mainGame.btnY.addActionListener(this);
        this.mainGame.btnZ.addActionListener(this);
        score = 0;
        tr();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        endGame(e);
        startGame(e);
        returnMainGame(e);

        if (e.getSource().equals(mainMenu.btnStopSound)) {
            clip.stop();
            clip.flush();
            clip.close();
        }

        if (e.getSource().equals(mainMenu.btnInfoD)) {
            mainMenu.dispose();
            about.setVisible(true);
        }

        if (e.getSource().equals(mainMenu.btnScore)) {
            mainMenu.dispose();
            scoreScreen.setVisible(true);
            try {
                loadScoreTable();
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource().equals(about.btnReturn)) {
            about.dispose();
            mainMenu.setVisible(true);
        }

        if (e.getSource().equals(review.btnReturn)) {
            review.dispose();
            sMenu.setVisible(true);
        }

        if (e.getSource().equals(sMenu.btnReturn)) {
            sMenu.dispose();
            mainMenu.setVisible(true);
        }

        if (e.getSource().equals(scoreScreen.btnReturn)) {
            scoreScreen.dispose();
            mainMenu.setVisible(true);
        }

        if (e.getSource().equals(mainGame.btnReturnMainMenu)) {
            mainGame.dispose();
            mainMenu.setVisible(true);
            score = 0;
            enableButton();
            ct.i();
            timer.stop();
        }

        if (e.getSource().equals(mainMenu.btnSettings)) {
            mainMenu.dispose();
            sMenu.setVisible(true);
        }

        if (e.getSource().equals(sMenu.btnHouseFCat) || e.getSource().equals(sMenu.btnAnimalsCat) || e.getSource().equals(sMenu.btnClothesCat) || e.getSource().equals(sMenu.btnColoursCat) || e.getSource().equals(sMenu.btnCountries) || e.getSource().equals(sMenu.btnFamCat) || e.getSource().equals(sMenu.btnFoodCat) || e.getSource().equals(sMenu.btnHBodyCat) || e.getSource().equals(sMenu.btnMusicalInstruments) || e.getSource().equals(sMenu.btnNumberCat) || e.getSource().equals(sMenu.btnSeasonsYearsCat) || e.getSource().equals(sMenu.btnToyCat)) {
            sMenu.setVisible(false);
            review.setVisible(true);
        }

        if (e.getSource().equals(review.btnSound)) {
            Voice voice;
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
            VoiceManager vm = VoiceManager.getInstance();
            voice = vm.getVoice("kevin16");
            voice.allocate();
            voice.speak(review.w.getText());
        }

        if (e.getSource().equals(review.btnArrowRight)) {
            counter++;
        }

        if (e.getSource().equals(review.btnArrowLeft) && counter != -1) {
            counter--;
        }

        categ(e);
        review.w.setText(ct.getPracticeword(categ(e), counter));
        review.w2.setText(ct.getTranslationWord(categ(e), counter));

        if (e.getSource().equals(scoreScreen.btnSaveName)) {
            try {
                savePlayerData();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource().equals(mainMenu.btnSoundPlay)) {
            try {
                playMusic();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (command.length() == 1) {//en cada letra que se vaya seleccionando, se va a ir bloqueando de la interfaz de juego
            disableButtons(e);
        } else {
            badGuessesCount = 0;
        }

        showPlayerName();
        char[] hiddenWord = mainGame.word.getText().toCharArray();

        if (word.contains(command)) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == command.charAt(0)) {
                    hiddenWord[i] = command.charAt(0);
                    score++;
                    match.setScore(score);
                }
            }

        } else if (!word.contains(command)) {
            badGuessesCount++;
            if (badGuessesCount == 1) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_0_icon.png")));
            }

            if (badGuessesCount == 2) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_1_icon.png")));
            }

            if (badGuessesCount == 3) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_2_icon.png")));
            }

            if (badGuessesCount == 4) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_3_icon.png")));
            }

            if (badGuessesCount == 5) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_4_icon.png")));
            }

            if (badGuessesCount == 6) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_5_6_icon.png")));
            }

            if (badGuessesCount == 7) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_5_icon.png")));
            }

            if (badGuessesCount == 8) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_6_icon.png")));
            }

            if (badGuessesCount == 9) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_7_icon.png")));
            }

            if (badGuessesCount == 10) {
                mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_8_icon.png")));
                gameOver.correctWord.setText("The correct word is " + word);
                mainGame.dispose();
                gameOver.setVisible(true);
                try {
                    saveScoreData(score);
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    playMusicLoose();
                } catch (LineUnavailableException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedAudioFileException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            score = score - badGuessesCount + 1;
        }
        
        mainGame.currentScore.setText("Score " + String.valueOf(score));
        match.setScore(score);
        mainGame.word.setText(String.valueOf(hiddenWord));

        if (String.valueOf(hiddenWord).equals(word)) {
            s++;
            mainGame.level.setText(String.valueOf("Level " + s + " /12"));
            word = ct.randomWord(s - 1);
            setCategoryName(s - 1);
            hide();
            enableButton();
            badGuessesCount = 1;
        }

        if (s == 12 && String.valueOf(hiddenWord).equals(word)) {
            try {
                saveScoreData(score);
                JOptionPane.showMessageDialog(null, "You win the game");
            } catch (SQLException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (badGuessesCount == 1) {
            mainGame.hangmanImg.setIcon(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("assets/sticker_0_icon.png")));
        }
    }

    public void tr() {
        timer = new Timer(1, (ActionEvent e) -> {
            startCronometer();
            setTimer();
        });
    }

    public void startGame(ActionEvent e) {//método que va a iniciar el juego
        if (e.getSource().equals(mainMenu.btnStartGame)) {
            timer.start();
            ct.i();
            mainMenu.setVisible(false);
            mainGame.setVisible(true);
            word = ct.randomWord(0);
            mainGame.category.setText("House and fourniture");
            mainGame.level.setText(String.valueOf("Level " + 1 + " /12"));
            hide();
            badGuessesCount = 0;
        } else {
            restartTimer();
        }
    }

    public void loadScoreTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) scoreScreen.jTableScore.getModel();
        model.setNumRows(0);
        Object rowData[] = new Object[3];

        for (int i = 0; i < savePlayer.getMatchDataScore().size(); i++) {
            rowData[0] = savePlayer.getMatchDataScore().get(i);
            rowData[1] = savePlayer.getMatchDataPlayerName().get(i);
            rowData[2] = savePlayer.getMatchDataTime().get(i);

            model.addRow(rowData);
        }
    }

    public void hide() {
        char[] correctLetters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                correctLetters[i] = '-';
            }

            if (word.charAt(i) == ' ' || word.charAt(i) == '-') {
                correctLetters[i] = ' ';
            }

            mainGame.word.setText(String.valueOf(correctLetters));
        }
    }

    public void returnMainGame(ActionEvent e) {
        if (e.getSource().equals(gameOver.btnReturn)) {
            gameOver.dispose();
            mainGame.dispose();
            clip.stop();
            enableButton();
            mainMenu.setVisible(true);
            score = 0;
            word = ct.randomWord(0);
        }
    }

    public void setCategoryName(int s) {//método que va a mostrar la categoría de la palabra actual a adivinar
        if (s == 1) {
            mainGame.category.setText("Color");
        }

        if (s == 2) {
            mainGame.category.setText("Number");
        }

        if (s == 3) {
            mainGame.category.setText("Animals");
        }

        if (s == 4) {
            mainGame.category.setText("Country");
        }

        if (s == 5) {
            mainGame.category.setText("Food");
        }

        if (s == 6) {
            mainGame.category.setText("Musical instruments");
        }

        if (s == 7) {
            mainGame.category.setText("Toy");
        }

        if (s == 8) {
            mainGame.category.setText("Season/days of week");
        }

        if (s == 9) {
            mainGame.category.setText("Body");
        }

        if (s == 10) {
            mainGame.category.setText("Family members");
        }

        if (s == 11) {
            mainGame.category.setText("Clothes");
        }
    }

    private void startCronometer() {
        miliseconds++;
        if (miliseconds == 100) {
            miliseconds = 0;
            seconds++;
        }

        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }

        if (minutes == 60) {
            minutes = 0;
            hours++;
        }

        if (hours == 24) {
            hours = 0;
            days++;
        }

      
    }
    
    public void setTimer(){
        String cronometer = days + "d:" + hours + "h:" + minutes + "m:" + seconds + "s:";
        mainGame.timer.setText(cronometer);
    }

    public void disableButtons(ActionEvent e) {
        button = (JButton) e.getSource();
        button.setEnabled(false);
    }

    public void playMusic() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("assets/game_music.wav")));
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void playMusicLoose() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("assets/loose_sound.wav")));
        clip.start();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }

    public void restartTimer() {
        if (timer.isRunning()) {
            timer.stop();
        }

        miliseconds = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        days = 0;
        
        setTimer();
    }

    public void enableButton() {
        Component[] components = mainGame.jPanel5.getComponents();
        for (int i = 0; i < components.length; i++) {
            components[i].setEnabled(true);
        }
    }

    public void clear() {
        scoreScreen.jTextFieldplayerName.setText("");
        scoreScreen.jTextFieldplayerGrade.setText("");
    }

    public void endGame(ActionEvent e) {//método que va a terminar con la partida
        if (e.getSource().equals(mainMenu.btnExit)) {
            System.exit(0);
        }
    }

    public void showPlayerName() {
        try {
            mainGame.playerName.setText("Player: " + savePlayer.searchPlayerData(player).get(0));
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String categ(ActionEvent e) {
        String category = review.reviewTitle.getText();

        if (e.getSource().equals(sMenu.btnAnimalsCat)) {
            review.reviewTitle.setText("Category: Animals");
        }

        if (e.getSource().equals(sMenu.btnClothesCat)) {
            review.reviewTitle.setText("Category: Clothes");
        }

        if (e.getSource().equals(sMenu.btnColoursCat)) {
            review.reviewTitle.setText("Category: Colours");
        }

        if (e.getSource().equals(sMenu.btnCountries)) {
            review.reviewTitle.setText("Category: Countries");
        }

        if (e.getSource().equals(sMenu.btnFamCat)) {
            review.reviewTitle.setText("Category: Family members");
        }

        if (e.getSource().equals(sMenu.btnFoodCat)) {
            review.reviewTitle.setText("Category: Food");
        }

        if (e.getSource().equals(sMenu.btnHBodyCat)) {
            review.reviewTitle.setText("Category: Human body");
        }

        if (e.getSource().equals(sMenu.btnHouseFCat)) {
            review.reviewTitle.setText("Category: House and fourniture");
        }

        if (e.getSource().equals(sMenu.btnMusicalInstruments)) {
            review.reviewTitle.setText("Category: Musical instruments");
        }

        if (e.getSource().equals(sMenu.btnNumberCat)) {
            review.reviewTitle.setText("Category: Number");
        }

        if (e.getSource().equals(sMenu.btnSeasonsYearsCat)) {
            review.reviewTitle.setText("Category: Seasons");
        }

        if (e.getSource().equals(sMenu.btnToyCat)) {
            review.reviewTitle.setText("Category: Toys");
        }

        return category;
    }

    public void savePlayerData() throws ClassNotFoundException, SQLException {
        player.setPlayer_name(scoreScreen.jTextFieldplayerName.getText());
        player.setGrade(scoreScreen.jTextFieldplayerGrade.getText());

        if (savePlayer.savePlayerData(player) == true) {
            JOptionPane.showMessageDialog(null, "Data submitted succesfully");
            clear();
        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    public void saveScoreData(int score) throws SQLException {
        match.setScore(score);

        if (savePlayer.saveMatchData(player, match) == true) {
            JOptionPane.showMessageDialog(null, "Current score: " + score);
        }
    }

   
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Component c = e.getComponent();
        try {
            clip = AudioSystem.getClip();

        } catch (LineUnavailableException ex) {
            Logger.getLogger(Controller.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

        try {
            clip.open(AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource("assets/switch_sound.wav")));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Controller.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controller.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Controller.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        clip.start();
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
