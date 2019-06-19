package empresa.android.Controlador;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import empresa.android.Principal.FrmLoginPersonal;

public class PersonalControlador  extends Service {

    public PersonalControlador(){

    }

    public void onCreate(){
        super.onCreate();
        Intent objItentStudent=new Intent(PersonalControlador.this, FrmLoginPersonal.class);
        startActivity(objItentStudent);
    }

    @Override

    public IBinder onBind(Intent intent){

        throw new UnsupportedOperationException("Not yet implemented");

    }
}
