package pruvot.julien.soscall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Activity_2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        //Récupération des extras
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);

        //NOM
        String saisie1 = pref.getString("saisie1","NOM");
        TextView nom = (TextView)findViewById(R.id.nom);
        nom.setText(String.valueOf(saisie1));

        //PRENOM
        String saisie2 = pref.getString("saisie2", "PRENOM");
        TextView prenom = (TextView)findViewById(R.id.prenom);
        prenom.setText(String.valueOf(saisie2));

        //AGE
        String saisie3 = pref.getString("saisie3", "AGE");
        TextView age = (TextView)findViewById(R.id.age);
        age.setText(String.valueOf(saisie3));

        //SEXE

        //TAILLE
        String saisie4 = pref.getString("saisie4", "TAILLE");
        TextView taille = (TextView)findViewById(R.id.taille);
        taille.setText(String.valueOf(saisie4));

        //POIDS
        String saisie5 = pref.getString("saisie5", "POIDS");
        TextView poids = (TextView)findViewById(R.id.poids);
        poids.setText(String.valueOf(saisie5));

        //PROBLEMES
        String saisie6 = pref.getString("saisie6", "PROBLEME");
        TextView probleme = (TextView)findViewById(R.id.probleme);
        probleme.setText(String.valueOf(saisie6));

        //ALLERGIES
        String saisie7 = pref.getString("saisie7", "ALLERGIE");
        TextView allergie = (TextView)findViewById(R.id.allergie);
        allergie.setText(String.valueOf(saisie7));

        //TRAITEMENTS
        String saisie8 = pref.getString("saisie8", "TRAITEMENT");
        TextView traitement = (TextView)findViewById(R.id.traitement);
        traitement.setText(String.valueOf(saisie8));


    }
}