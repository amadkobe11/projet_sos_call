package pruvot.julien.soscall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class Activity_3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner groupeS;
    Button confirm;
    EditText s1;
    EditText s2;
    EditText s3;
    EditText s4;
    EditText s5;
    EditText s6;
    EditText s7;
    EditText s8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //Données
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = pref.edit();

        //Récupération du Spinner
        groupeS = (Spinner) findViewById(R.id.groupeS);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.groupeSanguin, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        groupeS.setAdapter(adapter);
        groupeS.setOnItemSelectedListener(this);

        //Récupération du bouton et zone de saisie
        confirm = (Button)findViewById(R.id.bouton_confirmer);
        s1 = (EditText)findViewById(R.id.saisie1);
        s2 = (EditText)findViewById(R.id.saisie2);
        s3 = (EditText)findViewById(R.id.saisie3);
        s4 = (EditText)findViewById(R.id.saisie4);
        s5 = (EditText)findViewById(R.id.saisie5);
        s6 = (EditText)findViewById(R.id.saisie6);
        s7 = (EditText)findViewById(R.id.saisie7);
        s8 = (EditText)findViewById(R.id.saisie8);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (s1.getText().length() == 0 | s2.getText().length() == 0 | s3.getText().length() == 0 | s4.getText().length() == 0 | s5.getText().length() == 0) {
                    Toast.makeText(Activity_3.this, "Tous les champs ne sont pas renseignés !", Toast.LENGTH_LONG).show();
                } else {
                    //Récupération et convertion de la saisie (EditText) en String
                    String saisie1 = s1.getText().toString();
                    String saisie2 = s2.getText().toString();
                    String saisie3 = s3.getText().toString();
                    String saisie4 = s4.getText().toString();
                    String saisie5 = s5.getText().toString();
                    String saisie6 = s6.getText().toString();
                    String saisie7 = s7.getText().toString();
                    String saisie8 = s8.getText().toString();

                    Intent otherActivity = new Intent(getApplicationContext(), Activity_2.class);

                    //Extras
                    editor.putString("saisie1", saisie1);
                    editor.putString("saisie2", saisie2);
                    editor.putString("saisie3", saisie3);
                    editor.putString("saisie4", saisie4);
                    editor.putString("saisie5", saisie5);
                    editor.putString("saisie6", saisie6);
                    editor.putString("saisie7", saisie7);
                    editor.putString("saisie8", saisie8);


                    //Sauvegarde des données saisies
                    editor.commit();

                    startActivity(otherActivity);


                    //Toast de bienvenue
                    Toast.makeText(Activity_3.this, "Bonjour " + s2.getText().toString() + " " + s1.getText().toString() + " ! ", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}