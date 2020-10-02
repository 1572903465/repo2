package String_Editor;

public class String_Editor {
    public static String[] words = new String[20];
    public static String convert(String value) {
        StringBuffer upAfter = new StringBuffer(value.length());
        char aCharacter;
        //将tab , ; .等标点符号替换成空格
        value = value.replaceAll("[\\pP‘’“”]", " ");
        words = value.split(" ");
        for (int i = 0;i < words.length; i++)
        {
            for(int j = 0;j < words[i].length(); j++) {
                aCharacter = words[i].charAt(j);
                if (j==0) {
                    //判断是不是字母
                    if(Character.isLetter(aCharacter)) {
                        upAfter.append(Character.toUpperCase(aCharacter));
                    }
                    else {
                        upAfter.append(words[i].charAt(j));
                    }
                }
                else {
                    //如果该字符是字母切是大写字母，则转小写，否则直接连接
                    if(Character.isLetter(aCharacter) && Character.isUpperCase(aCharacter)) {
                        upAfter.append(Character.toLowerCase(aCharacter));
                    }
                    else {
                        upAfter.append(words[i].charAt(j));
                    }
                }
            }
            upAfter.append(" ");
        }
        return new String(upAfter);
    }
}
