package com.example.mangaApi.Manga;

import java.util.Map;
import java.util.UUID;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.type.SqlTypes;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "manga", indexes = @Index(name = "EngTitl_index", columnList = "english_title"))
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Manga {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(name = "anilist_id", nullable = false, unique = true)
    private Integer anilistId;

    @Column(name = "mal_id")
    private Integer malId;

    // @Column(nullable = false, unique = true)
    // private String slug;

    @Column(name = "romaji_title", nullable = false)
    private String romajiTitle;

    @Column(name = "english_title")
    private String englishTitle;

    @Column(name = "native_title")
    private String nativeTitle;

    @Column(columnDefinition = "TEXT")
    private String synopsis;

    @Column(length = 50)
    private String format;

    @Column(length = 50)
    private String status;

    private Integer chapters;

    private Integer volumes;

    @Column(name = "published_from")
    private LocalDate publishedFrom;

    @Column(name = "published_to")
    private LocalDate publishedTo;

    @Column(name = "average_score")
    private Integer averageScore;

    @Column(name = "mean_score")
    private Integer meanScore;

    private Integer popularity;

    private Integer favourites;

    @Column(name = "cover_image", columnDefinition = "TEXT")
    private String coverImage;

    @Column(name = "banner_image", columnDefinition = "TEXT")
    private String bannerImage;

    // @Column(name = "site_url", columnDefinition = "TEXT")
    // private String siteUrl;

    @JdbcTypeCode(SqlTypes.JSON)
    @Column(name = "extra_data", columnDefinition = "jsonb")
    private Map<String, Object> extraData;


    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Instant updatedAt;
}