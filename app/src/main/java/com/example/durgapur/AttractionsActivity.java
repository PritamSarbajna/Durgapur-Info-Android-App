package com.example.durgapur;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class AttractionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> attractionsWord = new ArrayList<>();

        attractionsWord.add(new Word("Durgapur Barrage", "Durgapurpurulia Raghunathpur Road, Pratappur, Bankura - 722202", R.mipmap.ic_durgapur_barrage));
        attractionsWord.add(new Word("Anand Amusement Park", "near Srijani Hall, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_anand_amusement_park));
        attractionsWord.add(new Word("Huchuk Danga", "15th St, Durgapur, West Bengal 713215", R.mipmap.ic_huchukdanga));
        attractionsWord.add(new Word("Solar Energy Park", "Plot No: C-122, CS-7(P JL No: 87, Shahid Khudiram Sarani, City Center, Durgapur, West Bengal 703216", R.mipmap.ic_solar_energy_park));
        attractionsWord.add(new Word("KMP", "130, Sarat Chandra Ave, B-Zone, Durgapur, West Bengal 713205", R.mipmap.ic_kmp));
        attractionsWord.add(new Word("Junction Mall", "Harekrishna Konar Sarani Near Citi residency, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_junction_mall));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, attractionsWord, R.color.category_attractions);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);


    }
}
