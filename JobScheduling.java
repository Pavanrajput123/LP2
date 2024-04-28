import java.util.*; 
public class JobScheduling { 
 static class Job { 
 char id; 
 int deadline, profit; 
 Job(char id, int deadline, int profit) { 
 this.id = id; 
 this.deadline = deadline; 
 this.profit = profit; 
 } 
 } 
 static void jobScheduling(Job[] jobs) { 
 Arrays.sort(jobs, Comparator.comparingInt(j -> -j.profit)); 
 int maxDeadline = 0; 
  for (Job : jobs) { 
 if (job.deadline > maxDeadline) 
 maxDeadline = job.deadline; 
 } 
 char[] result = new char[maxDeadline]; 
 boolean[] slot = new boolean[maxDeadline]; 
 for (int i = 0; i < maxDeadline; i++) { 
 slot[i] = false; 
 } 
 for (int i = 0; i < jobs.length; i++) { 
 for (int j = Math.min(maxDeadline - 1, jobs[i].deadline - 1); j >= 0; j--) { 
 if (!slot[j]) { 
 result[j] = jobs[i].id; 
 slot[j] = true; 
 break; 
 } 
 } 
 } 
 System.out.println("Job Schedule:"); 
 for (char job : result) { 
 if (job != '\0') 
 System.out.print(job + " "); 
 } 
 } 
 public static void main(String[] args) { 
 Job[] jobs = { 
 new Job('a', 2, 100), 
 new Job('b', 1, 19), 
 new Job('c', 2, 27), 
 new Job('d', 1, 25), 
 new Job('e', 3, 15) 
 };
 jobScheduling(jobs); 
 }
}