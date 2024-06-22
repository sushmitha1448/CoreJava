package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    static int numbers[] = {1,2,3,4,5,6};
    public static void main(String args[]){
        List<Site> site1 = new ArrayList<Site>();
        List<Site> site2 = new ArrayList<Site>();
        site1.add(new Site(1,"dearborn",123l,124l,"michigan"));
        site1.add(new Site(2,"farmington",125l,126l,"michigan"));
        site2.add(new Site(3,"detroit",127l,128l,"michigan"));
        site2.add(new Site(4,"auburn Hills",129l,120l,"michigan"));

        List<Project> projects = new ArrayList<Project>();
        projects.add(new Project(1,"project1","new"));
        projects.add(new Project(2,"project2","mod"));
        projects.add(new Project(3,"project3","mod"));

        List<List<Site>> sitesList = new ArrayList<List<Site>>();
        sitesList.add(site1);
        sitesList.add(site2);
        List<String> siteNames=sitesList.stream()
                .flatMap(sites->sites.stream()).map(site->site.getSiteName()+"expired").collect(Collectors.toList());
        System.out.println(siteNames);

//leetcode problem

        int multiplicationList[];
        for (int i=0;i< numbers.length;i++){
            int avoidThis=numbers[i];
            FlatMapExample.calculate(avoidThis,i);


        }


    }
     static void calculate(int avoidNumber,int arrayIndex){



    }
}
