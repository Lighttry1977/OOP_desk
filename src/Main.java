
import jobportal.Job;
import jobportal.Freelancer;
import jobportal.JobPortal;

public class Main {
    public static void main(String[] args) {
        Job job1 = new Job("Web Development", "Develop a responsive website", 1500);
        Job job2 = new Job("Graphic Design", "Create a logo and brand identity", 500);
        Job job3 = new Job("Mobile App Development", "Develop an Android app", 2000);
        Job job4 = new Job("Content Writing", "Write SEO-friendly articles", 300);
        // Создание объектов Freelancer
        Freelancer freelancer1 = new Freelancer("Dimash", "Web Development", 4.8);
        Freelancer freelancer2 = new Freelancer("Baqyt", "Graphic Design", 4.5);
        Freelancer freelancer3 = new Freelancer("Sara", "Mobile App Development", 4.9);
        Freelancer freelancer4 = new Freelancer("Diana", "Content Writing", 4.6);
        // Создание объекта JobPortal
        JobPortal portal = new JobPortal("FreelanceHub");

        // Добавление заданий и фрилансеров в портал
        portal.addJob(job1);
        portal.addJob(job2);
        portal.addJob(job3);
        portal.addJob(job4);

        portal.addFreelancer(freelancer1);
        portal.addFreelancer(freelancer2);
        portal.addFreelancer(freelancer3);
        portal.addFreelancer(freelancer4);

        // Вывод информации о каждом задании
        System.out.println("Jobs:");
        System.out.println(job1);
        System.out.println(job2);
        System.out.println(job3);
        System.out.println(job4);

        // Вывод информации о каждом фрилансере
        System.out.println("\nFreelancers:");
        System.out.println(freelancer1);
        System.out.println(freelancer2);
        System.out.println(freelancer3);
        System.out.println(freelancer4);

        // Вывод информации о портале
        System.out.println("\nJob Portal:");
        System.out.println(portal);

        // Сравнение фрилансеров
        System.out.println("\nFreelancer1 equals Freelancer2: " + freelancer1.equals(freelancer2));
        System.out.println("Freelancer3 equals Freelancer4: " + freelancer3.equals(freelancer4));
    }
}
