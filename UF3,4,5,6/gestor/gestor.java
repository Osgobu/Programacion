
class TaskManagement{
    public TaskManagement(){}
    public  void addTask(String taskName, String priority){}
    public void doneTask(int taskId){}
    public void deleteTask(int taskId){}
    public void printAllTask(){}
    public void printTaskByPriority(String priority){}
}
class main{
    public void main(String[] args){
        TaskManagement manager = new TaskManagement();
        manager.addTask("Aprobar Programacio", "Alta")
        manager.printAllTask();
        manager.printTaskByPriority("Alta");
        manager.doneTask(1);
        manager.printAllTask();
        manager.
    }
}