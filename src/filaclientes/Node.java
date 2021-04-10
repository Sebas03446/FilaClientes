/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filaclientes;

/**
 *
 * @author Familia
 */
class Node {
	Object data;
	Node next;
        int length=0;
	Node(Object d) {
        data = d;
        next = null;
        length=1;
        }
        Node() {
        data = null;
        next = null;
        length=0;
        }
         public   Node insert(Node head,Object data) {
            if(head.data == null){
                head.data = data;
                length=1;
                return head;
            }else if(head.next == null){
                    Node nuevo = new Node(head.data);
                    head.next = nuevo;
                    head.data = data;
                    length +=1;
                }
            else{
                insert(head.next,data);
            }
                return head;
            }
        public Node remove(Node head){
            if(head.data == null)
                return head;
            else if(head.next == null){
                    head.data=null;
                }
            else{
                remove(head.next);
            }
                return head;
            }
        public Node get(Node head){
            if(head.data == null)
                return head;
            else if(head.next == null){
                }
            else{
                remove(head.next);
            }
                return head;
            }
} 

