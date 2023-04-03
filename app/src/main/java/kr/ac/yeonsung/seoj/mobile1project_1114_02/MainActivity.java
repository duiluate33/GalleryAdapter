package kr.ac.yeonsung.seoj.mobile1project_1114_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import java.nio.channels.GatheringByteChannel;

public class MainActivity<Public> extends AppCompatActivity {
    ImageView imgvlarge;
    int[] imgIds = { R.drawable.ageofultron, R.drawable.blackpanther,R.drawable.blackw,
            R.drawable.captainmarble, R.drawable.civilwar,R.drawable.endwar,R.drawable.hulk,
            R.drawable.lagna,R.drawable.nowayhome,R.drawable.strange,R.drawable.wacanda,R.drawable.winter};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgvlarge = findViewById(R.id.imgv_large);
        Gallery gallery = findViewById(R.id.gallery);
        GalleryAdapter adapter = new GalleryAdapter(this);
        gallery.setAdapter(adapter);

    }
    public class GalleryAdapter extends BaseAdapter {
        Context context;
        public GalleryAdapter(Context context){
            this.context = context;
        }

        @Override
        public int getCount() {
            return imgIds.length; //imgIds의 항목의 개수를 만들어라
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
            final int index = i;
            ImageView imgv = new ImageView(context);
            imgv.setLayoutParams(new Gallery.LayoutParams(200,300));
            imgv.setImageResource(imgIds[i]);
            imgv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imgvlarge.setImageResource(imgIds[index]);
                }
            });
            return imgv; //꼭 반환시켜줘야함
        }
    }
}