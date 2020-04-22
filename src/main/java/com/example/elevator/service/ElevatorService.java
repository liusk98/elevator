package com.example.elevator.service;

import com.example.elevator.model.Elevator;

/**
 * 电梯 Service
 * @author JoJo
 */
public interface ElevatorService {

    /**
     * 使用电梯
     * @param floor 当前楼层
     * @param direction 上或下
     * @return 返回电梯
     */
    Elevator useElevator(int floor, int direction);

}
