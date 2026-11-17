package com.example.mangaApi.Manga;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.mangaApi.DTO.MangaListResponse;
import tools.jackson.databind.ObjectMapper;
import com.example.mangaApi.DTO.SearchResponse;

@Service
public class MangaService {

    private final MangaRepository mangaRepository;
    private final ObjectMapper objectMapper;

    public MangaService(MangaRepository mangaRepository , ObjectMapper objectMapper) {
        this.mangaRepository = mangaRepository;
        this.objectMapper = objectMapper;
    }

    public List<MangaListResponse> getTopRatedManga(Integer page) {
    }

    public List<MangaListResponse> getPopularManga(Integer page) {
    }

    public SearchResponse searchManga(String title) {

        Manga manga = mangaRepository.findFirstByRomajiTitleIgnoreCase(title);

        if (manga == null) {
            return null;
        }

        SearchResponse response = new SearchResponse();

        response.setId(manga.getId());
        response.setAnilist_Id(manga.getAnilistId());
        response.setMalId(manga.getMalId());
        response.setRomajiTitle(manga.getRomajiTitle());
        response.setEnglishTitle(manga.getEnglishTitle());
        response.setNativeTitle(manga.getNativeTitle());

        response.setSynopsis(manga.getSynopsis());
        response.setFormat(manga.getFormat());
        response.setStatus(manga.getStatus());

        response.setChapters(manga.getChapters());

        response.setVolumes(manga.getVolumes());

        response.setPublishedFrom(manga.getPublishedFrom());

        response.setPublishedTo(manga.getPublishedTo());

        response.setAverageScore(manga.getAverageScore());
        response.setMeanScore(manga.getMeanScore());
        response.setPopularity(manga.getPopularity());
        response.setFavourites(manga.getFavourites());

        response.setCoverImage(manga.getCoverImage());

        response.setBannerImage(manga.getBannerImage());

        response.setExtraData(objectMapper.valueToTree(manga.getExtraData()));

        return response;

    }
}
