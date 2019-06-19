package empresa.android.Controlador;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import empresa.android.Principal.FrmLoginAlumno;

public class AlumnoControlador extends Service {

    public AlumnoControlador(){

    }
    public void onCreate(){
        super.onCreate();
        Intent objItentStudent=new Intent(AlumnoControlador.this, FrmLoginAlumno.class);
        startActivity(objItentStudent);
    }

    @Override

    public IBinder onBind(Intent intent){

        throw new UnsupportedOperationException("Not yet implemented");


    }
}
