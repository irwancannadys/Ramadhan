package com.domikado.ramadhan;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.username)
    EditText username;
    @BindView(R.id.passwrod)
    EditText passwrod;
    @BindView(R.id.buttonSignin)
    Button buttonSignin;
    @BindView(R.id.signUP)
    TextView button2;

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.buttonSignin)
    public void goToHome(){
        startActivity(new Intent(getApplicationContext(), HomePage.class));
    }

    @OnClick(R.id.signUP)
    public void goToSignU(){
        showSignUp();
    }

    private void showSignUp(){
        final AlertDialog.Builder alert = new AlertDialog.Builder(this);
        LayoutInflater layoutInflater = this.getLayoutInflater();
        alert.setTitle("Please Registration");
        View view = layoutInflater.inflate(R.layout.sign_up_dialog, null);
        final EditText etUsername = (EditText)view.findViewById(R.id.username_signUp);
        EditText etpassword = (EditText)view.findViewById(R.id.sign_password);
        TextView tv_message = (TextView)view.findViewById(R.id.tv_message);
        ProgressBar progress = (ProgressBar)view.findViewById(R.id.progress);
        alert.setView(view);
        alert.setPositiveButton("Back", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                alert.setCancelable(true);
            }
        });
        dialog = alert.create();

        alert.setNegativeButton("Register", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String a = etUsername.getText().toString();
                Toast.makeText(MainActivity.this, "username " + a, Toast.LENGTH_SHORT).show();
            }
        });
        alert.show();
    }
}
