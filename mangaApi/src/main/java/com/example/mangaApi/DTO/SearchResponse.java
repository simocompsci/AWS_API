package com.example.mangaApi.DTO;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tools.jackson.databind.JsonNode;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class SearchResponse {

    private UUID id;
    private Integer anilist_Id;
    private Integer malId;
    private String romajiTitle;
    private String englishTitle;
    private String nativeTitle;
    private String synopsis;
    private String format;
    private String status;
    private Integer chapters;
    private Integer volumes;
    private LocalDate publishedFrom;
    private LocalDate publishedTo;
    private Integer averageScore;
    private Integer meanScore;
    private Integer popularity;
    private Integer favourites;
    private String coverImage;
    private String bannerImage;

    private JsonNode extraData;
    

}