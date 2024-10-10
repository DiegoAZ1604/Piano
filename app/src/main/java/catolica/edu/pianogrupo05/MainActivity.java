package catolica.edu.pianogrupo05;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
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
    private MediaPlayer mediaPlayerDo, mediaPlayerRe, mediaPlayerMi, mediaPlayerFa, mediaPlayerSol, mediaPlayerLa,
            mediaPlayerSi, mediaPlayerDoHigh;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mediaPlayerDo = MediaPlayer.create(this, R.raw.do1);
        mediaPlayerRe = MediaPlayer.create(this, R.raw.re);
        mediaPlayerMi = MediaPlayer.create(this, R.raw.mi);
        mediaPlayerFa = MediaPlayer.create(this, R.raw.fa);
        mediaPlayerSol = MediaPlayer.create(this, R.raw.sol);
        mediaPlayerLa = MediaPlayer.create(this, R.raw.la);
        mediaPlayerSi = MediaPlayer.create(this, R.raw.si);
        mediaPlayerDoHigh = MediaPlayer.create(this, R.raw.do2);
    }
    private void playSound(MediaPlayer mediaPlayer){
        if (mediaPlayer != null){
            mediaPlayer.seekTo(0);
            mediaPlayer.start();
        }
    }
    public void do1(View view){
        playSound(mediaPlayerDo);
        showToast("Do");
    }
    public void re(View view){
        playSound(mediaPlayerRe);
        showToast("Re");
    }
    public void mi(View view){
        playSound(mediaPlayerMi);
        showToast("Mi");
    }
    public void fa(View view){
        playSound(mediaPlayerFa);
        showToast("Fa");
    }
    public void sol(View view){
        playSound(mediaPlayerSol);
        showToast("Sol");
    }
    public void la(View view){
        playSound(mediaPlayerLa);
        showToast("La");
    }
    public void si(View view){
        playSound(mediaPlayerSi);
        showToast("Si");
    }
    public void do2(View view){
        playSound(mediaPlayerDoHigh);
        showToast("Do");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayerDo != null){
            mediaPlayerDo.release();
        }
        if(mediaPlayerRe != null){
            mediaPlayerRe.release();
        }
        if(mediaPlayerMi != null){
            mediaPlayerMi.release();
        }
        if(mediaPlayerFa != null){
            mediaPlayerFa.release();
        }
        if(mediaPlayerSol != null){
            mediaPlayerSol.release();
        }
        if(mediaPlayerLa != null){
            mediaPlayerLa.release();
        }
        if(mediaPlayerSi != null){
            mediaPlayerSi.release();
        }
        if(mediaPlayerDoHigh != null){
            mediaPlayerDoHigh.release();
        }
    }
}
