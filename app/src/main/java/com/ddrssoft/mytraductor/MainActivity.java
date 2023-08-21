package com.ddrssoft.mytraductor;

import androidx.appcompat.app.AppCompatActivity;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.ddrssoft.mytraductor.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

private VM_MainActivity vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Despues de agregar el binding en "build.gradle.kts", instanciar de esta forma.
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

        //Programar el seteo automatico de los demas activitys usando binding
        setContentView(binding.getRoot());

        //Vincular el Main Activity al ViewModel e Instancear el ViewModel
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(VM_MainActivity.class);

        //Escuchar el boton Traducir
        binding.btnTraducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //llamar a la funcion "captura()" del ViewModel y pasarle el EditText "etPalabra", pero este trae un objeto editable, no un string
                //por eso hay q llamar al metodo toString() para convertirlo en String. A travez de Captura() evaluo la palabra y envio a Traduccion.
                vm.captura(binding.etPalabra.getText().toString());
            }
        });
    }

}