package com.zy.container;

import java.util.*;

class Generator{
    private static final ArrayList<String> films = new ArrayList<String>();
    {
        Collections.addAll(films, "霸王别姬", "无名之辈",
                "活着", "让子弹飞", "疯狂的石头");
    }
    private static int idx = 0;
    public String next()
    {
        if (idx >= films.size())
        {
            idx = 0;
        }
        return films.get(idx++);
    }
    public Collection addFilms(Collection<String> c, int num)
    {
        for (int i = 0; i < num; ++i)
        {
            c.add(next());
        }

        return c;
    }
}

public class Exercise4 {
    public static void main(String[] args)
    {
        Generator gt = new Generator();
        String[] filmArr = {gt.next(), gt.next(), gt.next()};
        System.out.println(Arrays.asList(filmArr));
        System.out.println(gt.addFilms(new ArrayList<String>(), 4));
        System.out.println(gt.addFilms(new LinkedList<String>(), 4));
        System.out.println(gt.addFilms(new HashSet<String>(), 4));
        System.out.println(gt.addFilms(new LinkedHashSet<String>(), 4));
        System.out.println(gt.addFilms(new TreeSet<String>(), 4));

        LinkedList<String> lls = new LinkedList<>();
        gt.addFilms(lls, 11);
        Iterator<String> ls = lls.iterator();
        while(ls.hasNext())
        {
            String film = ls.next();
            System.out.println(film);
            ls.remove();
        }
        System.out.println("lls.size() = " + lls.size());
    }
}
