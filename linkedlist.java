import java.util.*;

public class linkedlist {

    // as head and tail are common throughout the program
    // for a particular linedlist
    // so creating global head and tail of linkedlsit
    public static node head;
    public static node tail;
    public static int size;

    // create head & tail again null when new object created
    public linkedlist() {
        head = null;
        tail = null;
        size = 0;
    }

    // creating node class for create nodes of linkedlist
    static class node {
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // creating isempty function for check linkedlist is empty or not
    public static boolean isEmpty(linkedlist ll) {
        if (ll.head == null) {
            return true;
        }
        return false;
    }

    // creating addfirst function for add a new node at first
    // or create a new linkedlist if linkedlist is empty by adding at first position
    // in a linkedlist
    public void addFirst(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    // creating addlast function in a linkedlist
    public void addLast(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = tail = newnode;
            size++;
            return;
        }
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    // creating print function for print a linkedlist
    public static void printll(linkedlist ll) {
        node track = head;
        while (track != null) {
            System.out.print(track.data);
            System.out.print("->");
            track = track.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // creating function for add in middle of linkedlist
    public void addMiddle(int data, int loc) {
        node newnode = new node(data);
        node previous = head;
        int count = 0;
        while (count != loc - 1) {
            previous = previous.next;
            count++;
        }
        newnode.next = previous.next;
        previous.next = newnode;
        size++;
    }

    // size of a linked list
    public static int size(node head) {
        if (head == null) {
            return 0;
        }
        node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // remove from linkedlist
    public int removefirst() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    // remove from last
    public int removeLast() {
        if (head == null) {
            System.out.println("linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        node temp = head;
        if (size == 1) {
            int value = temp.data;
            temp = temp.next;
            size--;
            return value;
        }
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int value = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    // function for remove a specific node
    public void remove(node item) {
        node temp = head;
        while (temp.next != null) {
            if (temp.next == item) {
                temp = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        return;
    }

    // search(iterative)
    public static int search(linkedlist ll, int key) {
        node temp = ll.head;
        int index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // search(recursively)
    public static int helper(node temp, int key, int index) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return index;
        }
        temp = temp.next;
        int value = helper(temp, key, index + 1);
        return value;
    }

    public static int searchRec(int key) {
        node temp = head;
        int index = 0;
        return helper(temp, key, index);
    }

    // reverse a linkedlist
    public void reverse(linkedlist ll) {
        if (head == null) {
            return;
        }
        if (size == 1) {
            return;
        }
        node prev = null;
        node curr = tail = head;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return;
    }

    // find snd remove nth node from end
    public int removeNthNode(int nth) {
        node curr = head;
        int index = 0;
        while (index != (size - nth) - 1) {
            curr = curr.next;
            index++;
        }
        int data = curr.next.data;
        curr.next = curr.next.next;
        size--;
        return data;
    }

    // check if linked list is palindrome
    // brute force appproach
    public void checkPalin(linkedlist ll) {
        ArrayList<Integer> arr = new ArrayList<>();
        node temp = head;
        while (temp != null) {
            arr.add(temp.data);
            temp = temp.next;
        }
        if (check(arr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean check(ArrayList<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        boolean value = true;
        while (start <= end) {
            if (arr.get(start) == arr.get(end)) {
                start++;
                end--;
            } else {
                value = false;
                return value;
            }
        }
        return value;

    }

    // by 2 pointer approach
    public boolean checkpalindrome(linkedlist ll) {
        if (head == null || head.next == null) {
            return true;
        }
        node prev = null;
        node curr = midnode(ll);
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node right = prev;
        node left = head;
        while (right != null) {
            if (left.data != right.data) {
                return false;// not a palindrome
            }
            left = left.next;
            right = right.next;
        }
        return true;// it is a palindrome
    }

    public static node midnode(linkedlist ll) {
        node slow = head;
        node fast = head;
        if ((size) % 2 == 0) {// for even size of node
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        } else {// for odd fast never become null it throws error because of jump of 2
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }

    // functiono for detect a loop or cycle
    public boolean checkCycle() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // cycle exist
            }
        }
        return false; // cycle doesn't exist
    }

    // function for remove a cycle
    public void removeCycle() {
        node slow = head;
        node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return;
        }
        slow = head;
        while (slow.next != fast.next) {
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }

    // merge sort in linkedlist
    public node mergesortll(node first) {
        if (first == null || first.next == null) {
            return first;
        }
        node mid = getmid(first);
        // making this right and left head beacuse
        // we have to break ll by mid.next
        node righthead = mid.next;
        node lefthead = first;
        mid.next = null;
        lefthead = mergesortll(lefthead);
        righthead = mergesortll(righthead);
        return merge(lefthead, righthead);
    }

    public node getmid(node first) {
        // using here fast.next.next because we want to take
        // a new previous of mid line in even case
        node slow = first;
        node fast = first;
        int size = size(first);
        if ((size) % 2 == 0) {// for even size of node
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        } else {// for odd fast never become null it throws error because of jump of 2
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }

    public node merge(node lefthead, node righthead) {
        // not creating a new ll either we are creating
        // a new node and add element in a sequence to this node
        // and return this first node .next in the end by
        // creaing this node heads of previous left and right ll
        node mergell = new node(-1);
        node temp = mergell;
        while (lefthead != null && righthead != null) {
            if (lefthead.data <= righthead.data) {
                temp.next = lefthead;
                temp = temp.next;
                lefthead = lefthead.next;
            } else {
                temp.next = righthead;
                temp = temp.next;
                righthead = righthead.next;
            }
        }
        while (lefthead != null) {
            temp.next = lefthead;
            temp = temp.next;
            lefthead = lefthead.next;
        }
        while (righthead != null) {
            temp.next = righthead;
            temp = temp.next;
            righthead = righthead.next;
        }
        return mergell.next;
    }

    // zig zag linkedlist
    public void zigzagll(node first) {
        node mid = midnode(first);
        node last = reverse(mid);
        node temp;
        while (first.next != null && last.next != null) {
            temp = first.next;
            first.next = last;
            first = temp;
            temp = last.next;
            last.next = first;
            last = temp;
        }
        return;
    }

    public static node reverse(node first) {
        if (first == null) {
            return first;
        }
        int size = size(first);
        if (size == 1) {
            return first;
        }
        node prev = null;
        node curr = first;
        node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        first = prev;
        return first;
    }

    public static node midnode(node first) {
        node slow = first;
        node fast = first;
        if ((size) % 2 == 0) {// for even size of node
            while (fast != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        } else {// for odd fast never become null it throws error because of jump of 2
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        return slow;
    }

    // add at beginning in circular linkedlist
    public void addFirstCircular(int data) {
        node temp = head;
        node newnode = new node(data);
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
        head = newnode;
        size++;
    }

    // inserting btw two nodes
    public void addinCircular(int data, int loc) {
        node temp = head;
        node newnode = new node(data);
        int pos = 0;
        while (temp.next != head) {
            if (pos == loc - 1) {
                newnode.next = temp.next;
                temp.next = newnode;
                size++;
                return;
            }
            pos++;
            temp = temp.next;
        }
    }

    // add at last in circular linkedlist
    public void addLastCircular(int data) {
        node temp = head;
        node newnode = new node(data);
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newnode;
        newnode.next = head;
        tail = newnode;
        size++;
    }

    // remove from beginning in circular linkedlist
    public void remFirstCircular() {
        head = head.next;
        tail.next = head;
        size--;
    }

    // remove from end in circular linkedlist
    public void remLastCircular() {
        node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = head;
        size--;
    }

    // remove from given in circular linkedlist
    public void remfromCircular(int loc) {
        node temp = head;
        int pos = 0;
        while (temp.next != head) {
            if (pos == loc - 1) {
                temp.next = temp.next.next;
                size--;
                return;
            }
            pos++;
            temp = temp.next;
        }
    }

    // <<<<< linkedlist questions >>>>>>

    public static void printll(node first) {
        node track = first;
        while (track != null) {
            System.out.print(track.data);
            System.out.print("->");
            track = track.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // Question 1
    // Interaction of two linked lists
    public static void interactll(node head1, node head2, int loc) {
        node temp1 = head1;
        node temp2 = head2;
        int pos = 0;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            if (pos == loc) {
                break;
            }
            pos++;
            temp1 = temp1.next;
        }
        temp2.next = temp1;
    }

    public static node findInteraction(node head1, node head2) {
        node temp = head2;
        while (head1 != null) {
            while (temp != null) {
                if (head1 == temp) {
                    return head1;
                }
                temp = temp.next;
            }
            temp = head2;
            head1 = head1.next;
        }
        return null;
    }

    // Question 2
    // delete N nodes after M nodes of a linkedlist
    public void deleteNafterM(node head1, int m, int n) {
        int M = m;
        int N = n;
        while (head1 != null) {
            while (m > 1) {
                head1 = head1.next;
                m--;
            }
            node skip = head1.next;
            if (m == 1) {
                while (n > 0) {
                    skip = skip.next;
                    n--;
                }
            }
            head1.next = skip;
            head1 = skip;
            m = M;
            n = N;
        }
    }

    // question 3
    // swapping nodes in linkedlist
    public void swappingNodes(node head1, int x, int y) {
        node prev1 = null;
        node prev2 = null;
        node temp1 = null;
        node temp2 = null;
        while (head1 != null) {
            if (head1.next.data == x) {
                prev1 = head1;
                temp1 = head1.next;
            }
            head1 = head1.next;
            if (head1.next.data == y) {
                prev2 = head1;
                temp2 = head1.next;
                prev1.next = temp2;
                temp1.next = temp2.next;
                temp2.next = prev2;
                prev2.next = temp1;
                break;
            }
        }
    }

    // Questiion 4
    // Odd even linkedlist
    public void sortOddevenLL(node head1) {
        while (head1.next!= null) {
            node temp = null;
            node skip = null;
            if ((head1.next.data) % 2 != 0) {
                skip = head1.next;
                node temp2=skip;
                while ((skip.next.data) % 2 != 0) {
                    skip=skip.next;
                    if(skip.next==null){
                        return;
                    }
                }
                temp = skip.next;
                head1.next = temp;
                skip.next = temp.next;
                skip=temp2;
                temp.next = skip;
                head1 = temp;
                continue;
            }
            head1 = head1.next;
        }
    }

    //Question5
    //merge k sorted lists
    public static node merge(ArrayList<node> arr){
        int size=arr.size();
        for(int i=0;i<size-1;i++){
            node head1=arr.get(i);
            while(head1.next!=null){
                head1=head1.next;
            }
            node head2=arr.get(i+1);
            head1.next=head2;
        }
        return arr.get(0);
    }
    public static void main(String[] args) {
        // linkedlist l1 = new linkedlist();
        // l1.addFirst(1);
        // l1.addFirst(3);
        // printll(l1);
        // printll(l1);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addFirst(0);
        // ll.addLast(3);
        // System.out.println(head.data);
        // System.out.println(tail.data);
        // printll(ll);

        // linkedlist l2 = new linkedlist();
        // l2.addFirst(2);
        // l2.addLast(4);
        // printll(l2);

        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.addMiddle(2, 1);
        // ll.addMiddle(4, 3);
        // printll(ll);
        // System.out.println(ll.size);
        // System.out.println(size(ll));

        // System.out.println(ll.removefirst());
        // System.out.println(ll.size);
        // System.out.println(ll.removeLast());
        // System.out.println(ll.size);
        // printll(ll);
        // System.out.println(ll.size);

        // ll.removeLast();
        // printll(ll);
        // System.out.println(ll.size);

        // System.out.println(search(ll, 5));
        // node temp=ll.head;
        // System.out.println(searchRec(3));
        // linkedlist ll=new linkedlist();
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(4);
        // ll.addLast(2);
        // ll.addLast(1);
        // printll(ll);
        // ll.reverse(ll);
        // printll(ll);
        // printll(ll);
        // System.out.println(ll.removeNthNode(4));
        // printll(ll);

        // ll.checkPalin(ll);
        // System.out.println(ll.checkpalindrome(ll));

        // head=new node(1);
        // head.next=new node(2);
        // head.next.next=new node(3);
        // head.next.next.next=new node(4);
        // head.next.next.next.next=head.next;
        // if(ll.checkCycle()){
        // System.out.println("true");
        // }
        // else{
        // System.out.println("false");
        // }

        // ll.removeCycle();
        // printll(ll);

        // now creating linkedlist using java collection framework
        // LinkedList<Integer> ll=new LinkedList<>();
        // ll.addFirst(1);
        // ll.addLast(2);
        // System.out.println(ll);

        // linkedlist ll = new linkedlist();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(3);
        // ll.addLast(5);
        // ll.addLast(4);
        // ll.addFirst(7);
        // ll.addLast(3);
        // printll(ll);
        // ll.head=ll.mergesortll(head);
        // printll(ll);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.printll(ll);
        // ll.zigzagll(head);
        // ll.printll(ll);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // tail.next=head;
        // ll.addFirstCircular(0);
        // ll.add(5, 2);
        // ll.remFirstCircular();
        // ll.remLastCircular();
        // ll.remfromCircular(2);
        // ll.printll(ll);

        // <<<<< linkedlist questions >>>>>>

        // Question 1
        // linkedlist ll1=new linkedlist();
        // ll1.addFirst(1);
        // ll1.addLast(2);
        // ll1.addLast(3);
        // ll1.addLast(6);
        // ll1.addLast(7);
        // node head1=ll1.head;
        // printll(head1);

        // linkedlist ll2=new linkedlist();
        // ll2.addFirst(4);
        // ll2.addLast(5);
        // node head2=ll2.head;
        // printll(head2);

        // interactll(head1, head2, 3);
        // printll(head1);
        // printll(head2);

        // linkedlist ll1=new linkedlist();
        // head=new node(1);
        // head.next=new node(2);
        // head.next.next=new node(3);
        // head.next.next.next=new node(6);
        // head.next.next.next.next=new node(7);
        // node head1=head;

        // linkedlist ll2=new linkedlist();
        // head=new node(4);
        // head.next=new node(5);
        // node head2=head;
        // head2.next.next=head1.next.next.next;
        // printll(head1);
        // printll(head2);

        // System.out.println(findInteraction(head1,head2).data);

        // linkedlist ll = new linkedlist();
        // ll.addFirst(8);
        // ll.addLast(12);
        // ll.addLast(10);
        // ll.addLast(5);
        // ll.addLast(4);
        // ll.addLast(1);
        // ll.addLast(6);
        // ll.addLast(8);
        // ll.addLast(9);
        // ll.addLast(10);
        // ll.printll(head);
        // ll.deleteNafterM(head, 3, 2);
        // ll.printll(head);
        // ll.printll(head);
        // ll.swappingNodes(head, 2, 4);
        // ll.printll(head);
        // ll.printll(head);
        // ll.sortOddevenLL(head);
        // ll.printll(head);
        ArrayList<node> arr=new ArrayList<>();

        linkedlist l1=new linkedlist();
        l1.addFirst(1);
        l1.addLast(3);
        node head1=l1.head;
        arr.add(head1);

        linkedlist l2=new linkedlist();
        l2.addFirst(6);
        l2.addLast(8);
        node head2=l2.head;
        arr.add(head2);

        linkedlist l3=new linkedlist();
        l3.addFirst(9);
        l3.addLast(10);
        node head3=l3.head;
        arr.add(head3);

        node sorthead=merge(arr);
        printll(sorthead);
    }
}
