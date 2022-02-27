package com.company;


import java.util.*;

class hashTableData {
    int days;
    int score;
    int bestBefore;
    int noOfSkill;
    String nameOfSkill;
    int levelOfSkill;

    public hashTableData( int days, int score, int bestBefore, int noOfSkill) {

        this.days = days;
        this.score = score;
        this.bestBefore = bestBefore;
        this.noOfSkill = noOfSkill;
    }

    public hashTableData(String nameOfSkill, int levelOfSkill) {
        this.nameOfSkill = nameOfSkill;
        this.levelOfSkill = levelOfSkill;
    }

}

class list {
    int noOfProject;
    String projectName;
    String roleAssigned[] = new String[1000];
}

public class Mentor_And_TeamWork {
    public static void main(String args[])  {
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        int P = scanner.nextInt();

        Hashtable<String, Integer> nameOfContributorAndNoOfSkill = new Hashtable<String, Integer>();
        Hashtable<String, hashTableData> nameOfSkillAndLevel = new Hashtable<String, hashTableData>();

        for (int i = 0; i < C; i++) {
            String nameOfContibutor = scanner.next();
            int N = scanner.nextInt();
            nameOfContributorAndNoOfSkill.put(nameOfContibutor, N);

            for (int j = 0; j < N; j++) {
                String nameofSkill = scanner.next();
                int level = scanner.nextInt();
                hashTableData hashTableData = new hashTableData(nameofSkill, level);
                nameOfSkillAndLevel.put(nameOfContibutor, hashTableData);
            }
        }

        Hashtable<String, hashTableData> project_details = new Hashtable<String, hashTableData>();
        Hashtable<String, hashTableData> skillAndLevel = new Hashtable<String, hashTableData>();

        for (int i = 0; i < P; i++) {

            String nameOfProject = scanner.next();
            int day = scanner.nextInt();
            int scores = scanner.nextInt();
            int bd = scanner.nextInt();
            int role = scanner.nextInt();
            hashTableData hashTableData = new hashTableData(day, scores, bd, role);
            project_details.put(nameOfProject,hashTableData);

            for (int j = 0; j < role; j++) {
                String skills = scanner.next();
                int level = scanner.nextInt();
                hashTableData skillDiscription = new hashTableData(skills, level);
                skillAndLevel.put(nameOfProject, skillDiscription);
            }
        }



        System.out.println(nameOfContributorAndNoOfSkill);
        for (Map.Entry<String, hashTableData> entry : nameOfSkillAndLevel.entrySet()) {
            String key = entry.getKey();
            hashTableData HTD = entry.getValue();
            System.out.println(key+" "+"Details :");
            System.out.println(HTD.nameOfSkill+" "+HTD.levelOfSkill);
        }
        for (Map.Entry<String, hashTableData> entry : project_details.entrySet()) {
            String key = entry.getKey();
            hashTableData HTD = entry.getValue();
            System.out.println(key+" "+"Details :");
            System.out.println(HTD.days+" "+HTD.score+" "+HTD.bestBefore+" "+HTD.noOfSkill);
        }
        for (Map.Entry<String, hashTableData> entry : skillAndLevel.entrySet()) {
            String key = entry.getKey();
            hashTableData HTD = entry.getValue();
            System.out.println(key+" "+"Details :");
            System.out.println(HTD.nameOfSkill+" "+HTD.levelOfSkill);
        }
    }
}