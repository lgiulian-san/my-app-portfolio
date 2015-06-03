package nanodegree.udacity.com.mynanodegreeapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button spotifyStreamerBtn = (Button)findViewById(R.id.spotify_streamer_btn);
        spotifyStreamerBtn.setOnClickListener(this);
        Button scoresAppBtn = (Button)findViewById(R.id.scores_app_btn);
        scoresAppBtn.setOnClickListener(this);
        Button libraryAppBtn = (Button)findViewById(R.id.library_app_btn);
        libraryAppBtn.setOnClickListener(this);
        Button buildItBiggerBtn = (Button)findViewById(R.id.build_it_bigger_btn);
        buildItBiggerBtn.setOnClickListener(this);
        Button xyzReaderBtn = (Button)findViewById(R.id.xyz_reader_btn);
        xyzReaderBtn.setOnClickListener(this);
        Button capstoneMyOwnAppBtn = (Button)findViewById(R.id.capstone_my_own_app_btn);
        capstoneMyOwnAppBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spotify_streamer_btn:
                Toast.makeText(this, getString(R.string.launch_my_spotify_app), Toast.LENGTH_SHORT).show();
                break;
            case R.id.scores_app_btn:
                Toast.makeText(this, getString(R.string.launch_my_scores_app), Toast.LENGTH_SHORT).show();

                break;
            case R.id.library_app_btn:
                Toast.makeText(this, getString(R.string.launch_my_library_app), Toast.LENGTH_SHORT).show();

                break;
            case R.id.build_it_bigger_btn:
                Toast.makeText(this, getString(R.string.launch_my_bigger_app), Toast.LENGTH_SHORT).show();

                break;
            case R.id.xyz_reader_btn:
                Toast.makeText(this, getString(R.string.launch_my_reader_app), Toast.LENGTH_SHORT).show();

                break;
            case R.id.capstone_my_own_app_btn:
                Toast.makeText(this, getString(R.string.launch_my_capstone_app), Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
