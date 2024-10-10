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

public class Activity2 extends AppCompatActivity {
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
    private MediaPlayer mediaPlayerElefante, mediaPlayerHiena, mediaPlayerLemur, mediaPlayerLeon, mediaPlayerMono, mediaPlayerRana,
            mediaPlayerTucan, mediaPlayerCulebra;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        mediaPlayerElefante = MediaPlayer.create(this, R.raw.elefante);
        mediaPlayerHiena = MediaPlayer.create(this, R.raw.hiena);
        mediaPlayerLemur = MediaPlayer.create(this, R.raw.lemur);
        mediaPlayerLeon = MediaPlayer.create(this, R.raw.leon);
        mediaPlayerMono = MediaPlayer.create(this, R.raw.mono);
        mediaPlayerRana = MediaPlayer.create(this, R.raw.rana);
        mediaPlayerTucan = MediaPlayer.create(this, R.raw.tucan);
        mediaPlayerCulebra = MediaPlayer.create(this, R.raw.culebra);
    }
    private void playSound(MediaPlayer mediaPlayer){
        if (mediaPlayer != null){
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }

    public void elefante(View view){
        playSound(mediaPlayerElefante);
        showToast("Elefante");
    }
    public void hiena(View view){
        playSound(mediaPlayerHiena);
        showToast("Hiena");
    }
    public void lemur(View view){
        playSound(mediaPlayerLemur);
        showToast("Lemur");
    }
    public void leon(View view){
        playSound(mediaPlayerLeon);
        showToast("Leon");
    }
    public void mono(View view){
        playSound(mediaPlayerMono);
        showToast("Mono");
    }
    public void rana(View view){
        playSound(mediaPlayerRana);
        showToast("Rana");
    }
    public void tucan(View view){
        playSound(mediaPlayerTucan);
        showToast("Tucan");
    }
    public void culebra(View view){
        playSound(mediaPlayerCulebra);
        showToast("Serpiente");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayerElefante != null){
            mediaPlayerElefante.release();
        }
        if(mediaPlayerHiena != null){
            mediaPlayerHiena.release();
        }
        if(mediaPlayerLemur != null){
            mediaPlayerLemur.release();
        }
        if(mediaPlayerLeon != null){
            mediaPlayerLeon.release();
        }
        if(mediaPlayerMono != null){
            mediaPlayerMono.release();
        }
        if(mediaPlayerRana != null){
            mediaPlayerRana.release();
        }
        if(mediaPlayerTucan != null){
            mediaPlayerTucan.release();
        }
        if(mediaPlayerCulebra != null){
            mediaPlayerCulebra.release();
        }
    }

}
