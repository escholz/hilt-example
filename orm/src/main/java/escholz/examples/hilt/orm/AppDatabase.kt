package escholz.examples.hilt.orm

import androidx.room.Database
import androidx.room.RoomDatabase
import escholz.examples.hilt.orm.entities.Person

@Database(entities = [Person::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun personDao(): PersonDao
}