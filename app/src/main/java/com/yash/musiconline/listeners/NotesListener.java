package com.yash.musiconline.listeners;

import com.yash.musiconline.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
