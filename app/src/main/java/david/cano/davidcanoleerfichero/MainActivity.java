package david.cano.davidcanoleerfichero;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.InputStream;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup rg;
        rg=(RadioGroup) findViewById(R.id.rgSonidos);
        InputStream is;
        is=getResources().openRawResource(R.raw.melodias);
        Scanner sc=new Scanner(is);
        while (sc.hasNextLine()){
            String melodia=sc.nextLine();
            RadioButton rb;
            rb=new RadioButton(this);
            rb.setText(melodia);
            rg.addView(rb);
        }
        ((RadioButton)rg.getChildAt(0)).setChecked(true);
    }
}