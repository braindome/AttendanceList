package com.example.attendancelist


// Singleton object
object DataManager {
    val students = mutableListOf<Student>()

    init {
        createMockData()
    }


    fun createMockData() {
        students.add(Student("Antonio", "APP22", true))
        students.add(Student("Khaled", "APP22"))
        students.add(Student("Ahmed", "APP22"))
        students.add(Student("Gustaf", "APP22"))
        students.add(Student("Mattias", "APP22", true))
        students.add(Student("Patrik", "APP22"))
    }
}