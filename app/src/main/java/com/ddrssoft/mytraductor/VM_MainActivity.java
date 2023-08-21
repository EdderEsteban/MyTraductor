package com.ddrssoft.mytraductor;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class VM_MainActivity extends AndroidViewModel {
    private Context contexto;
    public VM_MainActivity(@NonNull Application application) {
        super(application);
        contexto = application.getApplicationContext();
    }

    public void captura(String palabra){
        boolean valido = false;

        //Valido si la palabra esta en la lista
        switch (palabra){
            case "perro":
            case "gato":
            case "auto":
            case "naranja":
            case "durazno":
                valido = true;
                break;
            }
        if (valido == true){
            //Crear el Intent con 2 parametros, contexto y a donde sera enviado.
            Intent intPalabra = new Intent(contexto, Traduccion.class);
            //Preparamos el Intent a enviar.
            intPalabra.putExtra("palabra", palabra);
            //Informar al SO que no esta iniciando el Activity desde un Activity sino de ViewModel con una Bandera
            intPalabra.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            contexto.startActivity(intPalabra);
        }else{
            Toast.makeText(contexto, "Palabra Incorrecta", Toast.LENGTH_LONG).show();
        }
    }

}
