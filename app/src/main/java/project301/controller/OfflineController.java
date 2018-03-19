package project301.controller;

import android.content.Context;


import java.util.ArrayList;

import project301.Task;
/**
 * Activities can execute offline tasks through this controller
 * @classname : OfflineController
 * @Date :   18/03/2018
 * @author : Yuqi Zhang
 * @author : Yue Ma
 * @version 1.0
 * @copyright : copyright (c) 2018 CMPUT301W18T25
 */


public class OfflineController {
    /**
     * After the app reconnect to the internet, it will try to execute previously stored offline tasks
     * @param context current context
     */

    public void tryToExecuteOfflineTasks(Context context){
        FileSystemController fileSystemController = new FileSystemController();
        ArrayList<Task> OfflineAddTasks = fileSystemController.loadOfflineAddTasksFromFile(context);
        for(Task task: OfflineAddTasks){
            String fileName = "offlineAdd-" + task.getId() + ".json";
            TaskController.addTask addTaskCtl=new TaskController.addTask();
            addTaskCtl.execute(task);
            fileSystemController.deleteFileByName(fileName,context);
        }
        ArrayList<Task> OfflineEditTasks = fileSystemController.loadOfflineEditTasksFromFile(context);
        for(Task task: OfflineEditTasks){
            String fileName = "offlineEdit-" + task.getId() + ".json";
            TaskController.requesterUpdateTask requesterUpdateTask=new TaskController.requesterUpdateTask();
            requesterUpdateTask.execute(task);
        }
    }
}
