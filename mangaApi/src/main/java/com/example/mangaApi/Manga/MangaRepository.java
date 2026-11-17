package com.example.mangaApi.Manga;

import java.util.UUID;

import org.hibernate.query.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MangaRepository extends JpaRepository<Manga, UUID> {

    Manga findFirstByRomajiTitleIgnoreCase(String title);

    Page<Manga> findAll(Pageable pageable);

}
