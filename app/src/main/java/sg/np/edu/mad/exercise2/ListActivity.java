package sg.np.edu.mad.exercise2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView icon = findViewById(R.id.icon);
        icon.setOnClickListener( view1 -> {
            AlertDialog.Builder popup = new AlertDialog.Builder(ListActivity.this);
            popup.setTitle("Profile");
            popup.setMessage("MADness");
            popup.setCancelable(true);
            popup.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {

                }
            });
            popup.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    Random randNm = new Random();
                    int randNm1 = randNm.nextInt(Integer.MAX_VALUE);
                    Intent i2 = new Intent(ListActivity.this, MainActivity.class);
                    i2.putExtra("number", randNm1);
                    startActivity(i2);
                }
            });

            popup.show();


        });
    }


}