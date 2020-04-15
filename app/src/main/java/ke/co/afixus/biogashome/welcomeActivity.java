package ke.co.afixus.biogashome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class welcomeActivity extends AppCompatActivity {
//#F5F0A6 color for bgs

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
      {
          //showing full screen
          getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
          // Hide the Title bar of this activity screen
          this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        button = findViewById(R.id.button_open_main);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), interchange_Activity.class);
                startActivity(intent);
            }
        });
    }
}
