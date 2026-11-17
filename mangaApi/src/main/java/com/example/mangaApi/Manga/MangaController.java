package com.example.mangaApi.Manga;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mangaApi.DTO.MangaListResponse;
import com.example.mangaApi.DTO.SearchResponse;

@RestController
public class MangaController {

    private final MangaService mangaService;

    public MangaController(MangaService mangaService) {
        this.mangaService = mangaService;
    }

    @GetMapping("/topRated")
    public ResponseEntity<List<MangaListResponse>> getTopRatedManga(@RequestParam Integer page) {
        List<MangaListResponse> mangas = mangaService.getTopRatedManga(page);
        return ResponseEntity.ok(mangas);

    }

    @GetMapping("/popular")
    public ResponseEntity<List<MangaListResponse>> getPopularManga(@RequestParam Integer page) {
        List<MangaListResponse> mangas = mangaService.getPopularManga(page);
        return ResponseEntity.ok(mangas);

    }

    @GetMapping("/search")
    public ResponseEntity<SearchResponse> searchManga(@RequestParam String title) {
        SearchResponse manga = mangaService.searchManga(title);

        return ResponseEntity.ok(manga);

    }

}
