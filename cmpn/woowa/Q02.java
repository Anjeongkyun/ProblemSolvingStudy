package cmpn.woowa;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q02 {
    private static Map<String, Integer> map = new LinkedHashMap<String, Integer>();
    private static String mapKey = "";
    private static String subStr = "";
    private static int idx = 0;

    public static void main(String[] args) {
        init();
        String S =
                "my.song.aaa.mp3 11b\ngreatSonawdg.flac 1000b\nnoawdt3.txt 5b\nviawddeo.mp4 200b\ngame.exe 100b\nmovie.mkv 10000b";
        solve(S);
    }


    private static void init(){
        map.put("music", 0);
        map.put("images", 0);
        map.put("movies", 0);
        map.put("other", 0);
    }

    private static String solve(String S){
        String[] strArr = S.split("\n");

        String flag = "";
        for (String str : strArr) {
            flag = getExtension(str);
            if(str.contains("mp3")) mapReplace(str, flag);
            else if(str.contains("aac")) mapReplace(str, flag);
            else if(str.contains("flac")) mapReplace(str, flag);
            else if(str.contains("mp4")) mapReplace(str, flag);
            else if(str.contains("avi")) mapReplace(str, flag);
            else if(str.contains("mkv")) mapReplace(str, flag);
            else mapReplace(str, flag);

        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            sb.append(String.format("%s %sb", pair.getKey(), pair.getValue())).append("\n");
        }

        System.out.println(sb.toString());
        return "";
    }

    private static void mapReplace(String str, String flag){
        idx = str.indexOf(flag);
        subStr = str.substring(idx, str.length() - 1);
        mapKey = category(flag);
        int bit = parseInt(subStr, flag);
        int mapValue = map.get(mapKey) + bit;
        map.replace(mapKey, mapValue);
    }

    private static String category(String flag){
        if(flag.contains("mp3") || flag.contains("aac") || flag.contains("flac")) {
            return "music";
        }else if(flag.contains("jpg") || flag.contains("bmp") || flag.contains("gif")) {
            return "images";
        } else if (flag.contains("mp4") || flag.contains("avi") || flag.contains("mkv")) {
            return "movies";
        } else {
            return "other";
        }
    }

    private static int parseInt(String str, String flag){
        return Integer.parseInt(
                str
                        .replace(" ", "")
                        .replace(flag, "")
                        .replace("b", "")
        );
    }

    private static String getExtension(String str){
        int idx1 = str.lastIndexOf(".") + 1;
        int idx2 = str.indexOf(" ");
        return str.substring(idx1, idx2);
    }
}
