package com.github.javadojo;

import java.util.List;
import static com.github.javadojo.MarsRover.LINE_SEPARATOR;


public class PathPrinter {

    private static final String STARTING_POSITION = "X";
    private static final String CURRENT_POSITION = "*";
    
    public String print(List<Direction> directions) {
        StringBuilder builder = new StringBuilder(STARTING_POSITION);
        for (int i = 1; i < directions.size(); i++) {
            builder.append(printStep(i, directions));
            
        }
        builder.append(LINE_SEPARATOR);
        return builder.toString();
    }

    private String printStep(int currentDirectionIndex, List<Direction> directions) {
        if(currentDirectionIndex == directions.size() - 1)
            return CURRENT_POSITION;
        Direction previousDirection = directions.get(currentDirectionIndex);
        return directions.get(currentDirectionIndex).print(previousDirection);
    }

}
