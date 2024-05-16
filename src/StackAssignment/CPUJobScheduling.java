package StackAssignment;

import java.util.LinkedList;
import java.util.Queue;

class Job{
    int id;
    int processingTime;
    int arrivalTime;
    int waitingTime;
    int turnAroundTime;

    public Job(int id, int processingTime, int arrivalTime){
        this.id=id;
        this.processingTime=processingTime;
        this.arrivalTime=arrivalTime;
        this.waitingTime=0;
        this.turnAroundTime=0;
    }

}
public class CPUJobScheduling {

    private Queue<Job> joblist;
    int currentTime;
    public CPUJobScheduling(){
        joblist=new LinkedList<>();
        currentTime=0;
    }
    public void addJob(int processingTime){
        Job job=new Job(joblist.size()+1, processingTime, currentTime);
        joblist.add(job);
        System.out.println("Job Id "+job.id+" Processing Time "+job.processingTime);
    }
    public void process(){
        while(!joblist.isEmpty()){
            Job job=joblist.poll();
            job.waitingTime = currentTime - job.arrivalTime;
            currentTime += job.processingTime;
            job.turnAroundTime = job.waitingTime + job.processingTime;
            System.out.println("Processed Job ID: " + job.id + ", Waiting Time: " + job.waitingTime + ", Turnaround Time: " + job.turnAroundTime);
        }
    }
    public static void main(String[] args) {
        CPUJobScheduling schedule=new CPUJobScheduling();
        schedule.addJob(5);
        schedule.addJob(7);
        schedule.addJob(8);

        schedule.process();

    }
}
