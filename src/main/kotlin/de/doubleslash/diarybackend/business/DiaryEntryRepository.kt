package de.doubleslash.diarybackend.business

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DiaryEntryRepository : JpaRepository<Long,DiaryEntry> {
}