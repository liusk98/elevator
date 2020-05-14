package com.example.elevator.model;

import com.example.elevator.enumutils.Direct;
import lombok.Data;

/**
 * 一次任务请求
 * @author JoJo
 */
@Data
public class Task {

    private String name;

    private int from;

    private int to;

    public Direct getDirect() {
        return from - to > 0 ? Direct.DOWN : Direct.UP;
    }
}
