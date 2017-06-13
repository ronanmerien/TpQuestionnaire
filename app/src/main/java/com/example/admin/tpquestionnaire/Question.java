package com.example.admin.tpquestionnaire;

/**
 * Created by admin on 13/06/2017.
 */

class Question {
    private String question;
    private String question1;
    private String question2;
    private Boolean Reponse;
    private boolean reponse;

    public Question(String question, String question1, String question2, boolean reponse) {
        setQuestion(question);
        setQuestion1(question1);
        setQuestion2(question2);
        setReponse(reponse);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public Boolean getReponse() {
        return Reponse;
    }

    public void setReponse(Boolean reponse) {
        Reponse = reponse;
    }

    public boolean isReponse() {
        return reponse;
    }

    public void setReponse(boolean reponse) {
        this.reponse = reponse;
    }
}
