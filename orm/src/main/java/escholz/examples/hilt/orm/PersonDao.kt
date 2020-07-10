package escholz.examples.hilt.orm

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import escholz.examples.hilt.orm.entities.Person

@Dao
interface PersonDao {
    @Query("SELECT * FROM person")
    fun findAll(): List<Person>

    @Query("SELECT * FROM person WHERE id = :id")
    fun findById(id: Int): Person?

    @Insert
    fun add(person: Person): Long

    @Delete
    fun remove(person: Person): Int
}