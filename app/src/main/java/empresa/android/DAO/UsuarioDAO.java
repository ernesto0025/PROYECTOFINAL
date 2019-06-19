package empresa.android.DAO;

import empresa.android.BEAN.UsuarioBean;

public class UsuarioDAO {
    //Datos de acceso para los estudiantes

    String usuarioestudiante[]={"ivan","ciro","larissa","alberto"};
    String passestudiante[]={"123","123","123","123"};

    //Datos de acceso para los administradores
    String usuarioadmin[]={"admin1","admin2","admin3","admin4"};
    String passadmin[]={"123","123","123","123"};


    //Datos de acceso para los profesores
    String usuarioprofesor[]={"docente1","docente2","docente3","docente4"};
    String passprofesor[]={"123","123","123","123"};

    public boolean validarUsuario(UsuarioBean objUsuB){
        boolean estado=false;
        int op=Integer.parseInt(objUsuB.getTipousuario());
        try{
            switch (op){
                case 1:{
                    for (int i=0;i<usuarioestudiante.length;i++){
                        if(objUsuB.getUsuario().equals(usuarioestudiante[i]) && objUsuB.getPassword().equals(passestudiante[i])){
                            estado=true;
                            break;
                        }
                    }
                    break;
                }

                case 2:{
                    for (int i=0;i<usuarioprofesor.length;i++){
                        if (objUsuB.getUsuario().equals(usuarioprofesor) && objUsuB.getPassword().equals(passprofesor)){
                            estado=true;
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    for (int i=0;i<usuarioadmin.length;i++){
                        if (objUsuB.getUsuario().equals(usuarioadmin) && objUsuB.getPassword().equals(passadmin)){
                            estado=true;
                            break;
                        }
                        break;
                    }
                }
            }

        }catch (Exception e){
            estado=false;
        }
        return estado;
    }
}
