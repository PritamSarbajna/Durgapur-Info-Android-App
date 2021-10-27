package com.example.durgapur;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class CafeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> cafeWord = new ArrayList<>();
        cafeWord.add(new Word("Café Coffee Day", "Shop Number 305, Third Floor, Junction Mall, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_cafe_coffee_day));
        cafeWord.add(new Word("One Scoop Café", "G7QX+23X, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_one_scoop_cafe));
        cafeWord.add(new Word("F.R.I.E.N.D.S Café", "Bengal Shrishti, near to Big Bazaar Kalpataru, City Center, Durgapur, West Bengal 713216", R.mipmap.ic_friends_cafe));
        cafeWord.add(new Word("Underground Café", "Basement,Akanto Apan, beside Hotel Banerjee Inn, Durgapur, West Bengal 713216", R.mipmap.ic_underground_cafe));
        cafeWord.add(new Word("One Bite", "17, Sahid Sukumar Banerjee Sarani, near Petrol Pump, Aranyak East, Bidhannagar, Durgapur, West Bengal 713212", R.mipmap.ic_one_bite));
        cafeWord.add(new Word("Folk Fiesta Café", "Ananda Gopal Mukherjee Sarani Rd, Benachity, Durgapur, West Bengal 713213", R.mipmap.ic_folk_fiesta_cafe));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordAdapter adapter = new WordAdapter(this, cafeWord, R.color.category_coffee);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
