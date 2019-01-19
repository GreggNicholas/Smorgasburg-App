package Notification_App_HW_Nicholas_Gregg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.greggnicholas.Notification_App_HW_Nicholas_Gregg.R;

public class SplashPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash_page);
        getSupportActionBar();
        SplashPage splashPage = new SplashPage();
        splashPage.start();


    }

    private void start() {
    }


    private class splashPage extends Thread {

        public void run() {

            try {
                sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            String action;
            Intent intent = new Intent(SplashPage.this, MainActivity.class);
            startActivity(intent);
            try {
                splashPage.this.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }


}
