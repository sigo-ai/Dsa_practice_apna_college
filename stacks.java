import java.util.*;

public class stacks {

    static class stackAL {

        static ArrayList<Integer> list = new ArrayList<>();
        static int size = -1;

        public stackAL() {
            ArrayList<Integer> list = new ArrayList<>();
            size = -1;
        }

        // push function
        public void push(int data) {
            list.add(data);
            size++;
        }

        // pop function
        public int pop() {
            if (isempty()) {
                return Integer.MIN_VALUE;
            }
            int value = list.get(size);
            list.remove(size);
            size--;
            return value;
        }

        // peek function
        public int peek() {
            return list.get(size - 1);
        }

        // isempty
        public boolean isempty() {
            if (size == -1) {
                return true;
            }
            return false;
        }

        // print function
        public void print(stackAL s) {
            while (!isempty()) {
                System.out.print(s.pop() + " ");
            }
            System.out.println();
        }

        //push at bottom
        public void pushAtBottom(int data){
            if(isempty()){
                return;
            }
            int value=pop();
            pushAtBottom(data);
            if(isempty()){
                push(data);
            }
            push(value);
        }

        //function for reverse a string
        public StringBuilder revStr(String str){
            Stack<Character> s=new Stack<>();
            int i=0;
            while(i<str.length()){
                s.push(str.charAt(i));
                i++;
            }

            StringBuilder str1=new StringBuilder("");
            while(!s.empty()){
                str1.append(s.pop());
            }
            return str1;
        }
        
    }

    static class stackLL {
        // node creation
        static class node {
            int data;
            node next;

            public node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static node head;
        public static int size = -1;

        public stackLL() {
            head = null;
            size = -1;
        }

        // push function
        public void push(int data) {
            if (head == null) {
                node newnode = new node(data);
                head = newnode;
                size++;
                return;
            }
            node newnode = new node(data);
            newnode.next = head;
            head = newnode;
            size++;
        }

        // pop function
        public int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return Integer.MIN_VALUE;
            }
            int value = head.data;
            node temp = head;
            head = head.next;
            temp.next = null;
            size--;
            return value;
        }

        // peek function
        public int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return Integer.MIN_VALUE;
            }
            return head.data;
        }

        // isempty function
        public static boolean isempty() {
            if (size == -1) {
                return true;
            }
            return false;
        }

        // print function
        public void print(stackLL s) {
            while (!isempty()) {
                System.out.print(s.pop() + " ");
            }
            System.out.println();
        }

        // push at the bottom
        public void pushAtBottom(int data) {
            if(isempty()){
                return;
            }
            int value = pop();
            pushAtBottom(data);
            if (isempty()) {
                push(data);
            }
            push(value);
        }

        //function for reverse a string
        public StringBuilder revStr(String str){
            Stack<Character> s=new Stack<>();
            int i=0;
            while(i<str.length()){
                s.push(str.charAt(i));
                i++;
            }

            StringBuilder str1=new StringBuilder("");
            while(!s.empty()){
                str1.append(s.pop());
            }
            return str1;
        }

        //reverse a stack
        public void reverse(stackLL s){
            if(size==0){
                return;
            }
            int value=s.pop();
            reverse(s);
            pushAtBottom(value);
        }

        //stock span problem
        public static void stocSpan(stackLL s){
            stackLL s1=new stackLL();
            s1.push(s.pop)
        }
    }

    public static void main(String[] args) {
        // stackAL s = new stackAL();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.pop();
        // s.peek();
        // s.pushAtBottom(0);
        // s.print(s);

        // stackLL s1 = new stackLL();
        // s1.push(2);
        // s1.push(3);
        // s1.push(4);
        // s1.pop();
        // s1.peek();
        // s1.pushAtBottom(1);
        // s1.print(s1);

        // Stack<Integer> s2=new Stack<>();
        // s2.push(1);
        // s2.push(2);
        // s2.push(3);
        // s2.pop();
        // s2.peek();
        // System.out.println(s2);

        // stackLL s=new stackLL();
        // String str="aman";
        // System.out.println(s.revStr(str));
        
        // stackLL s=new stackLL();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // s.reverse(s);
        // s.print(s);

        stackLL data=new stackLL();
        data.push(80);
        data.push(60);
        data.push(70);
        data.push(60);
        data.push(85);
        data.push(100);
        data.reverse(data);
        stocSpan(data);

    }
}
