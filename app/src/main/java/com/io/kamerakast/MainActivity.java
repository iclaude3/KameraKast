package com.io.kamerakast;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottomNavigation);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_stream:
                        Toast.makeText(MainActivity.this, "Stream",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_connect:
                        Toast.makeText(MainActivity.this, "Connect",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_home:
                    default:
                        Toast.makeText(MainActivity.this, "Home",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
