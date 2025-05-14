class ProcessNode {
    int processID;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime = 0;
    int turnaroundTime = 0;
    ProcessNode next;

    ProcessNode(int processID, int burstTime, int priority) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
    }
}

class RoundRobinScheduler {
    ProcessNode head, tail;

    // Add process at the end
    void addProcess(int processID, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(processID, burstTime, priority);
        if (head == null) {
            head = tail = node;
            node.next = head;
        } else {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
    }

    // Remove process by ID
    void removeProcess(int processID) {
        if (head == null) return;

        ProcessNode current = head, prev = tail;
        do {
            if (current.processID == processID) {
                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Simulate Round Robin Scheduling
    void simulate(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int time = 0;
        ProcessNode current = head;

        while (head != null) {
            System.out.println("\nRound starting at time " + time + ":");
            do {
                if (current.remainingTime > 0) {
                    System.out.print("Process " + current.processID + " executing... ");
                    if (current.remainingTime > timeQuantum) {
                        current.remainingTime -= timeQuantum;
                        time += timeQuantum;
                        System.out.println("Remaining Time: " + current.remainingTime);
                    } else {
                        time += current.remainingTime;
                        current.turnaroundTime = time;
                        current.waitingTime = current.turnaroundTime - current.burstTime;
                        current.remainingTime = 0;
                        System.out.println("Completed.");
                    }
                }
                current = current.next;
            } while (current != head);

            displayProcesses();
            removeCompletedProcesses();
        }

        System.out.println("\nAll processes completed.\n");
        displayAvgTime();
    }

    // Remove all completed processes
    void removeCompletedProcesses() {
        if (head == null) return;

        ProcessNode current = head;
        boolean allDone = true;

        do {
            if (current.remainingTime > 0) {
                allDone = false;
                break;
            }
            current = current.next;
        } while (current != head);

        if (allDone) return;

        current = head;
        ProcessNode prev = tail;
        int count = 0;

        do {
            if (current.remainingTime == 0) {
                count++;
                System.out.println("Removing completed Process ID: " + current.processID);
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                    current = head;
                    prev = tail;
                    continue;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                    break;
                } else {
                    prev.next = current.next;
                    current = current.next;
                    continue;
                }
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    // Display all processes
    void displayProcesses() {
        if (head == null) {
            System.out.println("No active processes.");
            return;
        }

        ProcessNode current = head;
        System.out.println("Current Processes:");
        do {
            System.out.println("ProcessID: " + current.processID +
                    " | Burst: " + current.burstTime +
                    " | Remaining: " + current.remainingTime +
                    " | Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }

    // Display average waiting time and turnaround time
    void displayAvgTime() {
        int totalWT = 0, totalTAT = 0, count = 0;
        ProcessNode current = head;
        if (head == null) {
            System.out.println("No process records.");
            return;
        }

        // Collect finished processes from history
        current = head;
        do {
            totalWT += current.waitingTime;
            totalTAT += current.turnaroundTime;
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Average Waiting Time: " + (double) totalWT / count);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / count);
    }
}

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // Adding processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);

        // Simulate Round Robin with time quantum = 4
        scheduler.simulate(4);
    }
}