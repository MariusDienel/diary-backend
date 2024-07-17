package de.doubleslash.diarybackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DiaryBackendApplication

fun main(args: Array<String>) {
    runApplication<DiaryBackendApplication>(*args)
}
