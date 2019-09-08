package th.ac.su.sc.midterm07590480;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ProfiletwoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiletwo);

        Intent intent = getIntent();
        String a1 = intent.getStringExtra("bbb");
        Toast.makeText(ProfiletwoActivity.this,/*String*/getString(R.string.welcome2), Toast.LENGTH_SHORT).show();
    }
}
