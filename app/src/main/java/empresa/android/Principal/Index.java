package empresa.android.Principal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import empresa.android.R;

public class Index extends AppCompatActivity {

    ImageButton btnpersonal,btnalumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        iniComponents();

    }

    public void iniComponents()
    {
        setContentView(R.layout.activity_index);
        btnpersonal=(ImageButton)findViewById(R.id.btnpersonal);
        btnpersonal.setOnClickListener(new View.OnClickListener()
        {
            @Override
        public void onClick(View v)
        {
            IrAlPersonal();
        }
        });

        btnalumno=(ImageButton)findViewById(R.id.btnalumno);
        btnalumno.setOnClickListener(new View.OnClickListener()
        {   @Override
        public void onClick(View v)
        {
            IrAlAlumno();
        }
        });
    }
    public void IrAlPersonal()
    {
        Intent objIntentpersonal=new Intent(Index.this, FrmLoginPersonal.class);
        startActivity(objIntentpersonal);
        finish();
    }
    public void IrAlAlumno()
    {
        Intent objIntentalumno=new Intent(Index.this, FrmLoginAlumno.class);
        startActivity(objIntentalumno);
        finish();
    }
}
