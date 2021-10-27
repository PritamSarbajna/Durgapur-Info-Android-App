package com.example.durgapur;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HospitalsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> hospitalsWord = new ArrayList<>();

        hospitalsWord.add(new Word("The Mission Hospital", "Immon Kalyan Sarani, Sector IIC, Bidhannagar, Durgapur, West Bengal 713212", R.mipmap.ic_mission_hospital));
        hospitalsWord.add(new Word("Healthworld Hospital", "ESIC Sub-Regional Office, Gandhi More, Commercial Area, Durgapur, West Bengal 713216", R.mipmap.ic_healthworld_hospital));
        hospitalsWord.add(new Word("Vivekananda Hospital", "Dr Zakir Hussain Avenue, Durgapur Abl Township, Durgapur - 713206", R.mipmap.ic_vivekananda_hospital));
        hospitalsWord.add(new Word("Sub Divison Hospital", "G8GR+CV6, Bidhannagar, Durgapur, West Bengal 713212", R.mipmap.ic_sub_divison_hospital));
        hospitalsWord.add(new Word("IQ City Medical College", "IQ City Rd, Durgapur, West Bengal 713206", R.mipmap.ic_iq_city_hospital));
        hospitalsWord.add(new Word("Disha Eye Hospital", "223, Shahid Khudiram Sarani, City Centre Durgapur, Durgapur - 713216", R.mipmap.ic_idisha_eye_hospital));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, hospitalsWord, R.color.category_hospitals);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
