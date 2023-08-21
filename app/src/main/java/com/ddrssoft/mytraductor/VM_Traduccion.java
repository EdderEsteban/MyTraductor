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

        switch (palabra) {
            case "perro":
                Palabra palPerro = new Palabra("perro", "Dog", R.drawable.perro);
                word.setValue(palPerro);
                break;
            case "gato":
                Palabra palGato = new Palabra("gato", "Cat", R.drawable.gato);
                word.setValue(palGato);
                break;
            case "auto":
                Palabra palAuto = new Palabra("auto", "Car", R.drawable.auto);
                word.setValue(palAuto);
                break;
            case "naranja":
                Palabra palNaranja = new Palabra("perro", "Dog", R.drawable.perro);
                word.setValue(palNaranja);
                break;
            case "durazno":
                Palabra palDurazno = new Palabra("perro", "Dog", R.drawable.perro);
                word.setValue(palDurazno);
                break;
            }

    }

}
