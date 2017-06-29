package jp.co.cyberagent.android.gpuimage.videosupport;

/**
 * Created by BBT007 on 15/06/2017.
 */
public interface CameraFrameReceivedCallback {
    void onCameraPreview(byte[] data, int width, int height);
}