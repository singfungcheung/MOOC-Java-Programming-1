/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sing Fung
 */
public class Game {
    private String homeTeam;
    private String enemyTeam;
    private int homePoints;
    private int enemyPoints;
    
    public Game(String homeTeam, String enemyTeam, int homePoints, int enemyPoints) {
        this.homeTeam = homeTeam;
        this.enemyTeam = enemyTeam;
        this.homePoints = homePoints;
        this.enemyPoints = enemyPoints;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getEnemyTeam() {
        return this.enemyTeam;
    }
    
    public int getHomePoints() {
        return this.homePoints;
    }
    
    public int getEnemyPoints() {
        return this.enemyPoints;
    }
    
    public String winningTeam() {
        if (this.getHomePoints() > this.getEnemyPoints()) {
            return this.homeTeam;
        } else {
            return this.enemyTeam;
        }
    }
}
