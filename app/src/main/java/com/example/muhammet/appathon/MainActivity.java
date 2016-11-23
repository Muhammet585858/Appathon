package com.example.muhammet.appathon;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

public class MainActivity extends AppCompatActivity {

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                setTheme(R.style.AppTheme);
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
            }

            public void onButtonClick(View v){
                if(v.getId() == R.id.button2){
                    Intent i = new Intent(MainActivity.this, Microphone.class);
                    startActivity(i);

                }
            }
}
