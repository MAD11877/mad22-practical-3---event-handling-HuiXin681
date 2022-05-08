package sg.np.edu.mad.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent recieveIntent = getIntent();
        int randomNum = recieveIntent.getIntExtra("number", 0);
        TextView username = findViewById(R.id.name);
        String display = username.getText() + " " + randomNum;
        username.setText(display);
    }

    public void followUnfollow(View view){
        Button followBtn = findViewById(R.id.follow);
        if (followBtn.getText() == "Follow"){
            followBtn.setText("Unfollow");
            Toast.makeText(MainActivity.this, "Followed", Toast.LENGTH_SHORT).show();
        }
        else{
            followBtn.setText("Follow");
            Toast.makeText(MainActivity.this, "Unfollowed", Toast.LENGTH_SHORT).show();
        }

    }

    public void messageClick (View view){
        Intent messageView = new Intent(MainActivity.this, MessageGroup.class);
        startActivity(messageView);
    }
}
