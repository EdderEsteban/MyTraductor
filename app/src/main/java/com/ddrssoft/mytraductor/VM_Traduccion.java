package com.ddrssoft.mytraductor;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ddrssoft.mytraductor.modelo.Palabra;

public class VM_Traduccion extends AndroidViewModel {

    private Context contexto;
    private MutableLiveData<Palabra> word;
    public VM_Traduccion(@NonNull Application application) {
        super(application);
        this.contexto=application.getApplicationContext();
    }

    public LiveData<Palabra> getWord(){
        if (word == null){
            word = new MutableLiveData<Palabra>();
        }
        return word;
    }

    public void traducir(String palabra){
        String traduccion;
        int idFoto;

        switch (palabra) {
            case "gato":
                traduccion = "Dog";
                idFoto = R.drawable.perro;
                break;
            case "perro":
                traduccion = "Cat";
                idFoto = R.drawable.gato;
                break;
            case "rojo":
                traduccion = "Car";
                idFoto = R.drawable.auto;
                break;
            case "azul":
                traduccion = "Orange";
                idFoto = R.drawable.naranja;
                break;
            case "mesa":
                traduccion = "Peach";
                idFoto = R.drawable.durazno;
                break;
            default:
                traduccion = "No se encontró traducción";
                idFoto = R.drawable.perdido; // Imagen por defecto en caso de no encontrar una traducción
                break;
        }
    }

}
