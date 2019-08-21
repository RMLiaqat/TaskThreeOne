package au.edu.swin.taskthreeone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class second extends AppCompatActivity {
    ImageView imageviewlarge;
    TextView textviewdes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras=getIntent().getExtras();
        imageviewlarge=(ImageView)findViewById(R.id.imageViewlarge);
        textviewdes=(TextView)findViewById(R.id.textViewdescription);
        imageviewlarge.setImageDrawable(getResources().getDrawable(extras.getInt("keyimage")));
        textviewdes.setText(extras.getInt("desckey"));
    }
}
