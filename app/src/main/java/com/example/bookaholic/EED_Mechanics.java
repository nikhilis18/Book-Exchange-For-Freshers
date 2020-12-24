package com.example.bookaholic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class EED_Mechanics extends AppCompatActivity {

    ListView listView;
    String [] bookName = {"Engineering Drawings\nVols-1 & 2","Engineering Drawing","Engineering Mechanics","Engineering Mechanics"};
    String [] author = {"K. R. Gopalakrishna","N.D Bhat& V.M Panchal","A. Nelson","S.S Bhavikatti"};
    String [] edition = {"","45th Edition","1st Edition","Fifth Edition"};
    int[] images = {R.drawable.kr_gopalakrishna,R.drawable.nd_bhatt,R.drawable.a_nelson,R.drawable.ss_bhavikatti};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e_e_d__mechanics);

        listView = findViewById(R.id.listView_eed_mechanics);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.custom_list_view,null);
            ImageView bookImage = view.findViewById(R.id.bookImage);
            TextView bookTitle = view.findViewById(R.id.bookTitle);
            TextView bookAuthor = view.findViewById(R.id.bookAuthor);
            TextView bookEdition = view.findViewById(R.id.bookEdition);

            bookImage.setImageResource(images[i]);
            bookTitle.setText(bookName[i]);
            bookAuthor.setText(author[i]);
            bookEdition.setText(edition[i]);

            return view;
        }
    }
}