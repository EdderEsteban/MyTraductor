package com.ddrssoft.mytraductor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.ddrssoft.mytraductor.databinding.ActivityMainBinding;
import com.ddrssoft.mytraductor.databinding.ActivityTraduccionBinding;
import com.ddrssoft.mytraductor.modelo.Palabra;

public class Traduccion extends AppCompatActivity {

    private VM_Traduccion vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Despues de agregar el binding en "build.gradle.kts", instanciar de esta forma.
        ActivityTraduccionBinding binding = ActivityTraduccionBinding.inflate(getLayoutInflater());
        //Programar el seteo automatico de los demas activitys usando binding
        setContentView(binding.getRoot());
        //Vincular Traduccion Activity al ViewModel e Instancear el ViewModel
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(VM_Traduccion.class);
        //Crear el Observador del Mutable de Palabras, pasando 2 parametros, el contexto y el callback es un objeto observer.
        vm.getWord().observe(this, new Observer<Palabra>() {
            @Override
            public void onChanged(Palabra palabra) {
                binding.palTraducida.setText(palabra.getTraducida());
                binding.screenshot.setImageResource(palabra.getIdFoto());
            }
        });
    }
}