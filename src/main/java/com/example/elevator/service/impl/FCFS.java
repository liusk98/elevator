package com.example.elevator.service.impl;

import com.example.elevator.model.Task;

import java.util.List;

public class FCFS {

    public static void exec(List<Task> taskList, int initPos) {
        System.out.println("1)先来先服务算法(FCFS):");
        System.out.format("电梯当前位于第%s层, 对如下乘客进行扫描:\n", initPos);
        for (Task task : taskList) {
            System.out.format("%d->%d ", task.getFrom(), task.getTo());
        }
        System.out.println("\n 请求次序   服务乘客    电梯移动楼层数");
        int totalTime = 0;
        int prev = initPos;
        for (int i = 0; i < taskList.size(); i++) {
            Task task = taskList.get(i);
            int abs = Math.abs(task.getFrom() - prev);
            totalTime += abs;
            int d = Math.abs(task.getFrom() - task.getTo());
            totalTime += d;
            prev = task.getTo();
            System.out.format("   %d     %s:%2d->%2d    %2d\n", i, task.getName(), task.getFrom(), task.getTo(), abs + d);
        }
        System.out.println("总移动距离：" + totalTime);
        double ave = totalTime / 1.0 / taskList.size();
        System.out.format("平均每次服务的距离: %.1f\n", ave);
    }
}
