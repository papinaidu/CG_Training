import java.util.ArrayList;
import java.util.HashSet;

class UserNode {
    int userID;
    String name;
    int age;
    ArrayList<Integer> friendIDs;
    UserNode next;

    UserNode(int userID, String name, int age) {
        this.userID = userID;
        this.name = name;
        this.age = age;
        this.friendIDs = new ArrayList<>();
    }
}

class SocialMedia {
    UserNode head;


    void addUser(int userID, String name, int age) {
        UserNode user = new UserNode(userID, name, age);
        if (head == null) {
            head = user;
        } else {
            UserNode current = head;
            while (current.next != null) current = current.next;
            current.next = user;
        }
    }


    UserNode findUser(int userID) {
        UserNode current = head;
        while (current != null) {
            if (current.userID == userID) return current;
            current = current.next;
        }
        return null;
    }


    void addFriend(int userID1, int userID2) {
        UserNode user1 = findUser(userID1);
        UserNode user2 = findUser(userID2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        if (!user1.friendIDs.contains(userID2)) user1.friendIDs.add(userID2);
        if (!user2.friendIDs.contains(userID1)) user2.friendIDs.add(userID1);
    }


    void removeFriend(int userID1, int userID2) {
        UserNode user1 = findUser(userID1);
        UserNode user2 = findUser(userID2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        user1.friendIDs.remove(Integer.valueOf(userID2));
        user2.friendIDs.remove(Integer.valueOf(userID1));
    }

    void displayFriends(int userID) {
        UserNode user = findUser(userID);
        if (user == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.println("Friends of " + user.name + ":");
        for (int friendID : user.friendIDs) {
            UserNode friend = findUser(friendID);
            if (friend != null)
                System.out.println(friend.userID + " - " + friend.name + ", Age: " + friend.age);
        }
    }


    void searchUser(String name) {
        UserNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.name.equalsIgnoreCase(name)) {
                System.out.println("User found: " + current.userID + " - " + current.name + ", Age: " + current.age);
                found = true;
            }
            current = current.next;
        }
        if (!found) System.out.println("User with name '" + name + "' not found.");
    }

    void searchUser(int userID) {
        UserNode user = findUser(userID);
        if (user != null) {
            System.out.println("User found: " + user.userID + " - " + user.name + ", Age: " + user.age);
        } else {
            System.out.println("User with ID " + userID + " not found.");
        }
    }

    void countFriends() {
        UserNode current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendIDs.size() + " friend(s).");
            current = current.next;
        }
    }



    void mutualFriends(int userID1, int userID2) {
        UserNode user1 = findUser(userID1);
        UserNode user2 = findUser(userID2);
        if (user1 == null || user2 == null) {
            System.out.println("One or both users not found.");
            return;
        }

        HashSet<Integer> set = new HashSet<>(user1.friendIDs);
        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
        boolean found = false;
        for (int id : user2.friendIDs) {
            if (set.contains(id)) {
                UserNode mutual = findUser(id);
                if (mutual != null) {
                    System.out.println(mutual.userID + " - " + mutual.name);
                    found = true;
                }
            }
        }
        if (!found) System.out.println("No mutual friends.");
    }


    void displayAllUsers() {
        UserNode current = head;
        while (current != null) {
            System.out.println(current.userID + " - " + current.name + ", Age: " + current.age);
            current = current.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addUser(101, "Alice", 23);
        sm.addUser(102, "Bob", 25);
        sm.addUser(103, "Charlie", 21);
        sm.addUser(104, "David", 24);
        sm.addUser(105, "Eve", 22);

        sm.addFriend(101, 102);
        sm.addFriend(101, 103);
        sm.addFriend(102, 103);
        sm.addFriend(104, 103);
        sm.addFriend(105, 102);

        sm.displayAllUsers();
        System.out.println();

        sm.displayFriends(101);
        System.out.println();

        sm.searchUser("Charlie");
        sm.searchUser(105);
        System.out.println();

        sm.countFriends();
        System.out.println();

        sm.mutualFriends(101, 102);
        System.out.println();

        sm.removeFriend(101, 102);
        sm.displayFriends(101);
    }
}