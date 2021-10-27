package com.example.durgapur;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> hotelsWord = new ArrayList<>();

        hotelsWord.add(new Word("Banerjee Inn", "No 3601, Satyajit Roy Path, City Centre Durgapur, Durgapur - 713216", R.mipmap.ic_banerjee_inn));
        hotelsWord.add(new Word("Citi Residenci", "Shahid Khudiram Sarani Road, City Centre Durgapur, Durgapur - 713216", R.mipmap.ic_citi_residenci));
        hotelsWord.add(new Word("City Internatonal", "Satyajit Ray Sarani Rd, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_city_international));
        hotelsWord.add(new Word("Fortune", "C71/A, Shahid Khudiram Sarani, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_fortune));
        hotelsWord.add(new Word("Hotel Delta Suites", "C-97, Shahid Khudiram Sarani, opp. Junction Mall, Recol Park, Durgapur, West Bengal 713216", R.mipmap.ic_delta_suites));
        hotelsWord.add(new Word("The Peerless Inn", "223, Shahid Khudiram Sarani, City Centre Durgapur, Durgapur - 713216", R.mipmap.ic_peerless_inn));
        hotelsWord.add(new Word("Morvee Hotel", "Ananda Gopal Mukherjee Sarani Rd, Benachity, Durgapur, West Bengal 713213", R.mipmap.ic_morvee_hotel));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, hotelsWord, R.color.category_hotels);

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
