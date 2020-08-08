package lockdown.org.implicitintentdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity
{
    Button btnNext;
    protected void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent i=new Intent("home");
                startActivity(i);
            }
        });
    }
}
