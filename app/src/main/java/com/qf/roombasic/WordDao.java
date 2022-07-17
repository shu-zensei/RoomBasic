package com.qf.roombasic;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface WordDao {

    @Insert
    void insertWord(Word...words);

    @Update
    int updateWords(Word...words);

    @Delete
    int deleteWords(Word...words);

    @Query("DELETE FROM WORD")
    void deleteAllWords();

    @Query("SELECT * FROM WORD ORDER BY ID DESC")
    void getAllWords();
}
