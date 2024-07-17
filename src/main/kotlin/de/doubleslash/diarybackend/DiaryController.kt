package de.doubleslash.diarybackend

import de.doubleslash.diarybackend.business.DiaryEntry
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.time.LocalDate

@RestController
class DiaryController {

    @GetMapping("/entries")
    fun getDiaryEntry(): Flux<DiaryEntry> {
        return Flux.just(
            DiaryEntry("1111-2222-3333-444", "First entry", LocalDate.of(2024,7,15), "Today I walked the beach."),
            DiaryEntry("1111-2222-3333-444", "First entry", LocalDate.of(2024,7,16), "Today I was at a party.")
        )
    }
}