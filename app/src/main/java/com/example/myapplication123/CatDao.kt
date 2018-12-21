package com.example.myapplication123

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.Flowable

@Dao
interface CatDao {
    @Query("SELECT * FROM Category")
    fun getAll(): Flowable<List<Category>>

    @Insert
    fun insertCurrent(imageurl: Category)
}