package model;

public class Match {
    private int score;
    private int time_played;
    private String guessWord;

    public String getGuessWord() {
        return guessWord;
    }

    public void setGuessWord(String guessWord) {
        this.guessWord = guessWord;
    }
    
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime_played() {
        return time_played;
    }

    public void setTime_played(int time_played) {
        this.time_played = time_played;
    }

    @Override
    public String toString() {
        return "Match{" + "score=" + score + ", time_played=" + time_played + ", guessWord=" + guessWord + '}';
    }
}
