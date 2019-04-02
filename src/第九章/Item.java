package 第九章;

import java.util.Objects;

public class Item implements Comparable<Item>{
    private String decription;
    private int partNumber;

    /**
     * Constructs an item
     * @param aDescription
     * @param aPartNumber
     */
    public Item(String aDescription, int aPartNumber)
    {
        decription = aDescription;
        partNumber = aPartNumber;
    }

    public String getDecription() {
        return decription;
    }

    @Override
    public String toString() {
        return "[description=" + decription + ",partNumber=" + partNumber;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Item other = (Item) o;
        return o.equals(other.decription) && partNumber == other.partNumber;
    }

    @Override
    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber,other.partNumber);
        return diff != 0 ? diff : decription.compareTo(other.decription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decription,partNumber);
    }
}
