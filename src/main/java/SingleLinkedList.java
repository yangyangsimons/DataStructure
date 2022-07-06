public class SingleLinkedList {
    //  There are two types of single linked list, with and without the head node;

    public static void main(String[] args) {

        HeroNode hero1 = new HeroNode(1);
        HeroNode hero2 = new HeroNode(2);
        HeroNode hero3 = new HeroNode(3);
        DemoSingleLinkedListNoHead link1 = new DemoSingleLinkedListNoHead();
        link1.add(hero1);
        link1.add(hero2);
        link1.add(hero3);
        System.out.println("The list is: ");
        link1.show();

//        System.out.println("---------------");
//        System.out.println("Deleted linked list:");
//        link1.delete(2);
//        link1.show();

        System.out.println("---------------");
        System.out.println("find the node:");
        System.out.println(link1.find(1));
    }
}

class DemoSingleLinkedListNoHead {
    //    Create head node
    private HeroNode head = new HeroNode(0);

    //   add node in the end of list without order;
    public void add(HeroNode node) {
        //   Head node should not be moved, so a temporary node is needed here as a pointer;
        HeroNode temp = head;
        //  An infinite loop is used in order to find the end of the list;
        while (true) {
            if (temp.next == null) {
                break;
            } else {
                temp = temp.next;
            }
        }
        //  when the loop is end means temp is reaching the end of the pointer, the node could be added;
        temp.next = node;
    }

//    Delete node：
//    link the previous node to the next node of selected node, then the selected node will be deleted.
    public void delete(int index){
//        because the head node should not be moved, so a temp node is needed here
        HeroNode temp = head;
        while(true){
            if(temp.next == null){
                System.out.println("node not found");
                break;
            }
            if(temp.next.no == index){
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

//  find the node
//    just like delete node, there should be a temp node because head should not be moved.
    public HeroNode find(int index){
        HeroNode targetNode= null;
        HeroNode temp = head;
        while(true){
            if(temp.next == null){
                System.out.println("node not exit");
                break;
            }
            if(temp.next.no == index){
                targetNode = temp.next;
                break;
            }
            temp = temp.next;
        }
        return targetNode;
    }
//  show all the list node;
    public void show(){
//        Head should not be moved, so use a temp node as pointer;
        HeroNode temp = head;
//        if the list is empty give user feedback;
        if(temp.next == null){
            System.out.println("List is empty");
        }
//        use infinite loop print all the node
        while(true){
            System.out.println(temp.next);
            temp = temp.next;
            if(temp.next == null){
                break;
            }
        }

    }
}

class HeroNode {
    public int no;
    HeroNode next = null;

    public HeroNode(int rank) {
        this.no = rank;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "rank=" + no +
                '}';
    }

}
