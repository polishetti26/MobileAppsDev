package com.ualr.simpletasklist.model;

import java.util.HashMap;

public class TaskList {


    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.
    HashMap<Integer, Task> tasksList = new HashMap<Integer, Task>();


    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList() {
        this.tasksList = tasksList;
    }

    public HashMap<Integer, Task> getTaskList() {
        return tasksList;
    }

    public void setTaskList(HashMap<Integer, Task> taskList) {
        this.tasksList = tasksList;
    }


    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void add(Task task){
        this.tasksList.put((this.tasksList.size()+1), task);
    } //Here we are inserting the tasks into the hashmap as values by staring with hashmap size=0, after each insertion as the hashmap size(key_value) grows we will increase the id by 1.


    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line
    public String toString(){
        String formattedString = "";
        int num = 0;
        for (int i : tasksList.keySet() ){
            num = Math.max(num,i); // we are trying to find the highest key value to know how many tasks are present.
        }

        for(int j = 1;j <= num;j++)
        {
            if (tasksList.containsKey(j))
            {
                String description = this.tasksList.get(j).getTaskDescription(); //from the hashmap we are trying to retrieve each entry and get the value(description) of it.
                formattedString = formattedString + j + " - "+ description;

                if (this.tasksList.get(j).isDone())
                {
                    formattedString += " - Done! \n";  // we are adding Done! to the description and adding a new line so that the next entry will be coming on teh next line.
                }
                else
                {
                    formattedString += "\n";  //if the task is not done we are just adding a new line.
                }
            }
        }
        return formattedString;
    }


    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void delete(Integer id){
        this.tasksList.remove(id); //if we want to delete an entry, we will be using the default remove method of the hashmap.

    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(Integer id){
        this.tasksList.get(id).setDone(true);

    }

}
