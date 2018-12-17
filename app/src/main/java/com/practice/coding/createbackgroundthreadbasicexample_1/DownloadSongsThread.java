package com.practice.coding.createbackgroundthreadbasicexample_1;

import android.util.Log;

public class DownloadSongsThread extends Thread {
    private static final String TAG = "myTag";

    @Override
    public void run() {
        for (String songName: Playlist.songs) {
            downloadSong(songName);
        }
    }

    private void downloadSong(String songName)
    {
        Log.i(TAG, "Downloading start. . .");
        try { Thread.sleep(4000); } catch (InterruptedException e) { }

        Log.i(TAG, "Song Downloaded : "+songName);
    }
}
