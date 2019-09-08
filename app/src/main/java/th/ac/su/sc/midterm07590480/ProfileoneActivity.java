package th.ac.su.sc.midterm07590480;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class ProfileoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profileone);

        Intent intent = getIntent();
        String a1 = intent.getStringExtra("aaa");
        Toast.makeText(ProfileoneActivity.this,/*String*/getString(R.string.welcome1), Toast.LENGTH_SHORT).show();
    }
}
