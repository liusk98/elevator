package com.example.elevator.model;

/**
 * 楼层
 * @author JoJo
 */
public enum FLOOR {

    /**
     * 一楼
     */
    FIRST_FLOOR(1),
    /**
     * 二楼
     */
    SECOND_FLOOR(2),
    /**
     * 三楼
     */
    THIRD_FLOOR(3),
    /**
     * 四楼
     */
    FOURTH_FLOOR(4),
    /**
     * 五楼
     */
    FIFTH_FLOOR(5),
    /**
     * 六楼
     */
    SIXTH_FLOOR(6),
    /**
     * 七楼
     */
    SEVENTH_FLOOR(7),
    /**
     * 八楼
     */
    EIGHTH_FLOOR(8),
    /**
     * 九楼
     */
    NINTH_FLOOR(9),
    /**
     * 十楼
     */
    TENTH_FLOOR(10),
    /**
     * 十一楼
     */
    ELEVENTH_FLOOR(11),
    ;

    /**
     * 楼层
     */
    private final int floor;

    FLOOR(int floor) {
        this.floor = floor;
    }

    public int getFloor() {
        return this.floor;
    }
}
