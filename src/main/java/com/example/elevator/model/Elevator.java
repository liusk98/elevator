package com.example.elevator.model;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * 电梯实体类
 * @author JoJo
 */
@Data
public class Elevator implements Serializable {

    /**
     * 电梯层级
     */
    private int level;

    /**
     * 刚过去的层级
     */
    private Integer justPastLevel;

    /**
     * 当前电梯层级
     */
    private int currentLevel;

    /**
     * 下一个层级
     */
    private Integer nextLevel;

    /**
     * 运动规则 enum
     *
     */
    enum MOTION_DIRECTION{
        /**
         * 上升
         */
        UP(1),
        /**
         * 下降
         */
        DOWN(2),
        /**
         * 停止
         */
        STOP(0),
        ;

        /**
         * 动作
         */
        private final int motionDirection;

        public int getMotionDirection() {
            return this.motionDirection;
        }

        MOTION_DIRECTION(int motionDirection) {
            this.motionDirection = motionDirection;
        }

    }

}
