import java.util.TimerTask;

/**
 * @创建人
 * @创建时间
 * @描述
 */
public class MyTimerTask extends TimerTask {
    private String taskName;
    public MyTimerTask(String taskName){
        this.taskName = taskName;
    }
    public String getTaskName(){
        return taskName;
    }
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
    @Override
    public void run(){
        System.out.println("当前执行的任务是：" + taskName);
    }
}
