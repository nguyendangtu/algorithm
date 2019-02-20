package algorithm.HackerRank.dbsHackerRank;

import java.util.*;

public class AmazonTestGraph {
    public static void main(String[] args) {

        List<List<Integer>> lot = new ArrayList<>();

        /*lot.add(Arrays.asList(1, 1, 1, 1));
        lot.add(Arrays.asList(0, 1, 1, 1));
        lot.add(Arrays.asList(0, 1, 0, 1));
        lot.add(Arrays.asList(1, 1, 9, 1));
        lot.add(Arrays.asList(0, 0, 1, 1));*/

        lot.add(Arrays.asList(1, 0, 0));
        lot.add(Arrays.asList(1, 0, 0));
        lot.add(Arrays.asList(1, 9, 1));

        System.out.println(removeObstacle(lot.size(), lot.get(0).size(), lot));

    }

    static int removeObstacle(int numRows, int numColumns, List<List<Integer>> lot) {

        int totalV = numColumns * numRows;

        List<Node> nodes = new ArrayList<>();

        Graph graph = new Graph();

        for (int i = 0; i < totalV; i++) {
            Node n = new Node(i + "");
            nodes.add(n);
            graph.addNode(n);
        }

        int destVIndex = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                addEdges(i, j, lot, numColumns, numRows, nodes);
                if (lot.get(i).get(j) == 9) {
                    destVIndex = getVIndex(i, j, numColumns);
                }
            }
        }


        graph = calculateShortestPathFromSource(graph, nodes.get(0));

        return graph.getNodes().get(destVIndex).distance;
    }

    static void addEdges(int rIndex, int cIndex, List<List<Integer>> lot, int numColumns, int numRows, List<Node> nodes) {
        if (lot.get(rIndex).get(cIndex) != 0) {
            Node n = nodes.get(getVIndex(rIndex, cIndex, numColumns));
            if (rIndex > 0 && lot.get(rIndex - 1).get(cIndex) != 0) {
                n.addDestination(nodes.get(getVIndex(rIndex - 1, cIndex, numColumns)), 1);
            }
            if (rIndex + 1 < numRows && lot.get(rIndex + 1).get(cIndex) != 0) {
                n.addDestination(nodes.get(getVIndex(rIndex + 1, cIndex, numColumns)), 1);
            }
            if (cIndex > 0 && lot.get(rIndex).get(cIndex - 1) != 0) {
                n.addDestination(nodes.get(getVIndex(rIndex, cIndex - 1, numColumns)), 1);
            }
            if (cIndex + 1 < numColumns && lot.get(rIndex).get(cIndex + 1) != 0) {
                n.addDestination(nodes.get(getVIndex(rIndex, cIndex + 1, numColumns)), 1);
            }
        }
    }

    static int getVIndex(int rIndex, int cIndex, int numColumns) {
        return rIndex * numColumns + cIndex;
    }

    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
        source.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Map.Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void calculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getDistance();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {
            evaluationNode.setDistance(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);
            evaluationNode.setShortestPath(shortestPath);
        }
    }

    static class Node {

        private String name;

        private List<Node> shortestPath = new LinkedList<>();

        private Integer distance = Integer.MAX_VALUE;

        Map<Node, Integer> adjacentNodes = new HashMap<>();

        public void addDestination(Node destination, int distance) {
            adjacentNodes.put(destination, distance);
        }

        public Node(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Node> getShortestPath() {
            return shortestPath;
        }

        public void setShortestPath(List<Node> shortestPath) {
            this.shortestPath = shortestPath;
        }

        public Integer getDistance() {
            return distance;
        }

        public void setDistance(Integer distance) {
            this.distance = distance;
        }

        public Map<Node, Integer> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
            this.adjacentNodes = adjacentNodes;
        }
    }

    static class Graph {

        private List<Node> nodes = new ArrayList<>();

        public void addNode(Node nodeA) {
            nodes.add(nodeA);
        }

        public List<Node> getNodes() {
            return nodes;
        }

        public void setNodes(List<Node> nodes) {
            this.nodes = nodes;
        }
    }

}