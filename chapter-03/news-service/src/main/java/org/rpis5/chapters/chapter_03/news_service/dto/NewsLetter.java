package org.rpis5.chapters.chapter_03.news_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import lombok.With;

import java.util.Collection;

@Data(staticConstructor = "of")
@Builder(builderClassName = "NewsLetterTemplate", builderMethodName = "template")
@AllArgsConstructor
@With
public class NewsLetter {
    private final @NonNull String title;
    private final          String recipient;
    private final @NonNull Collection<News> digest;
}