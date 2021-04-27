import java.util.HashMap;
import java.util.List;
import java.util.Map;

// There is a brick wall in front of you. The wall is rectangular and has several rows of bricks. The bricks have the same height but different width. You want to draw a vertical line from the top to the bottom and cross the least bricks.

// The brick wall is represented by a list of rows. Each row is a list of integers representing the width of each brick in this row from left to right.

// If your line go through the edge of a brick, then the brick is not considered as crossed. You need to find out how to draw the line to cross the least bricks and return the number of crossed bricks.

// You cannot draw a line just along one of the two vertical edges of the wall, in which case the line will obviously cross no bricks.
// HashTable:
class Solution {
   
        public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> count = new HashMap<>();
        
        for(List<Integer> list: wall){
            int sum = 0;
            for(int i = 0; i < list.size()-1; i++){
                sum += list.get(i);
                count.put(sum, count.getOrDefault(sum, 0)+1);
            }
        }
        
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: count.entrySet()){
            max = Math.max(max, entry.getValue());
        }
        
        return wall.size()-max;
        
    }
}
// Arrays:
class Solution {
    public int leastBricks(List<List<Integer>> wall) {
	    // 55000 is the widest wall used by the judge :-P
        int[] edges = new int[55001];

        int maxWidth = 0;
        for (List<Integer> row : wall) {
            int width = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                width += row.get(i);
                edges[width]++;
            }
            if (width > maxWidth) { maxWidth = width; }
        }
        
        int maxEdges = 0;
        for (int i = 0; i <= maxWidth; i++) {
            if (edges[i] > maxEdges) {
                maxEdges = edges[i];
            }
        }
        
        return wall.size() - maxEdges;
    }
}