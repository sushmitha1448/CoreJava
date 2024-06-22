package Collections;
import Collections.Site;

import java.util.*;
import java.util.stream.Collectors;


public class Sort {
    public static void main (String[] args){

        List<Site> sites = new ArrayList<Site>();
        sites.add(new Site(1,"dearborn",123l,124l,"michigan"));
        sites.add(new Site(2,"farmington",125l,126l,"michigan"));
        sites.add(new Site(3,"detroit",127l,128l,"michigan"));
        sites.add(new Site(4,"auburn Hills",129l,120l,"michigan"));
        sites.sort(new Comparator<Site>() {
            @Override
            public int compare(Site o1, Site o2) {
                return (o1.getSiteName().compareTo(o2.getSiteName()));
            }
        });
        sites.sort(new Comparator<Site>(){
            @Override
            public int compare(Site o1,Site o2){
                return (o1.getSiteId()-o2.getSiteId());
            }
                   }

        );
       // site
        System.out.println(sites);
        sites.sort((o1, o2) -> (o1.getSiteId()-o2.getSiteId()));
        System.out.println(sites);

        List<String> newList= new LinkedList<String>();
        newList.add("banana");
        newList.add("banana");
        //newlist.add(null);
        System.out.println(newList);
        Iterator itr = newList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        Set<String> newSet = new HashSet<String>();
        newSet.add("susmitha");
        newSet.add("eluri");
        newSet.add("Tejansh");
        newSet.add("random");
        newSet.stream().filter(a->a!="random").forEach(a->System.out.println(a));

        sites.stream().filter(site->site.getSiteId()>1).forEach(System.out::println);
        sites.stream().map(site->site.getSiteName().toUpperCase()).forEach(System.out::println);
        List<Integer>lenghts=sites.stream().map(site->site.getSiteName().length()).collect(Collectors.toList());
        System.out.println(lenghts);
    }
}

