package nseki.com.app.tryautomigration

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = 1,
    exportSchema = true,
    entities = [
        Books::class
    ]
)
abstract class AppDatabase : RoomDatabase()
