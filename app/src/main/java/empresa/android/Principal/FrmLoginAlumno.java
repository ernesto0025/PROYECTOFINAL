package empresa.android.Principal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import empresa.android.R;

public class FrmLoginAlumno extends AppCompatActivity {

    Button btningresar;

    @Override

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        confirmarAlumno();
    }

    public void confirmarAlumno()

    {
        setContentView(R.layout.frm_login_alumno);
        btningresar=(Button) findViewById(R.id.btningresar);
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                irPrincipalAlumno();
            }
        });
    }

    public void irPrincipalAlumno()
    {
        Intent objPrinStud= new Intent(FrmLoginAlumno.this,FrmPrincipalAlumno.class);
        startActivity(objPrinStud);
    }

}
