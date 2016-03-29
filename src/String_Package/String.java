package String_Package;

import java.lang.reflect.Array;

/**
 * Created by Bryan on 3/29/2016.
 */
public class NuString implements String_Type {

    private char[] charArr;
    private int size;

 /*   public NuString(){
        this(new char[10]);
    }
*/
    public NuString(char[] c){
        //charArr = new char[c.length()]; //why doesn't this work????

        charArr = new char[Array.getLength(c)];
        for (int i = 0; i < charArr.length ; i++) {
            charArr[i] = c[i];
        }
    }

    @Override
    public boolean equals(Object o){
        NuString other = (NuString) o;

    }

    public char charAt(int index){return charArr[index];}

    public String_Type concat(String_Type s);

    public boolean contains(String_Type s);

    public boolean endsWith(String_Type suffix);

    public int indexOf(String_Type subStr);

    public String_Type[] split(String_Type s);

    public String_Type subString(int begin, int end);

    public void toUpper();
}
