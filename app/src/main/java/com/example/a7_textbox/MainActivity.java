package com.example.a7_textbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState){

            super.onCreate(savedInstanceState);
            setContentView(R.layout.login_dialog);
            Button button = (Button) findViewById(R.id.loginBtn);

            button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick (View view){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    LayoutInflater inflater = getLayoutInflater();
                    final View viewer = (inflater.inflate(R.layout.text,null));
                    builder.setView(viewer);
                    builder.setTitle("登录界面");

                    builder.setPositiveButton("登录", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            EditText user= (EditText) viewer.findViewById(R.id.editTextUserId);
                            EditText password= (EditText) viewer.findViewById(R.id.editTextPwd);
                            if(!(user.getText().toString().equals("abc")))
                                Toast.makeText(MainActivity.this, "用户登录名错误", Toast.LENGTH_LONG).show();
                            else if(!(password.getText().toString().equals("123")))
                                Toast.makeText(MainActivity.this, "用户密码错误", Toast.LENGTH_LONG).show();
                            else
                                Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();
                        }
                    });

                    builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            MainActivity.this.finish();
                            Toast.makeText(MainActivity.this, "用户按下了取消按钮", Toast.LENGTH_LONG).show();
                        }
                                     });

                    builder.show();
                }
        });
            Button button1 = (Button) findViewById(R.id.AnswerBtn);

            button1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick (View view) {
                    Toast.makeText(MainActivity.this, "请输入用户名和密码", Toast.LENGTH_LONG).show();
                }
            });

             }
        }
