package de.doubleslash.diarybackend.business

import org.springframework.stereotype.Service

@Service
class DiaryService(private val diaryEntryRepository: DiaryEntryRepository) {

    fun getDiaryEntries(): List<Long> {
        return diaryEntryRepository.findAll()
    }
}