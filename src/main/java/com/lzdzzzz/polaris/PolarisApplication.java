package com.lzdzzzz.polaris;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class PolarisApplication {

    private static final Random random = new Random();
    private static final List<String> fortunes = Arrays.asList(
            "今日运势：大吉！宜尝试新事物，忌拖延。",
            "好事多磨，别急，未来会给你一个大惊喜。",
            "小确幸就在身边，记得抬头看看天空。",
            "难关是为了让你更强大，坚持下去！",
            "一切尽在掌握，向着目标迈进吧！",
            "若无闲事挂心头，便是人间好时节。",
            "放下昨日的烦恼，今日的阳光正好。",
            "成功的路上多尝试，每次失败都是一次进步。",
            "你所担心的，或许只是多余。",
            "行到水穷处，坐看云起时，保持一颗平常心。",
            "今天会遇见值得珍惜的人。",
            "积极心态是解决问题的最佳方式。",
            "愿你遇见的每一件事，都成为更好的你。",
            "不畏将来，不念过去，心怀感恩，顺其自然。",
            "时刻保持微笑，幸运会如期而至。"
    );

    public static void main(String[] args) {
        SpringApplication.run(PolarisApplication.class, args);

        System.out.println("✨ 本次签运：");
        System.out.println("   " + fortunes.get(random.nextInt(fortunes.size())));
        System.out.println("🌟 祝你好运！");
    }

}
