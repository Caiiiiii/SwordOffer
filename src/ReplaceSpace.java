
/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
          String first = str.toString();
          String second = first.replaceAll("\\s+","%20");
          System.out.println(second);
          return second;
    }



    /**
问题1：替换字符串，是在原来的字符串上做替换，还是新开辟一个字符串做替换！
问题2：在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。
      从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
      从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。
*/

    public String replaceSpace1(StringBuffer str){
        int oldLength = str.length();
        int spaceNum = 0;
        for (int i=0 ; i<oldLength; i++){
            if (str.charAt(i)==' '){
                spaceNum++;
            }
        }

        int newLength = oldLength + spaceNum * 2;
        str.setLength(newLength);


        for (int j = oldLength -1, i = newLength-1 ; i>0 ; j--){
            if(str.charAt(j)!=' '){
                str.setCharAt(i,str.charAt(j));
                i--;
            }else{
                str.setCharAt(i,'0');
                str.setCharAt(i-1,'2');
                str.setCharAt(i-2,'%');
                i -= 3;
            }
        }

        return str.toString();

    }
}
