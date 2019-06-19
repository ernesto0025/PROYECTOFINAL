package empresa.android.Principal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import empresa.android.R;

public class FrmLoginPersonal extends AppCompatActivity {
    Button btningresar;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        confirmarPersonal();
    }

    public void confirmarPersonal()
    {
        setContentView(R.layout.frm_login_personal);
        btningresar=(Button) findViewById(R.id.btningresar);
        btningresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                irPrincipalPersonal();
            }
        });
    }

    public void irPrincipalPersonal()
    {
        Intent objPrinStud=new Intent(FrmLoginPersonal.this,FrmPrincipalPersonal.class);
        startActivity(objPrinStud);
    }
}
