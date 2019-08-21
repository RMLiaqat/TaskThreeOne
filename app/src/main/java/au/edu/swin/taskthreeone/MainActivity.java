package au.edu.swin.taskthreeone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=(ImageView)findViewById(R.id.imageView1);
        img2=(ImageView)findViewById(R.id.imageView2);
        img3=(ImageView)findViewById(R.id.imageView3);


        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail(R.drawable.rao, R.string.rao);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail(R.drawable.kramat, R.string.karamt);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDetail(R.drawable.karamt2, R.string.karamat2);
            }
        });
    }

    public void showDetail(int image, int des)
    {
        Bundle databundle =new Bundle();
        databundle.putInt("keyimage",image);
        databundle.putInt("desckey", des);
        Intent intent=new Intent(MainActivity.this,second.class);
        intent.putExtras(databundle);
        startActivity(intent);

    }

}
