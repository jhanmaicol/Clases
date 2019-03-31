package com.example.broadacast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NoticicationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        switch (intent.getAction()){
            case "pe.edu.cibertec.ACTION1":
                Toast.makeText(context,"Accion de la aplicacion", Toast.LENGTH_SHORT).show();
                break;

            case "android.intent.action.AIRPLANE_MODE":
                Toast.makeText(context,"Accion Modo Avion", Toast.LENGTH_SHORT).show();
                break;
        }


    }
}
