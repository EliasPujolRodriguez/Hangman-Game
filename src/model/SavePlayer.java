package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.time.LocalDate.now;
import java.time.LocalTime;
import static java.time.LocalTime.now;
import static java.time.chrono.ThaiBuddhistDate.now;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.time.LocalDateTime;

public class SavePlayer extends Conn {

    Player player = new Player();
    Match match = new Match();
    Conn c = new Conn();

    public boolean savePlayerData(Player player) throws SQLException {
        boolean option = false;

        try {
            c.getConnection();
            PreparedStatement ps = null;

            String query = "INSERT INTO player (player_name, grade) values (?,?)";

            ps = c.conn.prepareStatement(query);
            ps.setString(1, player.getPlayer_name());
            ps.setString(2, player.getGrade());
            ps.execute();

            option = true;

            ps.close();
            c.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SavePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return option;
    }

    public ArrayList<Object> searchPlayerData(Player player) throws SQLException {
        PreparedStatement ps = null;
        ArrayList<Object> list = new ArrayList<>();
        ResultSet rs = null;
        c.getConnection();
        String query = "SELECT player_name, Player_Id FROM player ORDER BY Player_Id DESC LIMIT 1";

        try {
            ps = c.conn.prepareStatement(query);
            rs = ps.executeQuery();

            if (rs.next()) {
                list.add(rs.getString("player_name"));
                list.add(rs.getString("Player_Id"));
            }

        } catch (Exception e) {
            System.out.println("err");
        }

        rs.close();
        ps.close();
        return list;
    }

    public boolean saveMatchData(Player player, Match match) throws SQLException {
        Date date = new Date();
        long now = System.currentTimeMillis();
        Timestamp sqlTimestamp = new Timestamp(now);
        int id = Integer.parseInt(searchPlayerData(player).get(1).toString());

        boolean opt = false;
        try {
            c.getConnection();
            PreparedStatement ps = null;

            String query = "INSERT INTO game_match_det (score, match_date_time, Player_Id) values (?,?,?)";

            ps = c.conn.prepareStatement(query);
            ps.setInt(1, match.getScore());
            ps.setTimestamp(2, sqlTimestamp);
            ps.setInt(3, id);
            ps.execute();

            opt = true;

            ps.close();
            //c.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(SavePlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return opt;
    }

    public ArrayList getMatchDataScore() throws SQLException {
        PreparedStatement ps = null;
        ArrayList<String> list = new ArrayList<>();
        ResultSet rs = null;
        c.getConnection();
        String query = "SELECT game_match_det.score, player.player_name FROM game_match_det INNER JOIN player on player.Player_Id = game_match_det.Player_Id;";
        try {
            ps = c.conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next() == true) {
                list.add(rs.getString("score"));
            }

        } catch (Exception e) {
            System.out.println("err");
        }

        rs.close();
        ps.close();

        return list;
    }

    public ArrayList getMatchDataPlayerName() throws SQLException {
        PreparedStatement ps = null;
        ArrayList<String> list = new ArrayList<>();
        ResultSet rs = null;
        c.getConnection();
        String query = "SELECT CONCAT(player.player_name, '-', player.grade) FROM game_match_det INNER JOIN player on player.Player_Id = game_match_det.Player_Id;";
        try {
            ps = c.conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next() == true) {
                list.add(rs.getString("CONCAT(player.player_name, '-', player.grade)"));
            }

        } catch (Exception e) {
            System.out.println("err");
        }

        rs.close();
        ps.close();

        return list;
    }

    public ArrayList getMatchDataTime() throws SQLException {
        PreparedStatement ps = null;
        ArrayList<String> list = new ArrayList<>();
        ResultSet rs = null;
        c.getConnection();
        String query = "SELECT game_match_det.match_date_time FROM game_match_det INNER JOIN player on player.Player_Id = game_match_det.Player_Id";
        try {
            ps = c.conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next() == true) {
                list.add(rs.getString("game_match_det.match_date_time"));
            }

        } catch (Exception e) {
            System.out.println("err");
        }

        rs.close();
        ps.close();

        return list;
    }
}
