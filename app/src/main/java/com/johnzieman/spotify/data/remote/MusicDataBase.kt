package com.johnzieman.spotify.data.remote

import com.google.firebase.firestore.FirebaseFirestore
import com.johnzieman.spotify.data.entities.Song
import com.johnzieman.spotify.other.Constants.SONG_COLLECTION
import kotlinx.coroutines.tasks.await

class MusicDataBase {
    private val fireStore = FirebaseFirestore.getInstance()
    private val songCollection = fireStore.collection(SONG_COLLECTION)

    suspend fun getAllSongs(): List<Song> {
        return try {
            songCollection.get().await().toObjects(Song::class.java)
        } catch (e: Exception) {
            emptyList()
        }
    }
}