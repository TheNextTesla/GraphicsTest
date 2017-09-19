package independent_study.graphicstest;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import independent_study.graphicstest.gameFramework.implementation.AndroidFastRenderView;

/**
 * http://www.kilobolt.com/day-2-basic-framework
 *
 */
public class MainActivity extends AppCompatActivity
{
    private static final int FRAME_WIDTH = 1200;
    private static final int FRAME_HEIGHT = 800;

    private AndroidFastRenderView androidFastRenderView;
    private PowerManager.WakeLock wakeLock;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //https://stackoverflow.com/questions/4561527/i-want-to-make-my-application-only-in-landscape-in-android
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        Bitmap frameBuffer = Bitmap.createBitmap(FRAME_WIDTH, FRAME_HEIGHT, Bitmap.Config.RGB_565);
        float scaleX = (float) FRAME_WIDTH / getWindowManager().getDefaultDisplay().getWidth();
        float scaleY = (float) FRAME_HEIGHT / getWindowManager().getDefaultDisplay().getHeight();

    }

    @Override
    public void onResume()
    {
        super.onResume();
    }

    @Override
    public void onPause()
    {
        super.onPause();
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();

    // Used to load the 'native-lib' library on application startup.
    static
    {
        System.loadLibrary("native-lib");
    }
}
