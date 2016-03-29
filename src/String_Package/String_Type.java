package String_Package;

/**
 * Created by Bryan on 3/29/2016.
 */
public interface String_Type {

       /*
        String s = "how are you today";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        */

    //equals, charAt, concat, contains,
    //endsWith, indexOf(MyString),split
    //substring(begin,end)
    //toUpper

    @Override
    public boolean equals(Object o);

    public char charAt(int index);

    public String_Type concat(String_Type s);

    public boolean contains(String_Type s);

    public boolean endsWith(String_Type suffix);

    public int indexOf(String_Type subStr);

    public String_Type[] split(String_Type s);

    public String_Type subString(int begin, int end);

    public void toUpper();
}
