package nseki.com.app.tryautomigration

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Books(
    @PrimaryKey val title: String,
    val author: String
)
