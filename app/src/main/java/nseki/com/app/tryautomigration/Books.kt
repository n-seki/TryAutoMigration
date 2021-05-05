package nseki.com.app.tryautomigration

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Books(
    @PrimaryKey val title: String,
    val author: String,
    @ColumnInfo(defaultValue = "0") val page: Int
)
