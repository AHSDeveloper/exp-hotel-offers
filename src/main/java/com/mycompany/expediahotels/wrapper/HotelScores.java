package com.mycompany.expediahotels.wrapper;

/**
 *
 * @author Test
 */
public class HotelScores {

    private String movingAverageScore;

    private String rawAppealScore;

    public String getMovingAverageScore() {
        return movingAverageScore;
    }

    public void setMovingAverageScore(String movingAverageScore) {
        this.movingAverageScore = movingAverageScore;
    }

    public String getRawAppealScore() {
        return rawAppealScore;
    }

    public void setRawAppealScore(String rawAppealScore) {
        this.rawAppealScore = rawAppealScore;
    }

    @Override
    public String toString() {
        return "ClassPojo [movingAverageScore = " + movingAverageScore + ", rawAppealScore = " + rawAppealScore + "]";
    }
}
