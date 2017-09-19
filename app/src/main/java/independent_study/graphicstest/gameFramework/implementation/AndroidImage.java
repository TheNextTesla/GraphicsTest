package independent_study.graphicstest.gameFramework.implementation;

import android.graphics.Bitmap;

import independent_study.graphicstest.gameFramework.Graphics;
import independent_study.graphicstest.gameFramework.Image;

public class AndroidImage implements Image {
    Bitmap bitmap;
    Graphics.ImageFormat format;
    
    public AndroidImage(Bitmap bitmap, Graphics.ImageFormat format) {
        this.bitmap = bitmap;
        this.format = format;
    }

    @Override
    public int getWidth() {
        return bitmap.getWidth();
    }

    @Override
    public int getHeight() {
        return bitmap.getHeight();
    }

    @Override
    public Graphics.ImageFormat getFormat() {
        return format;
    }

    @Override
    public void dispose() {
        bitmap.recycle();
    }      
}
