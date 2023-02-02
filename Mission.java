/*
 * This file contains spoilers. Please do not read it. 
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * [DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ][DO NOT READ]
 * 
 */

public class Mission {
    private String briefing;
    private String codeWord;
    private String missionStatement;
    private String answer;
    private String[] hints = {"Maybe something in the briefing will help?", "The names of our agencies sound familiar...", "The secret message is separated by dashes. Interesting."};

    public Mission() {
    }

    public Mission(String briefing, String codeWord, String missionStatement, String answer, String[] hints) {
        this.briefing = briefing;
        this.codeWord = codeWord;
        this.missionStatement = missionStatement;
        this.answer = answer;
        this.hints = hints;
    }

    public String getBriefing() {
        return "ASCII HEADQUARTERS intercepted an encoded message we believe will reveal top secret information regarding our rival spy agency, HEXA, and their deepest desire. Crack the message to uncover their vulnerability.";
    }

    public void setBriefing(String briefing) {
        this.briefing = briefing;
    }

    public String getCodeWord() {
        return "57-69-6C-6C-20-79-6F-75-20-62-65-20-6D-79-20-56-61-6C-65-6E-74-69-6E-65-3F";
    }

    public void setCodeWord(String codeWord) {
        this.codeWord = codeWord;
    }

    public String getMissionStatement() {
        return "Crack the message to uncover their vulnerability.";
    }

    public void setMissionStatement(String missionStatement) {
        this.missionStatement = missionStatement;
    }

    public String getAnswer() {
        return "Will you be my Valentine?";
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(String answerIn) {
        if (answerIn.equalsIgnoreCase(this.answer)) {
            return true;
        } else {
            System.out.println("That doesn't seem right.");
            return false;
        }
    }

    public String[] getHints() {
        return this.hints;
    }

    public void setHints(String[] hints) {
        this.hints = hints;
    }

    public void displayHint(int numOfAttempts) {
        if (numOfAttempts == -1) {
            System.out.println("[You haven't made an attempt!]");
            return;
        }
        if (numOfAttempts > 2) {
            System.out.println("[You've ran out of hints!]");
            return;
        }
        for (int i = 0; i <= numOfAttempts; i++) {
            if (i > 2) {
                return;
            }
            System.out.println(hints[numOfAttempts]);
            return;
        }
    }

    public void displayMyHints(int numOfAttempts) {
        if (numOfAttempts == -1) {
            System.out.println("[You haven't made an attempt!]");
        }
        for (int i = 0; i <= numOfAttempts; i++) {
            if (i > 2) {
                break;
            }
            if (numOfAttempts == -1) {
                break;
            }
            System.out.println(hints[i]);
        }
    }

    public void getReward() {
        System.out.println("Congratulations! You've been rewarded: Cold Hard Cash\n");
    }
}
