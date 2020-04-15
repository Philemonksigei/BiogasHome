package ke.co.afixus.biogashome;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class interchange_Activity extends AppCompatActivity {
Button button_BioInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //showing full screen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Hide the Title bar of this activity screen
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interchange);



    }
}
