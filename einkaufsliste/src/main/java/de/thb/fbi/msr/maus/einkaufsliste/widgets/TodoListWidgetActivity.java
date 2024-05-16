package de.thb.fbi.msr.maus.einkaufsliste.widgets;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import de.thb.fbi.msr.maus.einkaufsliste.R;

import java.util.ArrayList;
import java.util.Arrays;

public class TodoListWidgetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        ListView listView = findViewById(R.id.list_view);

        ArrayList<String> todos = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.todos)));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, todos);
        listView.setAdapter(adapter);


    }
}