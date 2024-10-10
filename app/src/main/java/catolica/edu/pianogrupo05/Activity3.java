package catolica.edu.pianogrupo05;

import android.view.Menu;
import android.view.MenuInflater;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.overflow, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        Intent intent;
        if (id == R.id.item1) {
            intent = new Intent(this, MainActivity.class);
        } else if (id == R.id.item2) {
            intent = new Intent(this, Activity2.class);
        } else if (id == R.id.item3) {
            intent = new Intent(this, Activity3.class);
        } else {
            return super.onOptionsItemSelected(item);
        }
        startActivity(intent);
        return true;
    }
    private void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    private MediaPlayer mediaPlayerAcordeon, mediaPlayerCongo, mediaPlayerGuitarra, mediaPlayerMaracas, mediaPlayerPandereta, mediaPlayerPlatillo,
            mediaPlayerTrompeta, mediaPlayerSaxofon;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        mediaPlayerAcordeon = MediaPlayer.create(this, R.raw.acordeon);
        mediaPlayerCongo = MediaPlayer.create(this, R.raw.congo);
        mediaPlayerGuitarra = MediaPlayer.create(this, R.raw.guitarra);
        mediaPlayerMaracas = MediaPlayer.create(this, R.raw.maracas);
        mediaPlayerPandereta = MediaPlayer.create(this, R.raw.pandereta);
        mediaPlayerPlatillo = MediaPlayer.create(this, R.raw.platillo);
        mediaPlayerTrompeta = MediaPlayer.create(this, R.raw.trompeta);
        mediaPlayerSaxofon = MediaPlayer.create(this, R.raw.saxofon);
    }
    private void playSound(MediaPlayer mediaPlayer){
        if (mediaPlayer != null){
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }

    public void acordeon(View view){
        playSound(mediaPlayerAcordeon);
        showToast("Acordeon");
    }
    public void congo(View view){
        playSound(mediaPlayerCongo);
        showToast("Congo");
    }
    public void guitarra(View view){
        playSound(mediaPlayerGuitarra);
        showToast("Guitarra");
    }
    public void maracas(View view){
        playSound(mediaPlayerMaracas);
        showToast("Maracas");
    }
    public void pandereta(View view){
        playSound(mediaPlayerPandereta);
        showToast("Pandereta");
    }
    public void platillo(View view){
        playSound(mediaPlayerPlatillo);
        showToast("Platillo");
    }
    public void trompeta(View view){
        playSound(mediaPlayerTrompeta);
        showToast("Trompeta");
    }
    public void saxofon(View view){
        playSound(mediaPlayerSaxofon);
        showToast("Saxofon");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayerAcordeon != null){
            mediaPlayerAcordeon.release();
        }
        if(mediaPlayerCongo != null){
            mediaPlayerCongo.release();
        }
        if(mediaPlayerGuitarra != null){
            mediaPlayerGuitarra.release();
        }
        if(mediaPlayerMaracas != null){
            mediaPlayerMaracas.release();
        }
        if(mediaPlayerPandereta != null){
            mediaPlayerPandereta.release();
        }
        if(mediaPlayerPlatillo != null){
            mediaPlayerPlatillo.release();
        }
        if(mediaPlayerTrompeta != null){
            mediaPlayerTrompeta.release();
        }
        if(mediaPlayerSaxofon != null){
            mediaPlayerSaxofon.release();
        }
    }

}
