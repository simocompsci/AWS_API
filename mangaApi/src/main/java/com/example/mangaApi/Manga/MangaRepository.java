package com.example.mangaApi.Manga;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MangaRepository extends JpaRepository<Manga, UUID> {

    Manga findFirstByRomajiTitleIgnoreCase(String title);
}
