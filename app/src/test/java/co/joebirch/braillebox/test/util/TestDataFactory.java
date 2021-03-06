package co.joebirch.braillebox.test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import co.joebirch.braillebox.data.model.ArticleModel;
import co.joebirch.braillebox.data.model.NewsResponse;

public class TestDataFactory {

    private static final Random sRandom = new Random();

    public static String randomUuid() {
        return UUID.randomUUID().toString();
    }

    public static int randomInt() {
        return sRandom.nextInt(200) + Integer.SIZE - 1;
    }

    public static NewsResponse makeNewsResponse() {
        NewsResponse newsResponse = new NewsResponse();
        newsResponse.source = randomUuid();
        newsResponse.articles = makeArticleModelsList(4);
        return newsResponse;
    }

    public static List<String> makeBrailleList(int count) {
        List<String> braille = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            braille.add(randomUuid());
        }
        return braille;
    }

    private static ArticleModel makeArticleModel() {
        ArticleModel articleModel = new ArticleModel();
        articleModel.author = randomUuid();
        articleModel.description = randomUuid();
        articleModel.title = randomUuid();
        return articleModel;
    }

    private static List<ArticleModel> makeArticleModelsList(int count) {
        List<ArticleModel> articleModels = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            articleModels.add(makeArticleModel());
        }
        return articleModels;
    }

}