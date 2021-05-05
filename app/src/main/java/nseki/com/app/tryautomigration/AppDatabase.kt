package nseki.com.app.tryautomigration

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RenameColumn
import androidx.room.RoomDatabase
import androidx.room.migration.AutoMigrationSpec

@Database(
    version = 3,
    exportSchema = true,
    entities = [
        Books::class
    ],
    autoMigrations = [
        AutoMigration(from = 1, to = 2),
        AutoMigration(from = 2, to = 3, spec = AppDatabase.BooksMigrationSpec::class)
    ]
)
abstract class AppDatabase : RoomDatabase() {

    @RenameColumn(tableName = "Books", fromColumnName = "title", toColumnName = "name")
    class BooksMigrationSpec : AutoMigrationSpec
}
