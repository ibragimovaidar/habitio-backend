package ru.itis.habitio.habitiobackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HabitioBackendApplication

fun main(args: Array<String>) {
	runApplication<HabitioBackendApplication>(*args)
}
