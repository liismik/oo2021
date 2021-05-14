import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {

    private final String[][] graph = new String[11][10];

    private String y;
    private String x;
    private List<Integer> yValue = new ArrayList<>();
    private List<Integer> xValue = new ArrayList<>();
    private int[] graphYvalues = new int[9];
    private int[] graphXvalues = new int[9];

    public Graph(String x, String y) {
        this.y = y;
        this.x = x;
    }

    public void addValues(int x, int y) {
        xValue.add(x);
        yValue.add(y);
    }

    private void getNineXY() {
        System.out.println("---------------------------------------");
        int ValueSize = yValue.size();
        int currentArrayNr = 0;
        for (int i = 0; i < 9; i++) {
            if (i < ValueSize % 10) {
                currentArrayNr += (ValueSize / 9 + 2);
                graphXvalues[i] = xValue.get(currentArrayNr);
                graphYvalues[i] = yValue.get(currentArrayNr);
            } else {
                currentArrayNr += (ValueSize / 9);
                graphXvalues[i] = xValue.get(currentArrayNr);
                graphYvalues[i] = yValue.get(currentArrayNr);
            }
        }
        // x and y arrays
        System.out.println(Arrays.toString(graphXvalues));
        System.out.println(Arrays.toString(graphYvalues));
    }

    public void GraphCreator() {
        if (yValue.size() < 10 || xValue.size() < 10) {
            throw new RuntimeException("Need more words to display graph!");
        }
        // Empty left bottom corner
        graph[9][0] = " ";
        graph[10][0] = " ";
        // From all the values recorded gets 9 of X and 9 of Y
        this.getNineXY();
        // Getting the list element length from the highest value
        int elementLength = graphXvalues[graphXvalues.length - 1];
        if (graphYvalues[graphYvalues.length - 1] > elementLength) {
            elementLength = graphXvalues[graphXvalues.length - 1];
        }
        String elementLengthString = String.valueOf(elementLength);
        elementLength = elementLengthString.length();
        // Display X values on the graph
        for (int i = 1; i < 10; i++) {
            if (String.valueOf(graphXvalues[i - 1]).length() == elementLength) {
                graph[10][i] = String.valueOf(graphXvalues[i - 1]);
            } else {

            }
            graph[10][i] = " ".repeat(elementLength - String.valueOf(graphXvalues[i - 1]).length()) + String.valueOf(graphXvalues[i - 1]);
        }
        // Borders for graph
        for (int i = 0; i < 9; i++) {
            graph[i][0] = "|";
        }
        for (int i = 1; i < 10; i++) {
            graph[9][i] = "-".repeat(elementLength);
        }
        // Fill in the empty tiles (Y data tiles)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (graph[i][j] == null) {
                    graph[i][j] = " ".repeat(elementLength);;
                }
            }
        }
        // [0][1] - [8][9] kui viimane element - esimene element on suurem kui eelmine element siis liigub üles muidu jääb samale joonele
        // first element on the lowest line
        graph[8][1] =  " ".repeat(elementLength - String.valueOf(graphYvalues[0]).length()) + graphYvalues[0];
        int xCord = 1;
        int yCord = 8;
        for (int i = 1; i < 9; i++) {
            if (graphYvalues[i] - graphYvalues[0] >= graphYvalues[i - 1] && graphYvalues[i] != 0 && graphYvalues[i] != graphYvalues[i - 1]) {
                yCord--;
            }
            xCord++;
            graph[yCord][xCord] = " ".repeat(elementLength - String.valueOf(graphYvalues[i]).length()) + graphYvalues[i];
        }

        // y text, x text + graph (THE FINAL GRAPH PRINT)
        System.out.println(y);
        for (String[] row : graph) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(" ".repeat(12 + ((elementLength + 1) * 9) - x.length()) + x);
    }
}