package content;

import java.time.Year;
import java.util.ArrayList;

public class ContentDemo {

    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("Java OOP Basics", 2024, 90, "HD"));
        items.add(new VideoLecture("Data Structures", 2023, 120, "4K"));

        items.add(new PodcastEpisode("Tech Talks", 2025, 45, "Alex"));
        items.add(new PodcastEpisode("AI Today", 2022, 60, "Maria"));

        int currentYear = Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item + " | licenseCost=" +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " + d.getMaxDownloadsPerDay());
            }

            System.out.println("--------------------------------------------------");
        }
    }
}

