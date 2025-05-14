class ItemNode {
    String itemName;
    int itemID;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(String itemName, int itemID, int quantity, double price) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.quantity = quantity;
        this.price = price;
    }
}

class InventoryList {
    ItemNode head;


    void addAtBeginning(String itemName, int itemID, int quantity, double price) {
        ItemNode node = new ItemNode(itemName, itemID, quantity, price);
        node.next = head;
        head = node;
    }


    void addAtEnd(String itemName, int itemID, int quantity, double price) {
        ItemNode node = new ItemNode(itemName, itemID, quantity, price);
        if (head == null) {
            head = node;
            return;
        }
        ItemNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }


    void addAtPosition(String itemName, int itemID, int quantity, double price, int pos) {
        if (pos <= 1 || head == null) {
            addAtBeginning(itemName, itemID, quantity, price);
            return;
        }
        ItemNode node = new ItemNode(itemName, itemID, quantity, price);
        ItemNode current = head;
        for (int i = 1; i < pos - 1 && current.next != null; i++) {
            current = current.next;
        }
        node.next = current.next;
        current.next = node;
    }

    void removeByID(int itemID) {
        if (head == null) return;

        if (head.itemID == itemID) {
            head = head.next;
            return;
        }

        ItemNode current = head;
        while (current.next != null && current.next.itemID != itemID) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Item ID " + itemID + " not found.");
        }
    }


    void updateQuantity(int itemID, int newQuantity) {
        ItemNode current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                current.quantity = newQuantity;
                return;
            }
            current = current.next;
        }
        System.out.println("Item ID " + itemID + " not found.");
    }


    void searchByID(int itemID) {
        ItemNode current = head;
        while (current != null) {
            if (current.itemID == itemID) {
                printItem(current);
                return;
            }
            current = current.next;
        }
        System.out.println("Item ID " + itemID + " not found.");
    }

    // Search by Name
    void searchByName(String itemName) {
        ItemNode current = head;
        boolean found = false;
        while (current != null) {
            if (current.itemName.equalsIgnoreCase(itemName)) {
                printItem(current);
                found = true;
            }
            current = current.next;
        }
        if (!found) {
            System.out.println("Item Name \"" + itemName + "\" not found.");
        }
    }

    // Total Inventory Value
    double totalValue() {
        double total = 0;
        ItemNode current = head;
        while (current != null) {
            total += current.quantity * current.price;
            current = current.next;
        }
        return total;
    }

    // Display List
    void display() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        ItemNode current = head;
        while (current != null) {
            printItem(current);
            current = current.next;
        }
    }

    // Print Item Details
    void printItem(ItemNode item) {
        System.out.println(item.itemID + " -> " + item.itemName + " -> Qty: " + item.quantity + " -> ₹" + item.price);
    }

    // Sort by Name (ascending)
    void sortByNameAsc() {
        head = mergeSort(head, "name", true);
    }

    // Sort by Price (descending)
    void sortByPriceDesc() {
        head = mergeSort(head, "price", false);
    }

    // Merge Sort Helper
    ItemNode mergeSort(ItemNode head, String key, boolean ascending) {
        if (head == null || head.next == null) return head;

        ItemNode mid = getMiddle(head);
        ItemNode right = mid.next;
        mid.next = null;

        ItemNode leftSorted = mergeSort(head, key, ascending);
        ItemNode rightSorted = mergeSort(right, key, ascending);

        return merge(leftSorted, rightSorted, key, ascending);
    }

    ItemNode getMiddle(ItemNode head) {
        if (head == null) return head;
        ItemNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    ItemNode merge(ItemNode left, ItemNode right, String key, boolean ascending) {
        ItemNode dummy = new ItemNode("", 0, 0, 0);
        ItemNode current = dummy;

        while (left != null && right != null) {
            boolean condition;
            if (key.equals("name")) {
                condition = ascending ?
                        left.itemName.compareToIgnoreCase(right.itemName) <= 0 :
                        left.itemName.compareToIgnoreCase(right.itemName) > 0;
            } else {
                condition = ascending ? left.price <= right.price : left.price > right.price;
            }

            if (condition) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        current.next = (left != null) ? left : right;
        return dummy.next;
    }
}