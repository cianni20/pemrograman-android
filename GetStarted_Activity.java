package apps.jobcourse.com;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class GetStarted_Activity extends AppCompatActivity {
    Button btn_signin,btn_newaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getstarted);

        btn_signin = findViewById(R.id.btn_signin);


        btn_newaccount=findViewById(R.id.btn_signup);

    }
}

