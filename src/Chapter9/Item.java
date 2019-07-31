package Chapter9;

import org.jetbrains.annotations.Contract;

import java.util.Objects;

public class Item implements Comparable<Item>{
    private String description;
    private int partNumber;

    public Item(String aDescription, int aPartNumber)
    {
        description = aDescription;
        partNumber = aPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null) return false;
        if(getClass() != o.getClass()) return false;
        Item other = (Item) o;
        return Objects.equals(description,other.description) && partNumber == other.partNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,partNumber);
    }


    public int compareTo(Item other)
    {
        int diff = Integer.compare(partNumber,other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}
