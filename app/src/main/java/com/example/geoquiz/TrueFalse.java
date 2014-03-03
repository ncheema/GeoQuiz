package com.example.geoquiz;

/**
 * Created by navjotcheema on 3/2/14.
 */
public class TrueFalse {
    private int mQuestions; //hold resource id(int)
    private boolean mTrueQuestion;


    public TrueFalse(int question, boolean trueQuestion) {
        mQuestions = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestions() {
        return mQuestions;
    }

    public void setQuestions(int questions) {
        mQuestions = questions;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }


}
