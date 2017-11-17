package lesson.j2ee.ex4;

import java.util.HashMap;
import java.util.Map;

public class SelectedColorCounter
{
    private Map<String,Integer> counter;

    private static SelectedColorCounter ourInstance = new SelectedColorCounter();

    public static SelectedColorCounter getInstance()
    {
        return ourInstance;
    }

    private SelectedColorCounter()
    {
        counter = new HashMap<>();
        counter.put("light",0);
        counter.put("amber",0);
        counter.put("brown",0);
        counter.put("dark",0);
    }

    public Map<String, Integer> getCounter()
    {
        return counter;
    }

    public void setCounter(String color)
    {
        color = color.trim();
        int cnt = counter.get(color);
        cnt++;
        System.out.println(cnt);
        counter.put(color,cnt);
    }

    public void clear()
    {
        counter.put("light",0);
        counter.put("amber",0);
        counter.put("brown",0);
        counter.put("dark",0);
    }
}
