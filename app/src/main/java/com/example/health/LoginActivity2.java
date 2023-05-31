package com.example.health;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.health.HomeActivity2;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

import java.util.List;

public class LoginActivity2 extends AppCompatActivity {

    Button button4;
    Button button6;
    EditText txt_login_username;
    EditText txt_login_password;
    Button button5;

    private DatabaseReference dbref;//https://mobileapp-79ae2-default-rtdb.firebaseio.com/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        button4=findViewById(R.id.button4);
        button6=findViewById(R.id.button6);
        button5=findViewById(R.id.button5);
        txt_login_username=findViewById(R.id.txt_login_username);
        txt_login_password=findViewById(R.id.txt_login_password);

        dbref=FirebaseDatabase.getInstance().getReference();


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int valid=1;
                if (TextUtils.isEmpty(String.valueOf(txt_login_username.getText()))) {
                    Toast.makeText(LoginActivity2.this, "Enter Username", Toast.LENGTH_LONG).show();
                    valid=0;
                }else
                if (TextUtils.isEmpty(String.valueOf(txt_login_password.getText()))) {
                    Toast.makeText(LoginActivity2.this, "Enter Password", Toast.LENGTH_LONG).show();
                    valid=0;
                }
                if(valid==1) {
                    //Intent intent = new Intent(Login.this, Dashboard.class);
                    //startActivity(intent);
                    if(CheckUser_isvalid(String.valueOf(txt_login_username.getText()),String.valueOf(txt_login_password.getText()))!="")
                    {
                        //validate with firebase

                        dbref.child("Logins").addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if(snapshot.hasChild(txt_login_username.getText().toString().trim()))
                                {

                                    //check password
                                    final String getPassword=snapshot.child(txt_login_username.getText().toString().trim()).child("password").getValue(String.class);

                                    //Toast.makeText(Login.this, get, Toast.LENGTH_LONG).show();

                                    if(getPassword.equals(txt_login_password.getText().toString()))
                                    {
                                        //final String getIsActive=snapshot.child(txt_login_username.getText().toString().trim()).child("isactive").getValue(String.class);
                                        Toast.makeText(LoginActivity2.this, "Successful login ", Toast.LENGTH_LONG).show();
                                        Intent intent=new Intent(LoginActivity2.this, HomeActivity2.class);
                                        startActivity(intent);

                                    }else {
                                        Toast.makeText(LoginActivity2.this, "Invalid login", Toast.LENGTH_LONG).show();

                                    }


                                }else {
                                    Toast.makeText(LoginActivity2.this, "Invalid login", Toast.LENGTH_LONG).show();

                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                        // Intent intent=new Intent(Login.this,Dashboard.class);
                        // startActivity(intent);

                    }
                    else {
                        Toast.makeText(LoginActivity2.this, "Wrong Credentials", Toast.LENGTH_LONG).show();

                    }
                }

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity2.this,OneActivity2.class);
                startActivity(intent);
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity2.this,SignupActivity2.class);
                startActivity(intent);
            }
        });


    }
    public String CheckUser_isvalid(String UserName,String Password)
    {
        final String[] val = {""};


        DatabaseReference conn= FirebaseDatabase.getInstance().getReference().child("logins");
        conn.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                for(DataSnapshot snapshot1:snapshot.getChildren())
                {

                    if(snapshot1.getKey().equals("username"))
                    {
                        String db_name=snapshot1.getValue().toString();


                        val[0]="yes";
                        Toast.makeText(LoginActivity2.this,db_name , Toast.LENGTH_LONG).show();



                    }
                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        return "yes";
    }

}