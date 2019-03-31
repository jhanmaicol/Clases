package com.example.broadacast;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createNotificationChannel();

        btAction = findViewById(R.id.btAction);
        btAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Emitir el Accion de la aplicacion
                Intent intent = new Intent();
                intent.setAction("pe.edu.cibertec.ACTION1");
                sendBroadcast(intent);

                showNotifiation();
            }
        });

        //registar el Receier
        registerNotificationReceiver();
    }

    private void createNotificationChannel() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            CharSequence channel = "canal";
            String description = "Descripcion del canal";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;

            NotificationChannel notificationChannel =
                    new NotificationChannel("idChannel",channel,importance);

            notificationChannel.setDescription(description);

            NotificationManager manager= getSystemService(NotificationManager.class);
            manager.createNotificationChannel(notificationChannel);
        }
    }

    private void showNotifiation() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"idChannel")
               // .setSmallIcon(R.mipmap.ic_launcher)
                .setSmallIcon(R.drawable.ic_action_name)
                .setContentTitle("Nueva notificacion")
                .setContentText("Ejemplo de notificacion");

        NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
        managerCompat.notify(0,builder.build());
    }

    private void registerNotificationReceiver() {
        NoticicationReceiver receiver = new NoticicationReceiver();

        IntentFilter filter;
        filter = new IntentFilter();
        filter.addAction("pe.edu.cibertec.ACTION1");
        filter.addAction("android.intent.action.AIRPLANE_MODE");
        this.registerReceiver(receiver,filter);



    }
}
