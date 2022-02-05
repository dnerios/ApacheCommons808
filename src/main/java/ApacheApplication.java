import Util.Utils;
import jdk.jshell.execution.Util;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class ApacheApplication {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(List.of("abc","dfg","hij"));
        LinkedList<String> linkedList = new LinkedList<>(List.of("abc","dfg","hij"));
        //Map<Integer, String> map =

        Map map = new HashMap();
        map.put(1, "Teste");
        map.put(2, "200 OK");

        Queue<String> queue = new ArrayDeque<>();
        queue.add("Edy");

        //Trabalhar com Collections
        //CollectionUtils

        //Trabalhar com String
        StringUtils.isBlank(" ");
        StringUtils.isEmpty("");
        StringUtils.isAllLowerCase("aaa");
        StringUtils.upperCase("aaaaaa"); // = "AAAAAAA"
        StringUtils.lowerCase("AAAAAA"); // = "aaaaaaa"

        StringUtils.equalsIgnoreCase("aaaaaa", "AAAAAA");


        int[] arr1 = {1,2,3};
        ArrayUtils.toString(arr1);
        //ArrayUtils.isEquals();

        //Lendo arquivo com commons-io
        System.out.println(Utils.lerArquivo());
    }
}
