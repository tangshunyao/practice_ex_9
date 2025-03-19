import java.util.Stack;
import java.util.*;
import java.util.ArrayDeque;


public class OrderLogs {
    Scanner input = new Scanner(System.in);
    ArrayDeque<String> orderLogs = new ArrayDeque<>();

public OrderLogs(){
    orderLogs = new ArrayDeque<>();
}

public void orderLogs(String log){
    orderLogs.push(log);
}

private void mostRecentLogEntry(){
     orderLogs.peek();
}

private String getOrderLog(){
   return orderLogs.pop();
}

private void removeAllLogEntries(){
    orderLogs.clear();
}

private boolean orderLogsEmpty(){
    return orderLogs.isEmpty();
}

private void displayOrderLogs(){
    for(String orderLog :orderLogs){
        System.out.println(orderLog);
    }
}

public void HandleLogs(){
    System.out.println("Choose what you want to do with order logs:\r\n" + //
                "1. Display all the logs\r\n" + //
                "2. Display the most recent logs\r\n" + //
                "3. Remove a log entry\r\n" + //
                "4. Remove all log entries\r\n" + //
                "5. Check if the log is completely empty\r\n" + //
                "Enter your choice (1 – 5)\r\n" + //
                "");
    int choice = input.nextInt();

    switch (choice) {
        case 1:
        displayOrderLogs();
        break;

        case 2:
        if(orderLogs.isEmpty()){
            System.out.println("order log is empty.");
        }else{
            mostRecentLogEntry();
        }
        break;

        case 3:
        if(orderLogs.isEmpty()){
            System.out.println("order log is empty.");
        }else{
            getOrderLog();
        }
        break;

        case 4:
        removeAllLogEntries();
        break;

        case 5:
        while(true){
            if(orderLogs.isEmpty()){
                System.out.println("The log is completely empty.");
            }else{
                System.out.println("Thelog is not completely empty;");
            }
            orderLogsEmpty();
        break;
        }
        
        default:
        System.out.println("Invalid selection, please try again.");
        break;
    }
}
}


    
