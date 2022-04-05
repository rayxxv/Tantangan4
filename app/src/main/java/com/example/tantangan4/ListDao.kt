package com.example.tantangan4

import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE


@Dao
interface ListDao {
    @Query("SELECT * FROM List")
    fun getAllItem(): kotlin.collections.List<List>

    @Insert(onConflict = REPLACE)
    fun insertItem(list: List):Long

    @Update
    fun updateItem(list: List):Int

    @Delete
    fun deleteItem(list: List):Int

}