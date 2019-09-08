package th.ac.su.sc.midterm07590480;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import th.ac.su.sc.midterm07590480.Model.Auth;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText userEditText = findViewById(R.id.user_editText);
                EditText passwordEditText = findViewById(R.id.pass_editText);

                String InputUser = userEditText.getText().toString();
                String InputPassword = passwordEditText.getText().toString();


                Auth auth = new Auth();
                auth.setEmail(InputUser);
                auth.setPassword(InputPassword);

                if (auth.check() == 1) {
                    Intent intent = new Intent(LoginActivity.this,ProfiletwoActivity.class);
                    intent.putExtra("aaa", "111");
                    startActivity(intent);


                } else if (auth.check() == 2) {
                    Intent intent = new Intent(LoginActivity.this,ProfileoneActivity.class);
                    intent.putExtra("bbb", "222");
                    startActivity(intent);

                } else if (auth.check() == -1) {
                    new AlertDialog.Builder(LoginActivity.this)
                            .setTitle("Error").setMessage(getString(R.string.invalid))
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();
                }
            }
        });




    }
}
