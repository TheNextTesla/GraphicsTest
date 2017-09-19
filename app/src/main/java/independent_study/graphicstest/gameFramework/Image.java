package independent_study.graphicstest.gameFramework;

import independent_study.graphicstest.gameFramework.Graphics.ImageFormat;

public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
