/*  Starter code of Linked data structure Lab
 *  CSIT 150 
 *  This source file contains the code for  Linkedlist
 *      and  ListElement
 *
 *  Provided by C.Anderson
 *  REVISED 11-15-15
 *
 *  Revised by S Harms
 *  April 2017
 */

/**
 *
 * @author andersoncl4
 */
public class LinkedList {

    private String label;
    private ListElement firstItem;

    public LinkedList(String name) {
        label = name;
    }

    public boolean isEmpty() {
        if (firstItem == null)
            return true;
        return false;
    }

    public boolean addElement(String newElementText) {
        ListElement newElement = new ListElement(newElementText);
        if (isEmpty()) {
            firstItem = newElement;
            return true;
        } else {
            ListElement currentElement = firstItem;
            while (currentElement.hasNext()) {
                currentElement = currentElement.getNextItem();
            }
            currentElement.setNextItem(newElement);
            return true;
        }
    }//  end add element


    public String toString() {
        return label + "\n" + firstItem.toString();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ListElement getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(ListElement firstItem) {
        this.firstItem = firstItem;
    }

    public boolean isInList(String parameter){
        if(parameter == getFirstItem().toString()){
            return true;
        }
        ListElement currentElement = firstItem;
        while(currentElement.hasNext()){
            if(parameter == currentElement.toString()){
                return true;
            }
            currentElement = currentElement.getNextItem();
        }
        return false;
    }

    public String length(){
        int counter = 0;
        String strCounter ="";
        if(getFirstItem() == null){
            return strCounter = Integer.toString(counter);
        }
        else{
            ListElement currentElement = firstItem;
            counter++;
            while(currentElement.hasNext()) {
                counter++;
                currentElement = currentElement.getNextItem();
            }
            return strCounter = Integer.toString(counter);
        }
    }

    public boolean addElementAtHead(String newElementText){
        ListElement newElement = new ListElement(newElementText);
        ListElement currentElement = firstItem;
        setFirstItem(newElement);
        firstItem.setNextItem(currentElement);
        return true;
    }

    public String pop(){
        if(firstItem==null){
            return null;
        }
        String holder =firstItem.getItemText();
        firstItem=firstItem.nextItem;
        return holder;
    }

    public boolean remove(int indexNumber){
        String holder ="";
        ListElement currentElement = firstItem;
        if(firstItem == null){
            return false;
        }
        if(indexNumber >= Integer.parseInt(length())){
           return false;
        }
        int counter = 0;
        for(int i = 0; i < indexNumber; i++){
            currentElement=currentElement.nextItem;
        }
        holder = currentElement.getItemText();
        if(indexNumber != null)
    }
// end of LinkedList class
//////////////////////////////////////////////////
//  PRIVATE CLASS  ///////////////////////////////
//////////////////////////////////////////////////

    private class ListElement {

        private String itemText;
        private ListElement nextItem;

        public ListElement(String el) {
            itemText = el;
        }

        public boolean hasNext() {
            if (nextItem == null)
                return false;
            return true;
        }

        public String toString() {
            String content = itemText;
            if (hasNext())
                content += "\n" + nextItem.toString();
            return content;
        }

        public ListElement getNextItem() {
            return nextItem;
        }

        public String getItemText() {
            return itemText;
        }

        public void setItemText(String itemText) {
            this.itemText = itemText;
        }

        public void setNextItem(ListElement nextItem) {
            this.nextItem = nextItem;
        }

    }
}
