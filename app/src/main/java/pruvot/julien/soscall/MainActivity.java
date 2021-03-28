package pruvot.julien.soscall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bouton_fiche;
    private Button bouton_modifier;
    private ImageButton bouton1;
    private ImageButton bouton2;
    private ImageButton bouton3;
    private ImageButton bouton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bouton de la fiche de santé
        this.bouton_fiche = findViewById(R.id.bouton_fiche);
        bouton_fiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity2 = new Intent(getApplicationContext(), Activity_2.class); //Création de l'activité
                startActivity(activity2); //Démarrer l'activité
                //finish(); //Arrêter l'activité précédente
            }
        });


        //Bouton pour la modification de la fiche
        this.bouton_modifier = findViewById(R.id.bouton_modifier);
        bouton_modifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity3 = new Intent(getApplicationContext(), Activity_3.class);
                startActivity(activity3);
                //finish();
            }
        });

        //Bouton Urgence
        this.bouton1 = findViewById(R.id.bouton1);
        bouton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"112"));
                startActivity(appel1);
            }
        });

        //Bouton Pompiers
        this.bouton2 = findViewById(R.id.bouton2);
        bouton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"18"));
                startActivity(appel2);
            }
        });

        //Bouton Samu
        this.bouton3 = findViewById(R.id.bouton3);
        bouton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel3 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"15"));
                startActivity(appel3);
            }
        });

        //Bouton Police
        this.bouton4 = findViewById(R.id.bouton4);
        bouton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent appel4 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"17"));
                startActivity(appel4);
            }
        });
    }
}