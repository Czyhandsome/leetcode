package ink.czyhandsome;

import java.util.ArrayList;
import java.util.List;

class Node {

    int value;
    Node left;
    Node right;

}

public class Question5 {

    public static void showTree(Node node) {
        List<Node> here = new ArrayList<>();
        here.add(node);
        while (!here.isEmpty()) {
            List<Node> nextLine = new ArrayList<>();
            for (Node currentLineNode : here) {
                if (currentLineNode.left != null) {
                    nextLine.add(currentLineNode.left);
                }
                if (currentLineNode.right != null) {
                    nextLine.add(currentLineNode.right);
                }
                // Print
                System.out.printf("%d ", currentLineNode.value);
            }
            // Print next line
            System.out.println();
            here = nextLine;
        }
    }

}
