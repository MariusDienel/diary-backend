package de.doubleslash.diarybackend.business

import java.time.LocalDate

data class DiaryEntryDTO(val id: String, val title: String, val date: LocalDate, val content: String)
