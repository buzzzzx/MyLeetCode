package quetions;


import java.util.HashMap;

public class LongestCommonPrefix {
    private class Node {
        boolean isKey;
        HashMap<Character, Node> childs;
        Node() {
            isKey = false;
            childs = new HashMap<>();
        }
    }

    Node root;

    public String solution(String[] str) {
        root = new Node();
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : str) {
            addString(s);
        }

        while (root.childs.size() == 1 && !root.isKey) {
            char key = (char) root.childs.keySet().toArray()[0];
            stringBuilder.append(key);
            root = root.childs.get(key);
        }

        return stringBuilder.toString();
    }

    private void addString(String s) {
        Node curr = root;

        for (int i = 0; i < s.length(); i += 1) {
            if (curr.childs.containsKey(s.charAt(i))) {
                curr = curr.childs.get(s.charAt(i));
                continue;
            }
            curr.childs.put(s.charAt(i), new Node());
            curr = curr.childs.get(s.charAt(i));
        }
        curr.isKey = true;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] input = {"flower", "alow", "dsa"};
        String actual = lcp.solution(input);
    }

}
