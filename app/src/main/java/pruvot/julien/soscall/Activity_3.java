package pruvot.julien.soscall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class Activity_3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner groupeS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        //Récupération du Spinner
        groupeS = (Spinner) findViewById(R.id.groupeS);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.groupeSanguin, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        groupeS.setAdapter(adapter);
        groupeS.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}