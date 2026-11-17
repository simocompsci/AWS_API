package com.example.mangaApi.Manga;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangaApi.DTO.MangaListResponse;
import com.example.mangaApi.DTO.SearchResponse;

@RequestMapping ("/api/v1/manga")
@RestController
public class MangaController {

    private final MangaService mangaService;

    public MangaController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    @GetMapping("/")
    public ResponseEntity<Page<MangaListResponse>> getAllManga(@RequestParam(defaultValue = "0") int page) {

        Pageable pageable = PageRequest.of(page, 10);

        Page<MangaListResponse> manga = mangaService.getAllManga(pageable);

        return ResponseEntity.ok(manga);
    }

    @GetMapping("/search")
    public ResponseEntity<SearchResponse> searchManga(@RequestParam String title) {
        SearchResponse manga = mangaService.searchManga(title);

        return ResponseEntity.ok(manga);

    }

}
