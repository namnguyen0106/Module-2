package lesson8;

public class TennisGame {

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        StringBuilder score = new StringBuilder();
        int tempScore = 0;
        if (firstPlayerScore == secondPlayerScore) {
            score.append(checkDraw(firstPlayerScore));
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
            int minusResult = firstPlayerScore - secondPlayerScore;
            if (minusResult == 1) score = new StringBuilder(Constants.ADVANTAGE_FIRST_PLAYER);
            else if (minusResult == -1) score = new StringBuilder(Constants.ADVANTAGE_SECOND_PLAYER);
            else if (minusResult >= 2) score = new StringBuilder(Constants.WIN_FIRST_PLAYER);
            else score = new StringBuilder(Constants.WIN_SECOND_PLAYER);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = firstPlayerScore;
                else {
                    score.append("-");
                    tempScore = secondPlayerScore;
                }
                score.append(check(tempScore));
            }
        }
        return score.toString();
    }

    public static String checkDraw(int firstPlayerScore) {
        String score;
        switch (firstPlayerScore) {
            case Constants.ZERO:
                score = Constants.ZERO_POINT_ALL;
                break;
            case Constants.FIFTEEN:
                score = Constants.FIFTEEN_POINT_ALL;
                break;
            case Constants.THIRTY:
                score = Constants.THIRTY_POINT_ALL;
                break;
            case Constants.FORTY:
                score = Constants.FORTY_POINT_ALL;
                break;
            default:
                score = Constants.DEUCE;
                break;

        }
        return score;
    }

    public static String check(int tempScore) {
        String score = "";
        switch (tempScore) {
            case Constants.ZERO:
                score = Constants.ZERO_POINT;
                break;
            case Constants.FIFTEEN:
                score = Constants.FIFTEEN_POINT;
                break;
            case Constants.THIRTY:
                score = Constants.THIRTY_POINT;
                break;
            case Constants.FORTY:
                score = Constants.FORTY_POINT;
                break;
        }
        return score;
    }
}