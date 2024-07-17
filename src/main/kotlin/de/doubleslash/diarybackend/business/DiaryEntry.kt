package de.doubleslash.diarybackend.business

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "t_diary_entry")
data class DiaryEntry(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    val id: String,
    val title: String,
    val date: LocalDate,
    val content: String
)
