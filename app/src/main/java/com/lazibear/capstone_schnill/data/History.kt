package com.lazibear.capstone_schnill.data

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity(tableName ="history_table")
data class History(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0,

    @ColumnInfo(name = "session")
    @NonNull
    val session: String,

    @ColumnInfo(name = "date")
    @NonNull
    val date: String,

): Parcelable