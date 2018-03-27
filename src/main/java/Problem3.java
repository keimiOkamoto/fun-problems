import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public class Problem3 {

    public static void main(String[] args) {
        Node node = new Node();
        List<Integer> integers = convertStringToAsciiList("helot");
        System.out.println(integers);

        Node hello = deserialise(integers, node);
        System.out.println("should be 104   " + hello.asciiValue);
        System.out.println("should be 101   " + hello.leftChild.asciiValue);
        System.out.println("should be 108   " + hello.rightNode.asciiValue);
        System.out.println("should be 111   " + hello.rightNode.rightNode.asciiValue);
//        System.out.println("should be 111   " + hello.rightNode.rightNode.rightNode.asciiValue);
    }


    private static List<Integer> convertStringToAsciiList(String str) {
        return Arrays.stream(str.split("")).map(Problem3::convertToAsciiValues).collect(Collectors.toList());
    }

    private static int convertToAsciiValues(String character) {
        return character.charAt(0);
    }


    private static Node deserialise(List<Integer> numberList, Node root) {
        if (numberList.size() == 0) {
            return root;
        } else {
            Node node = new Node();
            node.asciiValue = numberList.get(0);

            if (root.asciiValue > node.asciiValue) {
                root.leftChild = node;
                root.rightNode = deserialise(numberList.subList(1, numberList.size()), root.leftChild);
            } else {
                root.rightNode = node;
                root.leftChild = deserialise(numberList.subList(1, numberList.size()), root.rightNode);
            }
        return node;
        }
    }

    private static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return factorial(num - 1) * num;
        }
    }

    static class Node {
        String value;
        int asciiValue;
        Node leftChild;
        Node rightNode;
    }
}

