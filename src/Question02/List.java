package Question02;

public class List {
    private int maxSize;
    private int position;
    private Products[] listEntry;

    public List(int size) {
        maxSize = size;
        listEntry = new Products[maxSize];
        position = -1;
    }

    public boolean isListEmpty() {
        return (position == -1);
    }

    public boolean isListFull() {
        return (position == maxSize - 1);
    }

    public int listSize() {
        return (position + 1);
    }

    public void insertLast(Products x) {
        if (isListFull()) {
            System.out.println("Error: Attempt to insert at the end of a full list");
        } else {
            listEntry[++position] = x;
        }
    }

    public void insertList(int p, Products element) {
        if (isListFull()) {
            System.out.println("Error: Attempt to insert an entry into a full list");
        } else if (p < 0 || p > listSize()) {
            System.out.println("Error: Attempt to insert at position " + p + " which is out of bounds [0, " + listSize() + "]");
        } else {
            for (int i = listSize(); i > p; i--) {
                listEntry[i] = listEntry[i - 1];
            }
            listEntry[p] = element;
            position++;
        }
    }

    public Products deleteList(int p) {
        Products element;
        if (isListEmpty()) {
            System.out.println("Error: Attempt to delete an entry from an empty list");
            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Error: Attempt to delete position " + p + " which is not in the list [0, " + (listSize() - 1) + "]");
            return null;
        } else {
            element = listEntry[p];
            for (int i = p; i < listSize() - 1; i++) {
                listEntry[i] = listEntry[i + 1];
            }
            position--;
            return element;
        }
    }

    public Products retrieveList(int p) {
        if (isListEmpty()) {
            System.out.println("Error: Attempt to retrieve an entry from an empty list");
            return null;
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Error: Attempt to retrieve entry at position " + p + " which is not in the list [0, " + (listSize() - 1) + "]");
            return null;
        } else {
            return listEntry[p];
        }
    }

    public void replaceList(int p, Products x) {
        if (isListEmpty()) {
            System.out.println("Error: Attempt to replace an entry of an empty list");
        } else if (p < 0 || p >= listSize()) {
            System.out.println("Error: Attempt to replace entry at position " + p + " which is not in the list [0, " + (listSize() - 1) + "]");
        } else {
            listEntry[p] = x;
        }
    }

    public void traverseList() {
        if (isListEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("List: [");
        for (int i = 0; i < listSize(); i++) {
            System.out.print(listEntry[i]);
            if (i < listSize() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void clearList() {
        position = -1;
    }

    public int[] getInternalArrayCopy() {
        if (isListEmpty()) {
            return new int[0];
        }
        int[] copy = new int[listSize()];
        System.arraycopy(listEntry, 0, copy, 0, listSize());
        return copy;
    }

    public String retrieveListData(int p) {
        if (isListEmpty()) {
            System.out.println("Error: Attempt to retrieve an entry from an empty list");

        } else if (p < 0 || p >= listSize()) {
            System.out.println("Error: Attempt to retrieve entry at position " + p + " which is not in the list [0, " + (listSize() - 1) + "]");

        } else {
            return listEntry[p].toString();
        }

        return null;
    }
}