package com.example.mangaApi.DTO;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MangaListResponse {

    private UUID id;
    private Integer malId;
    private String mangaName;
    private String coverImage;

}
