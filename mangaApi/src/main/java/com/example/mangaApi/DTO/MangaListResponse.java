package com.example.mangaApi.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MangaListResponse {

    private Integer id;
    private Integer malId;
    private String mangaName;
    private String coverImage;

}
