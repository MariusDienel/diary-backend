package de.doubleslash.diarybackend.business

import java.time.LocalDate

data class DiaryEntry(val id: String, val title: String, val date: LocalDate, val content: String)
