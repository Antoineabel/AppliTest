package com.example.user.applitest;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by USER on 07/03/2018.
 */

class Questionnaire extends ScrollView {
    public Questionnaire(Context context) {
        super(context);
        // TODO CREATION DU QESTIONNAIRE A LA MAIN BOUTONS APRES BOUTONS
        // LIAISON AVEC DONNEE PATIENT POUR ENREGISTREMENT LOCAL
        //exemple question 1
        TextView q1 = new TextView(context);
        q1.setText("QUESTION 1");
        CheckBox chb1 = new CheckBox(context);
    }
}
