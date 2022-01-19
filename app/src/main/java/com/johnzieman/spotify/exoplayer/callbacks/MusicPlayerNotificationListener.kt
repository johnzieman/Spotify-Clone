package com.johnzieman.spotify.exoplayer.callbacks

import com.google.android.exoplayer2.ui.PlayerNotificationManager
import com.johnzieman.spotify.exoplayer.MusicService

class MusicPlayerNotificationListener(
    private val musicService: MusicService
): PlayerNotificationManager.NotificationListener {

}